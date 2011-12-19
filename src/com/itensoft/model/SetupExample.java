package com.itensoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SetupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SetupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRowidIsNull() {
            addCriterion("RowID is null");
            return (Criteria) this;
        }

        public Criteria andRowidIsNotNull() {
            addCriterion("RowID is not null");
            return (Criteria) this;
        }

        public Criteria andRowidEqualTo(Integer value) {
            addCriterion("RowID =", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidNotEqualTo(Integer value) {
            addCriterion("RowID <>", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidGreaterThan(Integer value) {
            addCriterion("RowID >", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RowID >=", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidLessThan(Integer value) {
            addCriterion("RowID <", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidLessThanOrEqualTo(Integer value) {
            addCriterion("RowID <=", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidIn(List<Integer> values) {
            addCriterion("RowID in", values, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidNotIn(List<Integer> values) {
            addCriterion("RowID not in", values, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidBetween(Integer value1, Integer value2) {
            addCriterion("RowID between", value1, value2, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidNotBetween(Integer value1, Integer value2) {
            addCriterion("RowID not between", value1, value2, "rowid");
            return (Criteria) this;
        }

        public Criteria andAuthtypeIsNull() {
            addCriterion("AuthType is null");
            return (Criteria) this;
        }

        public Criteria andAuthtypeIsNotNull() {
            addCriterion("AuthType is not null");
            return (Criteria) this;
        }

        public Criteria andAuthtypeEqualTo(Integer value) {
            addCriterion("AuthType =", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotEqualTo(Integer value) {
            addCriterion("AuthType <>", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeGreaterThan(Integer value) {
            addCriterion("AuthType >", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuthType >=", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeLessThan(Integer value) {
            addCriterion("AuthType <", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeLessThanOrEqualTo(Integer value) {
            addCriterion("AuthType <=", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeIn(List<Integer> values) {
            addCriterion("AuthType in", values, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotIn(List<Integer> values) {
            addCriterion("AuthType not in", values, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeBetween(Integer value1, Integer value2) {
            addCriterion("AuthType between", value1, value2, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AuthType not between", value1, value2, "authtype");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("LastDate is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("LastDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(Date value) {
            addCriterion("LastDate =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(Date value) {
            addCriterion("LastDate <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(Date value) {
            addCriterion("LastDate >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastDate >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(Date value) {
            addCriterion("LastDate <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(Date value) {
            addCriterion("LastDate <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<Date> values) {
            addCriterion("LastDate in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<Date> values) {
            addCriterion("LastDate not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(Date value1, Date value2) {
            addCriterion("LastDate between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(Date value1, Date value2) {
            addCriterion("LastDate not between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNull() {
            addCriterion("TimeOut is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNotNull() {
            addCriterion("TimeOut is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutEqualTo(Integer value) {
            addCriterion("TimeOut =", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotEqualTo(Integer value) {
            addCriterion("TimeOut <>", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThan(Integer value) {
            addCriterion("TimeOut >", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("TimeOut >=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThan(Integer value) {
            addCriterion("TimeOut <", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("TimeOut <=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutIn(List<Integer> values) {
            addCriterion("TimeOut in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotIn(List<Integer> values) {
            addCriterion("TimeOut not in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("TimeOut between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("TimeOut not between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexIsNull() {
            addCriterion("PasswordComplex is null");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexIsNotNull() {
            addCriterion("PasswordComplex is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexEqualTo(String value) {
            addCriterion("PasswordComplex =", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexNotEqualTo(String value) {
            addCriterion("PasswordComplex <>", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexGreaterThan(String value) {
            addCriterion("PasswordComplex >", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordComplex >=", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexLessThan(String value) {
            addCriterion("PasswordComplex <", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexLessThanOrEqualTo(String value) {
            addCriterion("PasswordComplex <=", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexLike(String value) {
            addCriterion("PasswordComplex like", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexNotLike(String value) {
            addCriterion("PasswordComplex not like", value, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexIn(List<String> values) {
            addCriterion("PasswordComplex in", values, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexNotIn(List<String> values) {
            addCriterion("PasswordComplex not in", values, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexBetween(String value1, String value2) {
            addCriterion("PasswordComplex between", value1, value2, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andPasswordcomplexNotBetween(String value1, String value2) {
            addCriterion("PasswordComplex not between", value1, value2, "passwordcomplex");
            return (Criteria) this;
        }

        public Criteria andHintIsNull() {
            addCriterion("Hint is null");
            return (Criteria) this;
        }

        public Criteria andHintIsNotNull() {
            addCriterion("Hint is not null");
            return (Criteria) this;
        }

        public Criteria andHintEqualTo(String value) {
            addCriterion("Hint =", value, "hint");
            return (Criteria) this;
        }

        public Criteria andHintNotEqualTo(String value) {
            addCriterion("Hint <>", value, "hint");
            return (Criteria) this;
        }

        public Criteria andHintGreaterThan(String value) {
            addCriterion("Hint >", value, "hint");
            return (Criteria) this;
        }

        public Criteria andHintGreaterThanOrEqualTo(String value) {
            addCriterion("Hint >=", value, "hint");
            return (Criteria) this;
        }

        public Criteria andHintLessThan(String value) {
            addCriterion("Hint <", value, "hint");
            return (Criteria) this;
        }

        public Criteria andHintLessThanOrEqualTo(String value) {
            addCriterion("Hint <=", value, "hint");
            return (Criteria) this;
        }

        public Criteria andHintIn(List<String> values) {
            addCriterion("Hint in", values, "hint");
            return (Criteria) this;
        }

        public Criteria andHintNotIn(List<String> values) {
            addCriterion("Hint not in", values, "hint");
            return (Criteria) this;
        }

        public Criteria andHintBetween(String value1, String value2) {
            addCriterion("Hint between", value1, value2, "hint");
            return (Criteria) this;
        }

        public Criteria andHintNotBetween(String value1, String value2) {
            addCriterion("Hint not between", value1, value2, "hint");
            return (Criteria) this;
        }

        public Criteria andAutolockselfIsNull() {
            addCriterion("AutoLockSelf is null");
            return (Criteria) this;
        }

        public Criteria andAutolockselfIsNotNull() {
            addCriterion("AutoLockSelf is not null");
            return (Criteria) this;
        }

        public Criteria andAutolockselfEqualTo(String value) {
            addCriterion("AutoLockSelf =", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfNotEqualTo(String value) {
            addCriterion("AutoLockSelf <>", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfGreaterThan(String value) {
            addCriterion("AutoLockSelf >", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfGreaterThanOrEqualTo(String value) {
            addCriterion("AutoLockSelf >=", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfLessThan(String value) {
            addCriterion("AutoLockSelf <", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfLessThanOrEqualTo(String value) {
            addCriterion("AutoLockSelf <=", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfLike(String value) {
            addCriterion("AutoLockSelf like", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfNotLike(String value) {
            addCriterion("AutoLockSelf not like", value, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfIn(List<String> values) {
            addCriterion("AutoLockSelf in", values, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfNotIn(List<String> values) {
            addCriterion("AutoLockSelf not in", values, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfBetween(String value1, String value2) {
            addCriterion("AutoLockSelf between", value1, value2, "autolockself");
            return (Criteria) this;
        }

        public Criteria andAutolockselfNotBetween(String value1, String value2) {
            addCriterion("AutoLockSelf not between", value1, value2, "autolockself");
            return (Criteria) this;
        }

        public Criteria andPortforguiIsNull() {
            addCriterion("PortForGUI is null");
            return (Criteria) this;
        }

        public Criteria andPortforguiIsNotNull() {
            addCriterion("PortForGUI is not null");
            return (Criteria) this;
        }

        public Criteria andPortforguiEqualTo(Integer value) {
            addCriterion("PortForGUI =", value, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiNotEqualTo(Integer value) {
            addCriterion("PortForGUI <>", value, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiGreaterThan(Integer value) {
            addCriterion("PortForGUI >", value, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiGreaterThanOrEqualTo(Integer value) {
            addCriterion("PortForGUI >=", value, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiLessThan(Integer value) {
            addCriterion("PortForGUI <", value, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiLessThanOrEqualTo(Integer value) {
            addCriterion("PortForGUI <=", value, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiIn(List<Integer> values) {
            addCriterion("PortForGUI in", values, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiNotIn(List<Integer> values) {
            addCriterion("PortForGUI not in", values, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiBetween(Integer value1, Integer value2) {
            addCriterion("PortForGUI between", value1, value2, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforguiNotBetween(Integer value1, Integer value2) {
            addCriterion("PortForGUI not between", value1, value2, "portforgui");
            return (Criteria) this;
        }

        public Criteria andPortforclientIsNull() {
            addCriterion("PortForClient is null");
            return (Criteria) this;
        }

        public Criteria andPortforclientIsNotNull() {
            addCriterion("PortForClient is not null");
            return (Criteria) this;
        }

        public Criteria andPortforclientEqualTo(Integer value) {
            addCriterion("PortForClient =", value, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientNotEqualTo(Integer value) {
            addCriterion("PortForClient <>", value, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientGreaterThan(Integer value) {
            addCriterion("PortForClient >", value, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientGreaterThanOrEqualTo(Integer value) {
            addCriterion("PortForClient >=", value, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientLessThan(Integer value) {
            addCriterion("PortForClient <", value, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientLessThanOrEqualTo(Integer value) {
            addCriterion("PortForClient <=", value, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientIn(List<Integer> values) {
            addCriterion("PortForClient in", values, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientNotIn(List<Integer> values) {
            addCriterion("PortForClient not in", values, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientBetween(Integer value1, Integer value2) {
            addCriterion("PortForClient between", value1, value2, "portforclient");
            return (Criteria) this;
        }

        public Criteria andPortforclientNotBetween(Integer value1, Integer value2) {
            addCriterion("PortForClient not between", value1, value2, "portforclient");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}