package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class GroupmanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupmanagerExample() {
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

        public Criteria andGroupcodeIsNull() {
            addCriterion("GroupCode is null");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIsNotNull() {
            addCriterion("GroupCode is not null");
            return (Criteria) this;
        }

        public Criteria andGroupcodeEqualTo(Integer value) {
            addCriterion("GroupCode =", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotEqualTo(Integer value) {
            addCriterion("GroupCode <>", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeGreaterThan(Integer value) {
            addCriterion("GroupCode >", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GroupCode >=", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLessThan(Integer value) {
            addCriterion("GroupCode <", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLessThanOrEqualTo(Integer value) {
            addCriterion("GroupCode <=", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIn(List<Integer> values) {
            addCriterion("GroupCode in", values, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotIn(List<Integer> values) {
            addCriterion("GroupCode not in", values, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeBetween(Integer value1, Integer value2) {
            addCriterion("GroupCode between", value1, value2, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("GroupCode not between", value1, value2, "groupcode");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameIsNull() {
            addCriterion("VirtualManagerName is null");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameIsNotNull() {
            addCriterion("VirtualManagerName is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameEqualTo(String value) {
            addCriterion("VirtualManagerName =", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameNotEqualTo(String value) {
            addCriterion("VirtualManagerName <>", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameGreaterThan(String value) {
            addCriterion("VirtualManagerName >", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameGreaterThanOrEqualTo(String value) {
            addCriterion("VirtualManagerName >=", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameLessThan(String value) {
            addCriterion("VirtualManagerName <", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameLessThanOrEqualTo(String value) {
            addCriterion("VirtualManagerName <=", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameLike(String value) {
            addCriterion("VirtualManagerName like", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameNotLike(String value) {
            addCriterion("VirtualManagerName not like", value, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameIn(List<String> values) {
            addCriterion("VirtualManagerName in", values, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameNotIn(List<String> values) {
            addCriterion("VirtualManagerName not in", values, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameBetween(String value1, String value2) {
            addCriterion("VirtualManagerName between", value1, value2, "virtualmanagername");
            return (Criteria) this;
        }

        public Criteria andVirtualmanagernameNotBetween(String value1, String value2) {
            addCriterion("VirtualManagerName not between", value1, value2, "virtualmanagername");
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