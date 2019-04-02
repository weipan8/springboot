package com.test.model;


/**
 * @author liwq
 * @ClassName: ErrorCode.java
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @date: 2019年2月28日 上午11:04:40
 */
public enum ErrorCode {

    // 结果
    SUCCESS("0000", "请求成功"),
    EMPTY("0001", "没有查询到数据"),
    UNKNOWN("0002", "OOPS,数据异常，请稍后再试！"),
    //架构验证
    //token无效
    NO_AUTH("8001", "账号异常，请重新登陆"),
    //token已过期
    TOKEN_TIMEOUT("8002", "您已下线，请重新登录"),
    EMPTY_TOKEN("8003", "token为空"),
    TOKEN_EMPTY("8004", "推送设备为空"),
    PUSH_MESSAGE_EMPTY("8005", "推送消息为空"),
    REDIS_ERR("8006", "系统正在维护,请耐心等待!"),
    NOTICE_TOKEN_ERROR("8007", "推送设备号异常,请联系管理员"),
    PHONE_IMEI_ERROR("8008", "获取手机IMEI号为空"),
    //登录注册
    UNKNOWN_ACCOUNT("1001", "未知帐号"),
    ACCOUNT_LOCKED("1002", "帐号已锁定"),
    ACCOUNT_OR_PASSWORD_INCORRENT("1003", "帐号或密码错误"),
    ACCOUNT_OR_PASSWORD_ERROR_MAX("1004", "帐号或密码错误次数过多"),
    NO_REGIST("1005", "请先注册或验证码登录"),
    SEND_CODE("1006", "请核对手机号是否正确，若正确请重新获取验证码"),

    USERNAME_EMPTY("1007", "用户名为空"),
    USER_NAME_INVALID("1008", "用户名非法"),
    VERIFICATION_EMPTY("1009", "验证码为空"),
    USER_EXIST("1010", "用户已注册"),
    PARAMS_INVALID("1011", "参数不合法"),
    PHONE_INVALID("1012", "手机号不合法"),
    PASSWORD_EMPTY("1013", "密码为空请重新输入"),
    VERIFICATION_INVALID("1014", "验证码无效"),

    PARAM_NOTFULL("1017", "参数不完整"),
    COMPANYORG_NOTFULL("1018", "该部门不存在"),
    UNKNOW("9999", "oops，貌似出了点小问题，稍后再试一下吧。"),

    PARAMS_EMPTY("1015", "参数为空"),
    OPERATE_FAIL("1016", "操作失败"),

    REGISTER_FAIL("1017", "注册失败，请稍后再试"),
    GENERATOR_CODE_FAIL("1018", "验证码发送失败，请稍后再试"),
    MODIFICATION_FAIL("1019", "修改失败，请稍后再试"),
    SUPER_ADMIN_NOT_CHANGE("1020", "超级管理员的权限不可变更"),
    REQUEST_HEAD("1021", "请求头信息缺失"),
    PLAFT_FORM_EMPTY("1022", "平台信息为空"),

    COMPANY_ISNULL("5001", "不存在此企业"),
    USER_INCOMPANY("5002", "用户已经存在当前公司"),


    DEL_FAIL("1023", "不能删除"),


    COMPANY_DATA_E("5005", "公司数据异常[部门]"),
    NO_JOIN_COMPANY("5008", "没有加入公司的申请"),
    JOIN_COMPANY_AGIN("5009", "已经提交过申请加入该企业"),
    //超级会议室
    TIME_SE("2000", "时间错误，开始时间小于结束时间"),
    ILLEGAL_USERS("1029", "非法用户，无效用户"),
    SMR_MEETINGROOM_NOT_EXIT("2001", "会议室不存在"),
    SMR_MEETINGROOM_BOOK_NOT_EXIST("2002", "会议室日程不存在或被删除"),
    SMR_MEETINGROOM_ORDER_NOT_EXIST("2003", "会议室订单不存在或被删除"),
    SMR_ORDER_CURRENT_TIME_ILLRGAL("2004", "会议已结束或还未开始 暂不符合要求，无法提前结束"),
    SMR_MEETINGROOM_RESERVE_TIMEOUT("2005", "抱歉，该时间段内已经被预定， 请选择其他时间段。"),
    SMR_MEETING_ALTERLY_START_NO_CANCAL("2006", "会议已开始或结束,暂无法取消会议"),
    SMR_MEETING_ALTERLY_START_NO_JOIN("2007", "会议已开始或结束，无法加入会议"),
    SMR_MEETING_ALTERLY_START_NO_REJECT("2008", "会议已经开始或结束，无法拒绝加入会议"),
    SMR_MEETING_PROCESS_NO_EXIST("2009", "会议议程不存在或者已经被删除！！"),
    SMR_MEETING_BOOKING_NO_EXIST("2010", "预订会议室的时间参数不存在"),
    SMR_MEETINGROOM_RESERVE_TIME_ERROR("2011", "预订会议室的时间错误"),
    SMR_MEETINGROOM_SUBJECT_EXIST("2012", "会议室主题为空"),

    CLOSE_FAIL("1024", "无法关闭"),
    CLOSEALL_FAIL("1025", "无法永久关闭"),
    PWD_ERROR("1026", "两次密码输入不一致，请重新输入"),
    USER_NOT_EXIST("1027", "用户不存在"),
    NO_CHARGEBACK("1028", "不可退单"),
    NO_EMSINFO("5010", "不存在改消息"),
    NO_EMS_OFAPPLY("5011", "不是请求类型的消息"),
    DATA_EMS_ERROE("5012", "消息数据异常"),
    JOIN_COM_ERROR("5013", "用户已撤回或已审核"),
    USER_ID_EMPTY("5014", "userId为空"),
    WX_Bind_ERROR("5015", "绑定失败，请重试"),
    UPLOAD_FILE_ERROR("5016", "上传文件不合法"),
    BATCH_ADD_ERROR("5017", "批量添加失败,请重试"),

    MEETING_DATA_ERR("5552", "会议数据异常"),

    COMPANY_ID_EMPTY("5018", "公司id为空"),
    BATCH_ADD_EXITST("5019", "需要添加的人员已全部存在"),
    FILE_FORMAT_ERROR("5020", "附件格式不合法"),
    DEL_ERROR("5021", "删除失败,请重试"),
    COMPANY_ORG_USER_ERR("58858", "员工所在部门数据异常"),
    MEETING_FILE_SIZE_ERR("58859", "会议文件只能上传20个"),
    USER_ALREADY_ADMINISTRATOR("5022", "用户已经是管理员");


    private String status;
    private String message;

    ErrorCode(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage(String[] args) {
        int index = 0;
        String tempMsg = message;
        for (String arg : args) {
            tempMsg = tempMsg.replace("{" + index++ + "}", arg);
        }
        return tempMsg;
    }

}
