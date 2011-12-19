package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class ScanplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScanplanExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIncludeIsNull() {
            addCriterion("Include is null");
            return (Criteria) this;
        }

        public Criteria andIncludeIsNotNull() {
            addCriterion("Include is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeEqualTo(String value) {
            addCriterion("Include =", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotEqualTo(String value) {
            addCriterion("Include <>", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeGreaterThan(String value) {
            addCriterion("Include >", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeGreaterThanOrEqualTo(String value) {
            addCriterion("Include >=", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeLessThan(String value) {
            addCriterion("Include <", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeLessThanOrEqualTo(String value) {
            addCriterion("Include <=", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeLike(String value) {
            addCriterion("Include like", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotLike(String value) {
            addCriterion("Include not like", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeIn(List<String> values) {
            addCriterion("Include in", values, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotIn(List<String> values) {
            addCriterion("Include not in", values, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeBetween(String value1, String value2) {
            addCriterion("Include between", value1, value2, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotBetween(String value1, String value2) {
            addCriterion("Include not between", value1, value2, "include");
            return (Criteria) this;
        }

        public Criteria andExcludeIsNull() {
            addCriterion("Exclude is null");
            return (Criteria) this;
        }

        public Criteria andExcludeIsNotNull() {
            addCriterion("Exclude is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeEqualTo(String value) {
            addCriterion("Exclude =", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeNotEqualTo(String value) {
            addCriterion("Exclude <>", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeGreaterThan(String value) {
            addCriterion("Exclude >", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeGreaterThanOrEqualTo(String value) {
            addCriterion("Exclude >=", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeLessThan(String value) {
            addCriterion("Exclude <", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeLessThanOrEqualTo(String value) {
            addCriterion("Exclude <=", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeLike(String value) {
            addCriterion("Exclude like", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeNotLike(String value) {
            addCriterion("Exclude not like", value, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeIn(List<String> values) {
            addCriterion("Exclude in", values, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeNotIn(List<String> values) {
            addCriterion("Exclude not in", values, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeBetween(String value1, String value2) {
            addCriterion("Exclude between", value1, value2, "exclude");
            return (Criteria) this;
        }

        public Criteria andExcludeNotBetween(String value1, String value2) {
            addCriterion("Exclude not between", value1, value2, "exclude");
            return (Criteria) this;
        }

        public Criteria andIgnoresysIsNull() {
            addCriterion("IgnoreSys is null");
            return (Criteria) this;
        }

        public Criteria andIgnoresysIsNotNull() {
            addCriterion("IgnoreSys is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoresysEqualTo(String value) {
            addCriterion("IgnoreSys =", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysNotEqualTo(String value) {
            addCriterion("IgnoreSys <>", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysGreaterThan(String value) {
            addCriterion("IgnoreSys >", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysGreaterThanOrEqualTo(String value) {
            addCriterion("IgnoreSys >=", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysLessThan(String value) {
            addCriterion("IgnoreSys <", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysLessThanOrEqualTo(String value) {
            addCriterion("IgnoreSys <=", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysLike(String value) {
            addCriterion("IgnoreSys like", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysNotLike(String value) {
            addCriterion("IgnoreSys not like", value, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysIn(List<String> values) {
            addCriterion("IgnoreSys in", values, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysNotIn(List<String> values) {
            addCriterion("IgnoreSys not in", values, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysBetween(String value1, String value2) {
            addCriterion("IgnoreSys between", value1, value2, "ignoresys");
            return (Criteria) this;
        }

        public Criteria andIgnoresysNotBetween(String value1, String value2) {
            addCriterion("IgnoreSys not between", value1, value2, "ignoresys");
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