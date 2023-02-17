package com.ggstream.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
 * 交易记录实体类
*  @author huangjiahua
 *  @date 2023/2/17
*/

public class TradeRecord implements Serializable {

    private static final long serialVersionUID = 1676604349026L;

    public static final Integer EXTERNAL_RECHARGE = 0;

    public static final Integer CONSUME = 1;

    public static final Integer RECHARGE_FROM = 2;

    public static final Integer RECHARGE_TO = 3;

    public static final Integer IN_PROGRESS = 1;

    public static final Integer FAIL = 2;

    public static final Integer SUCCEED = 3;



    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 0表示外部充值，1表示扣费，2表示从别钱包充到此钱包，3表示从此钱包充到别钱包
    * isNullAble:0
    */
    private Integer type;

    /**
    * 交易金额
    * isNullAble:0
    */
    private java.math.BigDecimal tradeAmount;

    /**
    * 发起交易的用户编号
    * isNullAble:0
    */
    private String userCode;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDate createTime;

    /**
    * 编号
    * isNullAble:0
    */
    private String recodeCode;

    /**
    * 状态：0为创建，1为进行，2为交易成功，3为交易失败。，
    * isNullAble:0
    */
    private Integer status;

    /**
    * 交易前余额
    * isNullAble:0
    */
    private java.math.BigDecimal tradeBefore;

    /**
    * 交易后余额
    * isNullAble:0
    */
    private java.math.BigDecimal tradeAfter;

    /**
    * 当前交易钱包
    * isNullAble:1
    */
    private String walletCode;

    /**
    * 当充值时，交易类型为2和3时，表示为此钱包和其它钱包交易的其它钱包编号
    * isNullAble:1
    */
    private String walletTo;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setTradeAmount(java.math.BigDecimal tradeAmount){this.tradeAmount = tradeAmount;}

    public java.math.BigDecimal getTradeAmount(){return this.tradeAmount;}

    public void setUserCode(String userCode){this.userCode = userCode;}

    public String getUserCode(){return this.userCode;}

    public void setCreateTime(java.time.LocalDate createTime){this.createTime = createTime;}

    public java.time.LocalDate getCreateTime(){return this.createTime;}

    public void setRecodeCode(String recodeCode){this.recodeCode = recodeCode;}

