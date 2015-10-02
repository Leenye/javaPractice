package com.practice.designPattern.builerPattern.ex2;

public class Robert {
    private String name;
    private String id;
    private String detailInfo;

    public Robert(Builder builder) {
        name = builder.name;
        id = builder.id;
        detailInfo = builder.detailInfo;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public static class Builder {
        private String name;
        private String id ;
        private String detailInfo;

        public Builder (String name){
            this.name = name;
        }

        public Builder id(String input){
            id = input;
            return this;
        }

        public Builder detailInfo(String input){
            detailInfo = input;
            return this;
        }

        public Robert build(){
            return new Robert(this);
        }

    }
}
