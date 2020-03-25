package org.zstack.header.longjob;

import org.zstack.header.core.ReturnValueCompletion;
import org.zstack.header.errorcode.ErrorCode;
import org.zstack.header.errorcode.SysErrors;
import org.zstack.header.message.APIEvent;

/**
 * Created by GuoYi on 11/24/17.
 */
public interface LongJob {
    void start(LongJobVO job, ReturnValueCompletion<APIEvent> completion);
    void cancel(LongJobVO job, ReturnValueCompletion<Boolean> completion);
    default void resume(LongJobVO job) {
        job.setJobResult(new ErrorCode(SysErrors.INTERNAL.toString(), "", "Failed because management node restarted."));
        job.setState(LongJobState.Failed);
    }
    default Class getAuditType() {
        return null;
    }
    default String getAuditResourceUuid() {
        return null;
    }
}