    public String getRecodeCode(){return this.recodeCode;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setTradeBefore(java.math.BigDecimal tradeBefore){this.tradeBefore = tradeBefore;}

    public java.math.BigDecimal getTradeBefore(){return this.tradeBefore;}

    public void setTradeAfter(java.math.BigDecimal tradeAfter){this.tradeAfter = tradeAfter;}

    public java.math.BigDecimal getTradeAfter(){return this.tradeAfter;}

    public void setWalletCode(String walletCode){this.walletCode = walletCode;}

    public String getWalletCode(){return this.walletCode;}

    public void setWalletTo(String walletTo){this.walletTo = walletTo;}

    public String getWalletTo(){return this.walletTo;}
    @Override
    public String toString() {
        return "TradeRecord{" +
                "id='" + id + '\'' +
                "type='" + type + '\'' +
                "tradeAmount='" + tradeAmount + '\'' +
                "userCode='" + userCode + '\'' +
                "createTime='" + createTime + '\'' +
                "recodeCode='" + recodeCode + '\'' +
                "status='" + status + '\'' +
                "tradeBefore='" + tradeBefore + '\'' +
                "tradeAfter='" + tradeAfter + '\'' +
                "walletCode='" + walletCode + '\'' +
                "walletTo='" + walletTo + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private TradeRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(TradeRecord set){
            this.set = set;
            return this;
        }

        public TradeRecord getSet(){
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

    public static class QueryBuilder extends TradeRecord{
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

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<java.math.BigDecimal> tradeAmountList;

        public List<java.math.BigDecimal> getTradeAmountList(){return this.tradeAmountList;}

        private java.math.BigDecimal tradeAmountSt;

        private java.math.BigDecimal tradeAmountEd;

        public java.math.BigDecimal getTradeAmountSt(){return this.tradeAmountSt;}

        public java.math.BigDecimal getTradeAmountEd(){return this.tradeAmountEd;}

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

        private List<String> recodeCodeList;

        public List<String> getRecodeCodeList(){return this.recodeCodeList;}


        private List<String> fuzzyRecodeCode;

        public List<String> getFuzzyRecodeCode(){return this.fuzzyRecodeCode;}

        private List<String> rightFuzzyRecodeCode;

        public List<String> getRightFuzzyRecodeCode(){return this.rightFuzzyRecodeCode;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<java.math.BigDecimal> tradeBeforeList;

        public List<java.math.BigDecimal> getTradeBeforeList(){return this.tradeBeforeList;}

        private java.math.BigDecimal tradeBeforeSt;

        private java.math.BigDecimal tradeBeforeEd;

        public java.math.BigDecimal getTradeBeforeSt(){return this.tradeBeforeSt;}

        public java.math.BigDecimal getTradeBeforeEd(){return this.tradeBeforeEd;}

        private List<java.math.BigDecimal> tradeAfterList;

        public List<java.math.BigDecimal> getTradeAfterList(){return this.tradeAfterList;}

        private java.math.BigDecimal tradeAfterSt;

        private java.math.BigDecimal tradeAfterEd;

        public java.math.BigDecimal getTradeAfterSt(){return this.tradeAfterSt;}

        public java.math.BigDecimal getTradeAfterEd(){return this.tradeAfterEd;}

        private List<String> walletCodeList;

        public List<String> getWalletCodeList(){return this.walletCodeList;}


        private List<String> fuzzyWalletCode;

        public List<String> getFuzzyWalletCode(){return this.fuzzyWalletCode;}

        private List<String> rightFuzzyWalletCode;

        public List<String> getRightFuzzyWalletCode(){return this.rightFuzzyWalletCode;}
        private List<String> walletToList;

        public List<String> getWalletToList(){return this.walletToList;}


        private List<String> fuzzyWalletTo;

        public List<String> getFuzzyWalletTo(){return this.fuzzyWalletTo;}

        private List<String> rightFuzzyWalletTo;

        public List<String> getRightFuzzyWalletTo(){return this.rightFuzzyWalletTo;}
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

        public QueryBuilder tradeAmountBetWeen(java.math.BigDecimal tradeAmountSt,java.math.BigDecimal tradeAmountEd){
            this.tradeAmountSt = tradeAmountSt;
            this.tradeAmountEd = tradeAmountEd;
            return this;
        }

        public QueryBuilder tradeAmountGreaterEqThan(java.math.BigDecimal tradeAmountSt){
            this.tradeAmountSt = tradeAmountSt;
            return this;
        }
        public QueryBuilder tradeAmountLessEqThan(java.math.BigDecimal tradeAmountEd){
            this.tradeAmountEd = tradeAmountEd;
            return this;
        }


        public QueryBuilder tradeAmount(java.math.BigDecimal tradeAmount){
            setTradeAmount(tradeAmount);
            return this;
        }

        public QueryBuilder tradeAmountList(java.math.BigDecimal ... tradeAmount){
            this.tradeAmountList = solveNullList(tradeAmount);
            return this;
        }

        public QueryBuilder tradeAmountList(List<java.math.BigDecimal> tradeAmount){
            this.tradeAmountList = tradeAmount;
            return this;
        }

        public QueryBuilder fetchTradeAmount(){
            setFetchFields("fetchFields","tradeAmount");
            return this;
        }

        public QueryBuilder excludeTradeAmount(){
            setFetchFields("excludeFields","tradeAmount");
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

        public QueryBuilder fuzzyRecodeCode (List<String> fuzzyRecodeCode){
            this.fuzzyRecodeCode = fuzzyRecodeCode;
            return this;
        }

        public QueryBuilder fuzzyRecodeCode (String ... fuzzyRecodeCode){
            this.fuzzyRecodeCode = solveNullList(fuzzyRecodeCode);
            return this;
        }

        public QueryBuilder rightFuzzyRecodeCode (List<String> rightFuzzyRecodeCode){
            this.rightFuzzyRecodeCode = rightFuzzyRecodeCode;
            return this;
        }

        public QueryBuilder rightFuzzyRecodeCode (String ... rightFuzzyRecodeCode){
            this.rightFuzzyRecodeCode = solveNullList(rightFuzzyRecodeCode);
            return this;
        }

        public QueryBuilder recodeCode(String recodeCode){
            setRecodeCode(recodeCode);
            return this;
        }

        public QueryBuilder recodeCodeList(String ... recodeCode){
            this.recodeCodeList = solveNullList(recodeCode);
            return this;
        }

        public QueryBuilder recodeCodeList(List<String> recodeCode){
            this.recodeCodeList = recodeCode;
            return this;
        }

        public QueryBuilder fetchRecodeCode(){
            setFetchFields("fetchFields","recodeCode");
            return this;
        }

        public QueryBuilder excludeRecodeCode(){
            setFetchFields("excludeFields","recodeCode");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder tradeBeforeBetWeen(java.math.BigDecimal tradeBeforeSt,java.math.BigDecimal tradeBeforeEd){
            this.tradeBeforeSt = tradeBeforeSt;
            this.tradeBeforeEd = tradeBeforeEd;
            return this;
        }

        public QueryBuilder tradeBeforeGreaterEqThan(java.math.BigDecimal tradeBeforeSt){
            this.tradeBeforeSt = tradeBeforeSt;
            return this;
        }
        public QueryBuilder tradeBeforeLessEqThan(java.math.BigDecimal tradeBeforeEd){
            this.tradeBeforeEd = tradeBeforeEd;
            return this;
        }


        public QueryBuilder tradeBefore(java.math.BigDecimal tradeBefore){
            setTradeBefore(tradeBefore);
            return this;
        }

        public QueryBuilder tradeBeforeList(java.math.BigDecimal ... tradeBefore){
            this.tradeBeforeList = solveNullList(tradeBefore);
            return this;
        }

        public QueryBuilder tradeBeforeList(List<java.math.BigDecimal> tradeBefore){
            this.tradeBeforeList = tradeBefore;
            return this;
        }

        public QueryBuilder fetchTradeBefore(){
            setFetchFields("fetchFields","tradeBefore");
            return this;
        }

        public QueryBuilder excludeTradeBefore(){
            setFetchFields("excludeFields","tradeBefore");
            return this;
        }

        public QueryBuilder tradeAfterBetWeen(java.math.BigDecimal tradeAfterSt,java.math.BigDecimal tradeAfterEd){
            this.tradeAfterSt = tradeAfterSt;
            this.tradeAfterEd = tradeAfterEd;
            return this;
        }

        public QueryBuilder tradeAfterGreaterEqThan(java.math.BigDecimal tradeAfterSt){
            this.tradeAfterSt = tradeAfterSt;
            return this;
        }
        public QueryBuilder tradeAfterLessEqThan(java.math.BigDecimal tradeAfterEd){
            this.tradeAfterEd = tradeAfterEd;
            return this;
        }


        public QueryBuilder tradeAfter(java.math.BigDecimal tradeAfter){
            setTradeAfter(tradeAfter);
            return this;
        }

        public QueryBuilder tradeAfterList(java.math.BigDecimal ... tradeAfter){
            this.tradeAfterList = solveNullList(tradeAfter);
            return this;
        }

        public QueryBuilder tradeAfterList(List<java.math.BigDecimal> tradeAfter){
            this.tradeAfterList = tradeAfter;
            return this;
        }

        public QueryBuilder fetchTradeAfter(){
            setFetchFields("fetchFields","tradeAfter");
            return this;
        }

        public QueryBuilder excludeTradeAfter(){
            setFetchFields("excludeFields","tradeAfter");
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

        public QueryBuilder fuzzyWalletTo (List<String> fuzzyWalletTo){
            this.fuzzyWalletTo = fuzzyWalletTo;
            return this;
        }

        public QueryBuilder fuzzyWalletTo (String ... fuzzyWalletTo){
            this.fuzzyWalletTo = solveNullList(fuzzyWalletTo);
            return this;
        }

        public QueryBuilder rightFuzzyWalletTo (List<String> rightFuzzyWalletTo){
            this.rightFuzzyWalletTo = rightFuzzyWalletTo;
            return this;
        }

        public QueryBuilder rightFuzzyWalletTo (String ... rightFuzzyWalletTo){
            this.rightFuzzyWalletTo = solveNullList(rightFuzzyWalletTo);
            return this;
        }

        public QueryBuilder walletTo(String walletTo){
            setWalletTo(walletTo);
            return this;
        }

        public QueryBuilder walletToList(String ... walletTo){
            this.walletToList = solveNullList(walletTo);
            return this;
        }

        public QueryBuilder walletToList(List<String> walletTo){
            this.walletToList = walletTo;
            return this;
        }

        public QueryBuilder fetchWalletTo(){
            setFetchFields("fetchFields","walletTo");
            return this;
        }

        public QueryBuilder excludeWalletTo(){
            setFetchFields("excludeFields","walletTo");
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

        public TradeRecord build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<java.math.BigDecimal> tradeAmountList;

        public List<java.math.BigDecimal> getTradeAmountList(){return this.tradeAmountList;}

        private java.math.BigDecimal tradeAmountSt;

        private java.math.BigDecimal tradeAmountEd;

        public java.math.BigDecimal getTradeAmountSt(){return this.tradeAmountSt;}

        public java.math.BigDecimal getTradeAmountEd(){return this.tradeAmountEd;}

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

        private List<String> recodeCodeList;

        public List<String> getRecodeCodeList(){return this.recodeCodeList;}


        private List<String> fuzzyRecodeCode;

        public List<String> getFuzzyRecodeCode(){return this.fuzzyRecodeCode;}

        private List<String> rightFuzzyRecodeCode;

        public List<String> getRightFuzzyRecodeCode(){return this.rightFuzzyRecodeCode;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<java.math.BigDecimal> tradeBeforeList;

        public List<java.math.BigDecimal> getTradeBeforeList(){return this.tradeBeforeList;}

        private java.math.BigDecimal tradeBeforeSt;

        private java.math.BigDecimal tradeBeforeEd;

        public java.math.BigDecimal getTradeBeforeSt(){return this.tradeBeforeSt;}

        public java.math.BigDecimal getTradeBeforeEd(){return this.tradeBeforeEd;}

        private List<java.math.BigDecimal> tradeAfterList;

        public List<java.math.BigDecimal> getTradeAfterList(){return this.tradeAfterList;}

        private java.math.BigDecimal tradeAfterSt;

        private java.math.BigDecimal tradeAfterEd;

        public java.math.BigDecimal getTradeAfterSt(){return this.tradeAfterSt;}

        public java.math.BigDecimal getTradeAfterEd(){return this.tradeAfterEd;}

        private List<String> walletCodeList;

        public List<String> getWalletCodeList(){return this.walletCodeList;}


        private List<String> fuzzyWalletCode;

        public List<String> getFuzzyWalletCode(){return this.fuzzyWalletCode;}

        private List<String> rightFuzzyWalletCode;

        public List<String> getRightFuzzyWalletCode(){return this.rightFuzzyWalletCode;}
        private List<String> walletToList;

        public List<String> getWalletToList(){return this.walletToList;}


        private List<String> fuzzyWalletTo;

        public List<String> getFuzzyWalletTo(){return this.fuzzyWalletTo;}

        private List<String> rightFuzzyWalletTo;

        public List<String> getRightFuzzyWalletTo(){return this.rightFuzzyWalletTo;}

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

        public ConditionBuilder tradeAmountBetWeen(java.math.BigDecimal tradeAmountSt,java.math.BigDecimal tradeAmountEd){
            this.tradeAmountSt = tradeAmountSt;
            this.tradeAmountEd = tradeAmountEd;
            return this;
        }

        public ConditionBuilder tradeAmountGreaterEqThan(java.math.BigDecimal tradeAmountSt){
            this.tradeAmountSt = tradeAmountSt;
            return this;
        }
        public ConditionBuilder tradeAmountLessEqThan(java.math.BigDecimal tradeAmountEd){
            this.tradeAmountEd = tradeAmountEd;
            return this;
        }


        public ConditionBuilder tradeAmountList(java.math.BigDecimal ... tradeAmount){
            this.tradeAmountList = solveNullList(tradeAmount);
            return this;
        }

        public ConditionBuilder tradeAmountList(List<java.math.BigDecimal> tradeAmount){
            this.tradeAmountList = tradeAmount;
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

        public ConditionBuilder fuzzyRecodeCode (List<String> fuzzyRecodeCode){
            this.fuzzyRecodeCode = fuzzyRecodeCode;
            return this;
        }

        public ConditionBuilder fuzzyRecodeCode (String ... fuzzyRecodeCode){
            this.fuzzyRecodeCode = solveNullList(fuzzyRecodeCode);
            return this;
        }

        public ConditionBuilder rightFuzzyRecodeCode (List<String> rightFuzzyRecodeCode){
            this.rightFuzzyRecodeCode = rightFuzzyRecodeCode;
            return this;
        }

        public ConditionBuilder rightFuzzyRecodeCode (String ... rightFuzzyRecodeCode){
            this.rightFuzzyRecodeCode = solveNullList(rightFuzzyRecodeCode);
            return this;
        }

        public ConditionBuilder recodeCodeList(String ... recodeCode){
            this.recodeCodeList = solveNullList(recodeCode);
            return this;
        }

        public ConditionBuilder recodeCodeList(List<String> recodeCode){
            this.recodeCodeList = recodeCode;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder tradeBeforeBetWeen(java.math.BigDecimal tradeBeforeSt,java.math.BigDecimal tradeBeforeEd){
            this.tradeBeforeSt = tradeBeforeSt;
            this.tradeBeforeEd = tradeBeforeEd;
            return this;
        }

        public ConditionBuilder tradeBeforeGreaterEqThan(java.math.BigDecimal tradeBeforeSt){
            this.tradeBeforeSt = tradeBeforeSt;
            return this;
        }
        public ConditionBuilder tradeBeforeLessEqThan(java.math.BigDecimal tradeBeforeEd){
            this.tradeBeforeEd = tradeBeforeEd;
            return this;
        }


        public ConditionBuilder tradeBeforeList(java.math.BigDecimal ... tradeBefore){
            this.tradeBeforeList = solveNullList(tradeBefore);
            return this;
        }

        public ConditionBuilder tradeBeforeList(List<java.math.BigDecimal> tradeBefore){
            this.tradeBeforeList = tradeBefore;
            return this;
        }

        public ConditionBuilder tradeAfterBetWeen(java.math.BigDecimal tradeAfterSt,java.math.BigDecimal tradeAfterEd){
            this.tradeAfterSt = tradeAfterSt;
            this.tradeAfterEd = tradeAfterEd;
            return this;
        }

        public ConditionBuilder tradeAfterGreaterEqThan(java.math.BigDecimal tradeAfterSt){
            this.tradeAfterSt = tradeAfterSt;
            return this;
        }
        public ConditionBuilder tradeAfterLessEqThan(java.math.BigDecimal tradeAfterEd){
            this.tradeAfterEd = tradeAfterEd;
            return this;
        }


        public ConditionBuilder tradeAfterList(java.math.BigDecimal ... tradeAfter){
            this.tradeAfterList = solveNullList(tradeAfter);
            return this;
        }

        public ConditionBuilder tradeAfterList(List<java.math.BigDecimal> tradeAfter){
            this.tradeAfterList = tradeAfter;
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

        public ConditionBuilder fuzzyWalletTo (List<String> fuzzyWalletTo){
            this.fuzzyWalletTo = fuzzyWalletTo;
            return this;
        }

        public ConditionBuilder fuzzyWalletTo (String ... fuzzyWalletTo){
            this.fuzzyWalletTo = solveNullList(fuzzyWalletTo);
            return this;
        }

        public ConditionBuilder rightFuzzyWalletTo (List<String> rightFuzzyWalletTo){
            this.rightFuzzyWalletTo = rightFuzzyWalletTo;
            return this;
        }

        public ConditionBuilder rightFuzzyWalletTo (String ... rightFuzzyWalletTo){
            this.rightFuzzyWalletTo = solveNullList(rightFuzzyWalletTo);
            return this;
        }

        public ConditionBuilder walletToList(String ... walletTo){
            this.walletToList = solveNullList(walletTo);
            return this;
        }

        public ConditionBuilder walletToList(List<String> walletTo){
            this.walletToList = walletTo;
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

        private TradeRecord obj;

        public Builder(){
            this.obj = new TradeRecord();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder tradeAmount(java.math.BigDecimal tradeAmount){
            this.obj.setTradeAmount(tradeAmount);
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
        public Builder recodeCode(String recodeCode){
            this.obj.setRecodeCode(recodeCode);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder tradeBefore(java.math.BigDecimal tradeBefore){
            this.obj.setTradeBefore(tradeBefore);
            return this;
        }
        public Builder tradeAfter(java.math.BigDecimal tradeAfter){
            this.obj.setTradeAfter(tradeAfter);
            return this;
        }
        public Builder walletCode(String walletCode){
            this.obj.setWalletCode(walletCode);
            return this;
        }
        public Builder walletTo(String walletTo){
            this.obj.setWalletTo(walletTo);
            return this;
        }
        public TradeRecord build(){return obj;}
    }

}
