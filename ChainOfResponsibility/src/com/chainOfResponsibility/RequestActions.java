package com.chainOfResponsibility;

public abstract class RequestActions {
    private RequestOptions requestOptions;

    protected RequestOptions getRequestOptions() {
        return requestOptions;
    }

    protected void setRequestOptions(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public abstract void fulfillRequest(RequestActions action);

}
