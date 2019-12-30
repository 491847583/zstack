package org.zstack.header.identity;

/**
 */
public enum IdentityErrors {
    AUTHENTICATION_ERROR(1000),
    INVALID_SESSION(1001),
    PERMISSION_DENIED(1002),
    QUOTA_EXCEEDING(1003),
    QUOTA_INVALID_OP(1004),
    NEED_CHANGE_PASSWORD(1005),
    MAX_CONCURRENT_SESSION_EXCEEDED(1006);

    private String code;

    private IdentityErrors(int id) {
        code = String.format("ID.%s", id);
    }

    @Override
    public String toString() {
        return code;
    }
}
