package bean;

public enum EmpStatus{
    WORKING(100, "工作中"),
    MEETING(200, "开会中"),
    VOCATION(300, "休假中");

    private Integer code;
    private String msg;
    private EmpStatus(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static EmpStatus getStatusByCode(int code){
        switch (code){
            case 100:
                return WORKING;
            case 200:
                return MEETING;
            case 300:
                return VOCATION;
            default:
                return null;
        }
    }
}
