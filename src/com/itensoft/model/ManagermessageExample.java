package com.itensoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagermessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagermessageExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerIsNull() {
            addCriterion("VirtualManager is null");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerIsNotNull() {
            addCriterion("VirtualManager is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerEqualTo(String value) {
            addCriterion("VirtualManager =", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerNotEqualTo(String value) {
            addCriterion("VirtualManager <>", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerGreaterThan(String value) {
            addCriterion("VirtualManager >", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("VirtualManager >=", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerLessThan(String value) {
            addCriterion("VirtualManager <", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerLessThanOrEqualTo(String value) {
            addCriterion("VirtualManager <=", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerLike(String value) {
            addCriterion("VirtualManager like", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerNotLike(String value) {
            addCriterion("VirtualManager not like", value, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerIn(List<String> values) {
            addCriterion("VirtualManager in", values, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerNotIn(List<String> values) {
            addCriterion("VirtualManager not in", values, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerBetween(String value1, String value2) {
            addCriterion("VirtualManager between", value1, value2, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagerNotBetween(String value1, String value2) {
            addCriterion("VirtualManager not between", value1, value2, "virtualmanager");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("ManagerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("ManagerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("ManagerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("ManagerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("ManagerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("ManagerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("ManagerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("ManagerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("ManagerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("ManagerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("ManagerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("ManagerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("ManagerName not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("ClientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("ClientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("ClientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("ClientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("ClientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("ClientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("ClientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("ClientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("ClientId like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("ClientId not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("ClientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("ClientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("ClientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("ClientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNull() {
            addCriterion("SessionId is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("SessionId is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(String value) {
            addCriterion("SessionId =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(String value) {
            addCriterion("SessionId <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(String value) {
            addCriterion("SessionId >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("SessionId >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(String value) {
            addCriterion("SessionId <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(String value) {
            addCriterion("SessionId <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLike(String value) {
            addCriterion("SessionId like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotLike(String value) {
            addCriterion("SessionId not like", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<String> values) {
            addCriterion("SessionId in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<String> values) {
            addCriterion("SessionId not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(String value1, String value2) {
            addCriterion("SessionId between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(String value1, String value2) {
            addCriterion("SessionId not between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("Action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("Action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("Action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("Action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("Action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("Action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("Action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("Action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("Action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("Action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("Action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("Action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("Action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("Action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("DateTime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("DateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("DateTime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("DateTime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("DateTime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DateTime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("DateTime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DateTime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("DateTime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("DateTime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("DateTime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DateTime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAcceptIsNull() {
            addCriterion("Accept is null");
            return (Criteria) this;
        }

        public Criteria andAcceptIsNotNull() {
            addCriterion("Accept is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptEqualTo(String value) {
            addCriterion("Accept =", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotEqualTo(String value) {
            addCriterion("Accept <>", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptGreaterThan(String value) {
            addCriterion("Accept >", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptGreaterThanOrEqualTo(String value) {
            addCriterion("Accept >=", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptLessThan(String value) {
            addCriterion("Accept <", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptLessThanOrEqualTo(String value) {
            addCriterion("Accept <=", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptLike(String value) {
            addCriterion("Accept like", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotLike(String value) {
            addCriterion("Accept not like", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptIn(List<String> values) {
            addCriterion("Accept in", values, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotIn(List<String> values) {
            addCriterion("Accept not in", values, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptBetween(String value1, String value2) {
            addCriterion("Accept between", value1, value2, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotBetween(String value1, String value2) {
            addCriterion("Accept not between", value1, value2, "accept");
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