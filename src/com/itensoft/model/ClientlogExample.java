package com.itensoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientlogExample() {
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

        public Criteria andHardidIsNull() {
            addCriterion("HardId is null");
            return (Criteria) this;
        }

        public Criteria andHardidIsNotNull() {
            addCriterion("HardId is not null");
            return (Criteria) this;
        }

        public Criteria andHardidEqualTo(String value) {
            addCriterion("HardId =", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidNotEqualTo(String value) {
            addCriterion("HardId <>", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidGreaterThan(String value) {
            addCriterion("HardId >", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidGreaterThanOrEqualTo(String value) {
            addCriterion("HardId >=", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidLessThan(String value) {
            addCriterion("HardId <", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidLessThanOrEqualTo(String value) {
            addCriterion("HardId <=", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidLike(String value) {
            addCriterion("HardId like", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidNotLike(String value) {
            addCriterion("HardId not like", value, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidIn(List<String> values) {
            addCriterion("HardId in", values, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidNotIn(List<String> values) {
            addCriterion("HardId not in", values, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidBetween(String value1, String value2) {
            addCriterion("HardId between", value1, value2, "hardid");
            return (Criteria) this;
        }

        public Criteria andHardidNotBetween(String value1, String value2) {
            addCriterion("HardId not between", value1, value2, "hardid");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "filename");
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