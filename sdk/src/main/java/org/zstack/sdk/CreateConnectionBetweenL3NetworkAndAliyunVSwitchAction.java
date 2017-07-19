package org.zstack.sdk;

import java.util.HashMap;
import java.util.Map;

public class CreateConnectionBetweenL3NetworkAndAliyunVSwitchAction extends AbstractAction {

    private static final HashMap<String, Parameter> parameterMap = new HashMap<>();

    public static class Result {
        public ErrorCode error;
        public CreateConnectionBetweenL3NetworkAndAliyunVSwitchResult value;

        public Result throwExceptionIfError() {
            if (error != null) {
                throw new ApiException(
                    String.format("error[code: %s, description: %s, details: %s]", error.code, error.description, error.details)
                );
            }
            
            return this;
        }
    }

    @Param(required = true, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String l3networkUuid;

    @Param(required = true, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String vSwitchUuid;

    @Param(required = true, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String vpcRiuuid;

    @Param(required = true, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String vbrRiUuid;

    @Param(required = true, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String vbrUuid;

    @Param(required = true, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String cpeIp;

    @Param(required = true, maxLength = 128, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String name;

    @Param(required = false, maxLength = 1024, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String description;

    @Param(required = true, validValues = {"in","out","both"}, nonempty = false, nullElements = false, emptyString = true, noTrim = false)
    public java.lang.String direction;

    @Param(required = false)
    public java.lang.String resourceUuid;

    @Param(required = false)
    public java.util.List systemTags;

    @Param(required = false)
    public java.util.List userTags;

    @Param(required = true)
    public String sessionId;

    public long timeout;
    
    public long pollingInterval;


    private Result makeResult(ApiResult res) {
        Result ret = new Result();
        if (res.error != null) {
            ret.error = res.error;
            return ret;
        }
        
        CreateConnectionBetweenL3NetworkAndAliyunVSwitchResult value = res.getResult(CreateConnectionBetweenL3NetworkAndAliyunVSwitchResult.class);
        ret.value = value == null ? new CreateConnectionBetweenL3NetworkAndAliyunVSwitchResult() : value; 

        return ret;
    }

    public Result call() {
        ApiResult res = ZSClient.call(this);
        return makeResult(res);
    }

    public void call(final Completion<Result> completion) {
        ZSClient.call(this, new InternalCompletion() {
            @Override
            public void complete(ApiResult res) {
                completion.complete(makeResult(res));
            }
        });
    }

    Map<String, Parameter> getParameterMap() {
        return parameterMap;
    }

    RestInfo getRestInfo() {
        RestInfo info = new RestInfo();
        info.httpMethod = "POST";
        info.path = "/hybrid/aliyun/connections";
        info.needSession = true;
        info.needPoll = true;
        info.parameterName = "params";
        return info;
    }

}
