package com.ggstream.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
 * 钱包实体类
*  @author huangjiahua
*/
public class Wallet implements Serializable {

    private static final long serialVersionUID = 1676607831952L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0
    */
    private String userCode;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDate createTime;

    /**
    * 
    * isNullAble:0
    */
    private java.math.BigDecimal balance;

    /**
    * 
    * isNullAble:0
    */
    private String walletCode;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setUserCode(String userCode){this.userCode = userCode;}

    public String getUserCode(){return this.userCode;}

    public void setCreateTime(java.time.LocalDate createTime){this.createTime = createTime;}

    public java.time.LocalDate getCreateTime(){return this.createTime;}

    public void setBalance(java.math.BigDecimal balance){this.balance = balance;}

    public java.math.BigDecimal getBalance(){return this.balance;}

    public void setWalletCode(String walletCode){this.walletCode = walletCode;}

    public String getWalletCode(){return this.walletCode;}
    @Override
    public String toString() {
        return "Wallet{" +
                "id='" + id + '\'' +
                "userCode='" + userCode + '\'' +
                "createTime='" + createTime + '\'' +
                "balance='" + balance + '\'' +
                "walletCode='" + walletCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Wallet set;

        private ConditionBuilder where;

        public UpdateBuilder set(Wallet set){
            this.set = set;
            return this;
        }

        public Wallet getSet(){
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

    public static class QueryBuilder extends Wallet{
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
        private List<java.time.LocalDate> createTimeList;

        public List<java.time.LocalDate> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDate createTimeSt;

        private java.time.LocalDate createTimeEd;

        public java.time.LocalDate getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDate getCreateTimeEd(){return this.createTimeEd;}

        private List<java.math.BigDecimal> balanceList;

        public List<java.math.BigDecimal> getBalanceList(){return this.balanceList;}

        private java.math.BigDecimal balanceSt;

        private java.math.BigDecimal balanceEd;

        public java.math.BigDecimal getBalanceSt(){return this.balanceSt;}

        public java.math.BigDecimal getBalanceEd(){return this.balanceEd;}

        private List<String> walletCodeList;

        public List<String> getWalletCodeList(){return this.walletCodeList;}


        private List<String> fuzzyWalletCode;

        public List<String> getFuzzyWalletCode(){return this.fuzzyWalletCode;}

        private List<String> rightFuzzyWalletCode;

        public List<String> getRightFuzzyWalletCode(){return this.rightFuzzyWalletCode;}
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

        public QueryBuilder createTimeBetWeen(java.time.LocalDate createTimeSt,java.time.LocalDate createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDate createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDate createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDate createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDate ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDate> createTime){
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

        public QueryBuilder balanceBetWeen(java.math.BigDecimal balanceSt,java.math.BigDecimal balanceEd){
            this.balanceSt = balanceSt;
            this.balanceEd = balanceEd;
            return this;
        }

        public QueryBuilder balanceGreaterEqThan(java.math.BigDecimal balanceSt){
            this.balanceSt = balanceSt;
            return this;
        }
        public QueryBuilder balanceLessEqThan(java.math.BigDecimal balanceEd){
            this.balanceEd = balanceEd;
            return this;
        }


        public QueryBuilder balance(java.math.BigDecimal balance){
            setBalance(balance);
            return this;
        }

        public QueryBuilder balanceList(java.math.BigDecimal ... balance){
            this.balanceList = solveNullList(balance);
            return this;
        }

        public QueryBuilder balanceList(List<java.math.BigDecimal> balance){
            this.balanceList = balance;
            return this;
        }

        public QueryBuilder fetchBalance(){
            setFetchFields("fetchFields","balance");
            return this;
        }

        public QueryBuilder excludeBalance(){
            setFetchFields("excludeFields","balance");
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

        public Wallet build(){return this;}
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
        private List<java.time.LocalDate> createTimeList;

        public List<java.time.LocalDate> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDate createTimeSt;

        private java.time.LocalDate createTimeEd;

        public java.time.LocalDate getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDate getCreateTimeEd(){return this.createTimeEd;}

        private List<java.math.BigDecimal> balanceList;

        public List<java.math.BigDecimal> getBalanceList(){return this.balanceList;}

        private java.math.BigDecimal balanceSt;

        private java.math.BigDecimal balanceEd;

        public java.math.BigDecimal getBalanceSt(){return this.balanceSt;}

        public java.math.BigDecimal getBalanceEd(){return this.balanceEd;}

        private List<String> walletCodeList;

        public List<String> getWalletCodeList(){return this.walletCodeList;}


        private List<String> fuzzyWalletCode;

        public List<String> getFuzzyWalletCode(){return this.fuzzyWalletCode;}

        private List<String> rightFuzzyWalletCode;

        public List<String> getRightFuzzyWalletCode(){return this.rightFuzzyWalletCode;}

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

        public ConditionBuilder createTimeBetWeen(java.time.LocalDate createTimeSt,java.time.LocalDate createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDate createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDate createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDate ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDate> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder balanceBetWeen(java.math.BigDecimal balanceSt,java.math.BigDecimal balanceEd){
            this.balanceSt = balanceSt;
            this.balanceEd = balanceEd;
            return this;
        }

        public ConditionBuilder balanceGreaterEqThan(java.math.BigDecimal balanceSt){
            this.balanceSt = balanceSt;
            return this;
        }
        public ConditionBuilder balanceLessEqThan(java.math.BigDecimal balanceEd){
            this.balanceEd = balanceEd;
            return this;
        }


        public ConditionBuilder balanceList(java.math.BigDecimal ... balance){
            this.balanceList = solveNullList(balance);
            return this;
        }

        public ConditionBuilder balanceList(List<java.math.BigDecimal> balance){
            this.balanceList = balance;
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

        private Wallet obj;

        public Builder(){
            this.obj = new Wallet();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder userCode(String userCode){
            this.obj.setUserCode(userCode);
            return this;
        }
        public Builder createTime(java.time.LocalDate createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder balance(java.math.BigDecimal balance){
            this.obj.setBalance(balance);
            return this;
        }
        public Builder walletCode(String walletCode){
            this.obj.setWalletCode(walletCode);
            return this;
        }
        public Wallet build(){return obj;}
    }

}
