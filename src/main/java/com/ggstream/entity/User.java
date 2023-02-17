package com.ggstream.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*  用户实体
*  @author huangjiahua
*/
public class User implements Serializable {

    private static final long serialVersionUID = 1676604597307L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 编号
    * isNullAble:0
    */
    private String userCode;

    /**
    * 钱包
    * isNullAble:1
    */
    private String walletCode;

    /**
    * 创建时间
    * isNullAble:1
    */
    private String createTime;

    /**
    * 用户类型，暂定0为客户用户
    * isNullAble:1
    */
    private Integer type;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setUserCode(String userCode){this.userCode = userCode;}

    public String getUserCode(){return this.userCode;}

    public void setWalletCode(String walletCode){this.walletCode = walletCode;}

    public String getWalletCode(){return this.walletCode;}

    public void setCreateTime(String createTime){this.createTime = createTime;}

    public String getCreateTime(){return this.createTime;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "userCode='" + userCode + '\'' +
                "walletCode='" + walletCode + '\'' +
                "createTime='" + createTime + '\'' +
                "type='" + type + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends User{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> userCodeList;

        public List<String> getUserCodeList(){return this.userCodeList;}


        private List<String> fuzzyUserCode;

        public List<String> getFuzzyUserCode(){return this.fuzzyUserCode;}

        private List<String> rightFuzzyUserCode;

        public List<String> getRightFuzzyUserCode(){return this.rightFuzzyUserCode;}
        private List<String> walletCodeList;

        public List<String> getWalletCodeList(){return this.walletCodeList;}


        private List<String> fuzzyWalletCode;

        public List<String> getFuzzyWalletCode(){return this.fuzzyWalletCode;}

        private List<String> rightFuzzyWalletCode;

        public List<String> getRightFuzzyWalletCode(){return this.rightFuzzyWalletCode;}
        private List<String> createTimeList;

        public List<String> getCreateTimeList(){return this.createTimeList;}


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){return this.fuzzyCreateTime;}

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){return this.rightFuzzyCreateTime;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyUserCode (List<String> fuzzyUserCode){
            this.fuzzyUserCode = fuzzyUserCode;
            return this;
        }

        public QueryBuilder fuzzyUserCode (String ... fuzzyUserCode){
            this.fuzzyUserCode = solveNullList(fuzzyUserCode);
            return this;
        }

        public QueryBuilder rightFuzzyUserCode (List<String> rightFuzzyUserCode){
            this.rightFuzzyUserCode = rightFuzzyUserCode;
            return this;
        }

        public QueryBuilder rightFuzzyUserCode (String ... rightFuzzyUserCode){
            this.rightFuzzyUserCode = solveNullList(rightFuzzyUserCode);
            return this;
        }

        public QueryBuilder userCode(String userCode){
            setUserCode(userCode);
            return this;
        }

        public QueryBuilder userCodeList(String ... userCode){
            this.userCodeList = solveNullList(userCode);
            return this;
        }

        public QueryBuilder userCodeList(List<String> userCode){
            this.userCodeList = userCode;
            return this;
        }

        public QueryBuilder fetchUserCode(){
            setFetchFields("fetchFields","userCode");
            return this;
        }

        public QueryBuilder excludeUserCode(){
            setFetchFields("excludeFields","userCode");
            return this;
        }

        public QueryBuilder fuzzyWalletCode (List<String> fuzzyWalletCode){
            this.fuzzyWalletCode = fuzzyWalletCode;
            return this;
        }

        public QueryBuilder fuzzyWalletCode (String ... fuzzyWalletCode){
            this.fuzzyWalletCode = solveNullList(fuzzyWalletCode);
            return this;
        }

        public QueryBuilder rightFuzzyWalletCode (List<String> rightFuzzyWalletCode){
            this.rightFuzzyWalletCode = rightFuzzyWalletCode;
            return this;
        }

        public QueryBuilder rightFuzzyWalletCode (String ... rightFuzzyWalletCode){
            this.rightFuzzyWalletCode = solveNullList(rightFuzzyWalletCode);
            return this;
        }

        public QueryBuilder walletCode(String walletCode){
            setWalletCode(walletCode);
            return this;
        }

        public QueryBuilder walletCodeList(String ... walletCode){
            this.walletCodeList = solveNullList(walletCode);
            return this;
        }

        public QueryBuilder walletCodeList(List<String> walletCode){
            this.walletCodeList = walletCode;
            return this;
        }

        public QueryBuilder fetchWalletCode(){
            setFetchFields("fetchFields","walletCode");
            return this;
        }

        public QueryBuilder excludeWalletCode(){
            setFetchFields("excludeFields","walletCode");
            return this;
        }

        public QueryBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public QueryBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            this.fuzzyCreateTime = solveNullList(fuzzyCreateTime);
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = solveNullList(rightFuzzyCreateTime);
            return this;
        }

