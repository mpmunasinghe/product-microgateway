/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

// Package utills holds the implementation for common utility functions
package utills

import (
	"bytes"
	"encoding/json"

	// TODO: (VirajSalaka) remove outdated dependency
	"unicode"

	"github.com/ghodss/yaml"
	logger "github.com/wso2/adapter/loggers"
)

// ToJSON converts a single YAML document into a JSON document
// or returns an error. If the document appears to be JSON the
// YAML decoding path is not used.
// If the input file is json, it would be returned as it is.
func ToJSON(data []byte) ([]byte, error) {
	if hasJSONPrefix(data) {
		return data, nil
	}
	return yaml.YAMLToJSON(data)
}

var jsonPrefix = []byte("{")

func hasJSONPrefix(buf []byte) bool {
	return hasPrefix(buf, jsonPrefix)
}

func hasPrefix(buf []byte, prefix []byte) bool {
	trim := bytes.TrimLeftFunc(buf, unicode.IsSpace)
	return bytes.HasPrefix(trim, prefix)
}

// FindSwaggerVersion finds the openapi version ("2" or "3") for the given
// openAPI json content.
func FindSwaggerVersion(jsn []byte) string {
	var version string = "2"
	var result map[string]interface{}

	err := json.Unmarshal(jsn, &result)
	if err != nil {
		logger.LoggerOasparser.Error("json unmarsheliing err when finding the swaggerVersion : ", err)
	}

	if _, ok := result["swagger"]; ok {
		version = "2"
	} else if _, ok := result["openapi"]; ok {
		version = "3"
	} else {
		logger.LoggerOasparser.Warn("swagger file version is not defined. Default version set as to 2 ")
		return version

	}
	return version
}
