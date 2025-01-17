// Code generated by go-swagger; DO NOT EDIT.

// Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package api_individual

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"net/http"

	"github.com/go-openapi/runtime"

	"github.com/wso2/adapter/internal/api/models"
)

// PostApisOKCode is the HTTP code returned for type PostApisOK
const PostApisOKCode int = 200

/*PostApisOK Successful.
API deployed or updated Successfully.


swagger:response postApisOK
*/
type PostApisOK struct {

	/*
	  In: Body
	*/
	Payload *models.DeployResponse `json:"body,omitempty"`
}

// NewPostApisOK creates PostApisOK with default headers values
func NewPostApisOK() *PostApisOK {

	return &PostApisOK{}
}

// WithPayload adds the payload to the post apis o k response
func (o *PostApisOK) WithPayload(payload *models.DeployResponse) *PostApisOK {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the post apis o k response
func (o *PostApisOK) SetPayload(payload *models.DeployResponse) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *PostApisOK) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(200)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}

// PostApisUnauthorizedCode is the HTTP code returned for type PostApisUnauthorized
const PostApisUnauthorizedCode int = 401

/*PostApisUnauthorized Unauthorized. Invalid authentication credentials.

swagger:response postApisUnauthorized
*/
type PostApisUnauthorized struct {

	/*
	  In: Body
	*/
	Payload *models.Error `json:"body,omitempty"`
}

// NewPostApisUnauthorized creates PostApisUnauthorized with default headers values
func NewPostApisUnauthorized() *PostApisUnauthorized {

	return &PostApisUnauthorized{}
}

// WithPayload adds the payload to the post apis unauthorized response
func (o *PostApisUnauthorized) WithPayload(payload *models.Error) *PostApisUnauthorized {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the post apis unauthorized response
func (o *PostApisUnauthorized) SetPayload(payload *models.Error) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *PostApisUnauthorized) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(401)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}

// PostApisConflictCode is the HTTP code returned for type PostApisConflict
const PostApisConflictCode int = 409

/*PostApisConflict Conflict.
API to import already exists (when overwride parameter is not included).


swagger:response postApisConflict
*/
type PostApisConflict struct {

	/*
	  In: Body
	*/
	Payload *models.Error `json:"body,omitempty"`
}

// NewPostApisConflict creates PostApisConflict with default headers values
func NewPostApisConflict() *PostApisConflict {

	return &PostApisConflict{}
}

// WithPayload adds the payload to the post apis conflict response
func (o *PostApisConflict) WithPayload(payload *models.Error) *PostApisConflict {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the post apis conflict response
func (o *PostApisConflict) SetPayload(payload *models.Error) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *PostApisConflict) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(409)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}

// PostApisInternalServerErrorCode is the HTTP code returned for type PostApisInternalServerError
const PostApisInternalServerErrorCode int = 500

/*PostApisInternalServerError Internal Server Error.

swagger:response postApisInternalServerError
*/
type PostApisInternalServerError struct {

	/*
	  In: Body
	*/
	Payload *models.Error `json:"body,omitempty"`
}

// NewPostApisInternalServerError creates PostApisInternalServerError with default headers values
func NewPostApisInternalServerError() *PostApisInternalServerError {

	return &PostApisInternalServerError{}
}

// WithPayload adds the payload to the post apis internal server error response
func (o *PostApisInternalServerError) WithPayload(payload *models.Error) *PostApisInternalServerError {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the post apis internal server error response
func (o *PostApisInternalServerError) SetPayload(payload *models.Error) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *PostApisInternalServerError) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(500)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}
