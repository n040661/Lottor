package com.blueskykong.tm.common.enums;


import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;


public enum NettyMessageActionEnum {

    /**
     * Begin transaction status enum.
     */
    CREATE_GROUP(0, "创建事务组"),

    /**
     * Add transaction netty message action enum.
     */
    ADD_TRANSACTION(1, "添加事务"),

    /**
     * Commit transaction status enum.
     */
    UPDATE_TRANSACTION(2, "更新事务"),

    /**
     * Commit netty message action enum.
     */
    PRE_COMMIT(3, "预提交"),


    /**
     * Complete commit netty message action enum.
     */
    COMPLETE_COMMIT(4, "完成提交"),

    /**
     * Rollback transaction status enum.
     */
    ROLLBACK(5, "回滚"),

    /**
     * Failure transaction status enum.
     */
    FAILURE(6, "失败"),

    /**
     * Heart netty message action enum.
     */
    HEART(7, "心跳"),

    /**
     * Send netty message action enum.
     */
    SEND(8, "发送"),

    /**
     * Receive netty message action enum.
     */
    RECEIVE(9, "接收"),

    /**
     * Consume msg
     */
    CONSUMED(10, "消费"),

    /**
     * Get transaction group netty message action enum.
     */
    GET_TRANSACTION_GROUP_STATUS(11, "获取事务组状态"),


    FIND_TRANSACTION_GROUP_INFO(12, "获取事务组信息"),

    SYNC_TX_STATUS(13, "同步事务组信息"),

    GET_TRANSACTION_MSG_STATUS(14, "获取事务消息消费状态"),

    SYNC_MSG_STATUS(15, "同步事务消息状态");

    private int code;

    private String desc;

    NettyMessageActionEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    /**
     * Acquire by code netty message action enum.
     *
     * @param code the code
     * @return the netty message action enum
     */
    public static NettyMessageActionEnum acquireByCode(int code) {
        Optional<NettyMessageActionEnum> actionEnum =
                Arrays.stream(NettyMessageActionEnum.values())
                        .filter(v -> Objects.equals(v.getCode(), code))
                        .findFirst();
        return actionEnum.orElse(NettyMessageActionEnum.HEART);

    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
