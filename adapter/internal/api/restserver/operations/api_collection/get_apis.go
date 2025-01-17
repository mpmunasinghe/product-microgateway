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

package api_collection

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the generate command

import (
	"net/http"

	"github.com/go-openapi/runtime/middleware"

	"github.com/wso2/adapter/internal/api/models"
)

// GetApisHandlerFunc turns a function with the right signature into a get apis handler
type GetApisHandlerFunc func(GetApisParams, *models.Principal) middleware.Responder

// Handle executing the request and returning a response
func (fn GetApisHandlerFunc) Handle(params GetApisParams, principal *models.Principal) middleware.Responder {
	return fn(params, principal)
}

// GetApisHandler interface for that can handle valid get apis params
type GetApisHandler interface {
	Handle(GetApisParams, *models.Principal) middleware.Responder
}

// NewGetApis creates a new http.Handler for the get apis operation
func NewGetApis(ctx *middleware.Context, handler GetApisHandler) *GetApis {
	return &GetApis{Context: ctx, Handler: handler}
}

/* GetApis swagger:route GET /apis API (Collection) getApis

Get a list of API metadata

This operation can be used to retrieve meta info about all APIs


*/
type GetApis struct {
	Context *middleware.Context
	Handler GetApisHandler
}

func (o *GetApis) ServeHTTP(rw http.ResponseWriter, r *http.Request) {
	route, rCtx, _ := o.Context.RouteInfo(r)
	if rCtx != nil {
		r = rCtx
	}
	var Params = NewGetApisParams()
	uprinc, aCtx, err := o.Context.Authorize(r, route)
	if err != nil {
		o.Context.Respond(rw, r, route.Produces, route, err)
		return
	}
	if aCtx != nil {
		r = aCtx
	}
	var principal *models.Principal
	if uprinc != nil {
		principal = uprinc.(*models.Principal) // this is really a models.Principal, I promise
	}

	if err := o.Context.BindValidRequest(r, route, &Params); err != nil { // bind params
		o.Context.Respond(rw, r, route.Produces, route, err)
		return
	}

	res := o.Handler.Handle(Params, principal) // actually handle the request
	o.Context.Respond(rw, r, route.Produces, route, res)

}
