package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class VirtualmanagerdocerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualmanagerdocerExample() {
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

        public Criteria andVitrualmanagernameIsNull() {
            addCriterion("VitrualManagerName is null");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameIsNotNull() {
            addCriterion("VitrualManagerName is not null");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameEqualTo(String value) {
            addCriterion("VitrualManagerName =", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameNotEqualTo(String value) {
            addCriterion("VitrualManagerName <>", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameGreaterThan(String value) {
            addCriterion("VitrualManagerName >", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameGreaterThanOrEqualTo(String value) {
            addCriterion("VitrualManagerName >=", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameLessThan(String value) {
            addCriterion("VitrualManagerName <", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameLessThanOrEqualTo(String value) {
            addCriterion("VitrualManagerName <=", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameLike(String value) {
            addCriterion("VitrualManagerName like", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameNotLike(String value) {
            addCriterion("VitrualManagerName not like", value, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameIn(List<String> values) {
            addCriterion("VitrualManagerName in", values, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameNotIn(List<String> values) {
            addCriterion("VitrualManagerName not in", values, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameBetween(String value1, String value2) {
            addCriterion("VitrualManagerName between", value1, value2, "vitrualmanagername");
            return (Criteria) this;
        }

        public Criteria andVitrualmanagernameNotBetween(String value1, String value2) {
            addCriterion("VitrualManagerName not between", value1, value2, "vitrualmanagername");
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