        public QueryBuilder createTime(String createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(String ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> userCodeList;

        public List<String> getUserCodeList(){return this.userCodeList;}


        private List<String> fuzzyUserCode;

        public List<String> getFuzzyUserCode(){return this.fuzzyUserCode;}

        private List<String> rightFuzzyUserCode;

        public List<String> getRightFuzzyUserCode(){return this.rightFuzzyUserCode;}
        private List<String> walletCodeList;

        public List<String> getWalletCodeList(){return this.walletCodeList;}


        private List<String> fuzzyWalletCode;

        public List<String> getFuzzyWalletCode(){return this.fuzzyWalletCode;}

        private List<String> rightFuzzyWalletCode;

        public List<String> getRightFuzzyWalletCode(){return this.rightFuzzyWalletCode;}
        private List<String> createTimeList;

        public List<String> getCreateTimeList(){return this.createTimeList;}


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){return this.fuzzyCreateTime;}

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){return this.rightFuzzyCreateTime;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyUserCode (List<String> fuzzyUserCode){
            this.fuzzyUserCode = fuzzyUserCode;
            return this;
        }

        public ConditionBuilder fuzzyUserCode (String ... fuzzyUserCode){
            this.fuzzyUserCode = solveNullList(fuzzyUserCode);
            return this;
        }

        public ConditionBuilder rightFuzzyUserCode (List<String> rightFuzzyUserCode){
            this.rightFuzzyUserCode = rightFuzzyUserCode;
            return this;
        }

        public ConditionBuilder rightFuzzyUserCode (String ... rightFuzzyUserCode){
            this.rightFuzzyUserCode = solveNullList(rightFuzzyUserCode);
            return this;
        }

        public ConditionBuilder userCodeList(String ... userCode){
            this.userCodeList = solveNullList(userCode);
            return this;
        }

        public ConditionBuilder userCodeList(List<String> userCode){
            this.userCodeList = userCode;
            return this;
        }

        public ConditionBuilder fuzzyWalletCode (List<String> fuzzyWalletCode){
            this.fuzzyWalletCode = fuzzyWalletCode;
            return this;
        }

        public ConditionBuilder fuzzyWalletCode (String ... fuzzyWalletCode){
            this.fuzzyWalletCode = solveNullList(fuzzyWalletCode);
            return this;
        }

        public ConditionBuilder rightFuzzyWalletCode (List<String> rightFuzzyWalletCode){
            this.rightFuzzyWalletCode = rightFuzzyWalletCode;
            return this;
        }

        public ConditionBuilder rightFuzzyWalletCode (String ... rightFuzzyWalletCode){
            this.rightFuzzyWalletCode = solveNullList(rightFuzzyWalletCode);
            return this;
        }

        public ConditionBuilder walletCodeList(String ... walletCode){
            this.walletCodeList = solveNullList(walletCode);
            return this;
        }

        public ConditionBuilder walletCodeList(List<String> walletCode){
            this.walletCodeList = walletCode;
            return this;
        }

        public ConditionBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public ConditionBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            this.fuzzyCreateTime = solveNullList(fuzzyCreateTime);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = solveNullList(rightFuzzyCreateTime);
            return this;
        }

        public ConditionBuilder createTimeList(String ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder userCode(String userCode){
            this.obj.setUserCode(userCode);
            return this;
        }
        public Builder walletCode(String walletCode){
            this.obj.setWalletCode(walletCode);
            return this;
        }
        public Builder createTime(String createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public User build(){return obj;}
    }

}
