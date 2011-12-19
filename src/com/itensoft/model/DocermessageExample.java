package com.itensoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocermessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocermessageExample() {
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

        public Criteria andDocerIsNull() {
            addCriterion("Docer is null");
            return (Criteria) this;
        }

        public Criteria andDocerIsNotNull() {
            addCriterion("Docer is not null");
            return (Criteria) this;
        }

        public Criteria andDocerEqualTo(String value) {
            addCriterion("Docer =", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerNotEqualTo(String value) {
            addCriterion("Docer <>", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerGreaterThan(String value) {
            addCriterion("Docer >", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerGreaterThanOrEqualTo(String value) {
            addCriterion("Docer >=", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerLessThan(String value) {
            addCriterion("Docer <", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerLessThanOrEqualTo(String value) {
            addCriterion("Docer <=", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerLike(String value) {
            addCriterion("Docer like", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerNotLike(String value) {
            addCriterion("Docer not like", value, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerIn(List<String> values) {
            addCriterion("Docer in", values, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerNotIn(List<String> values) {
            addCriterion("Docer not in", values, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerBetween(String value1, String value2) {
            addCriterion("Docer between", value1, value2, "docer");
            return (Criteria) this;
        }

        public Criteria andDocerNotBetween(String value1, String value2) {
            addCriterion("Docer not between", value1, value2, "docer");
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

        public Criteria andReadedIsNull() {
            addCriterion("Readed is null");
            return (Criteria) this;
        }

        public Criteria andReadedIsNotNull() {
            addCriterion("Readed is not null");
            return (Criteria) this;
        }

        public Criteria andReadedEqualTo(String value) {
            addCriterion("Readed =", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotEqualTo(String value) {
            addCriterion("Readed <>", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThan(String value) {
            addCriterion("Readed >", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThanOrEqualTo(String value) {
            addCriterion("Readed >=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThan(String value) {
            addCriterion("Readed <", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThanOrEqualTo(String value) {
            addCriterion("Readed <=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLike(String value) {
            addCriterion("Readed like", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotLike(String value) {
            addCriterion("Readed not like", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedIn(List<String> values) {
            addCriterion("Readed in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotIn(List<String> values) {
            addCriterion("Readed not in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedBetween(String value1, String value2) {
            addCriterion("Readed between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotBetween(String value1, String value2) {
            addCriterion("Readed not between", value1, value2, "readed");
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

        public Criteria andActionEqualTo(Integer value) {
            addCriterion("Action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(Integer value) {
            addCriterion("Action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(Integer value) {
            addCriterion("Action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(Integer value) {
            addCriterion("Action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(Integer value) {
            addCriterion("Action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<Integer> values) {
            addCriterion("Action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<Integer> values) {
            addCriterion("Action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(Integer value1, Integer value2) {
            addCriterion("Action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(Integer value1, Integer value2) {
            addCriterion("Action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("Result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("Result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("Result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("Result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("Result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("Result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("Result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("Result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("Result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("Result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("Result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("Result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
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