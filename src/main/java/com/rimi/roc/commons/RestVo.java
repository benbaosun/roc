package com.rimi.roc.commons;

/**
 * @author 惜-梦
 * @description 数据集
 * @date 2019-02-21 15:55
 */
public class RestVo {
    private int code = 200;
    private String msg="";
    private Object data;

    public enum Error{
        REQUEST_ERROR(404,"请求异常"),
        SERVER_ERROR(500,"服务器异常"),
        PARAM_ERROR(402,"请求参数异常"),
        METHOD_ERROR(401,"请求类型异常");

        private int code;
        private String msg;

       Error(int code,String msg){
            this.code=code;
            this.msg=msg;
        }


        public void setCode(int code) {
            this.code = code;

        }

        public void setMsg(String msg) {
            this.msg = msg;

        }
        }

        public static class Builder{
            private RestVo vo = new RestVo();

            public Builder code(int code){
                vo.code = code;
                return this;
            }
            public Builder msg(String msg){
                vo.msg = msg;
                return this;
            }
            public Builder data(Object o){
                vo.data = o;
                return this;
            }
            public Builder error(Error error){
                vo.code = error.code;
                vo.msg = error.msg;
                return this;
            }
            public Builder success(){
                vo.code = 200;
                vo.msg = "操作成功";
                return this;
            }

            public RestVo build(){
                return  vo;
            }

        }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData(){
        return data;
    }
}
