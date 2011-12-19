package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class BlackprogramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlackprogramExample() {
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

        public Criteria andParentcodeIsNull() {
            addCriterion("ParentCode is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("ParentCode is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(Integer value) {
            addCriterion("ParentCode =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(Integer value) {
            addCriterion("ParentCode <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(Integer value) {
            addCriterion("ParentCode >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentCode >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(Integer value) {
            addCriterion("ParentCode <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(Integer value) {
            addCriterion("ParentCode <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<Integer> values) {
            addCriterion("ParentCode in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<Integer> values) {
            addCriterion("ParentCode not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(Integer value1, Integer value2) {
            addCriterion("ParentCode between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentCode not between", value1, value2, "parentcode");
            return (Criteria) this;
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

        public Criteria andExenameIsNull() {
            addCriterion("ExeName is null");
            return (Criteria) this;
        }

        public Criteria andExenameIsNotNull() {
            addCriterion("ExeName is not null");
            return (Criteria) this;
        }

        public Criteria andExenameEqualTo(String value) {
            addCriterion("ExeName =", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameNotEqualTo(String value) {
            addCriterion("ExeName <>", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameGreaterThan(String value) {
            addCriterion("ExeName >", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameGreaterThanOrEqualTo(String value) {
            addCriterion("ExeName >=", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameLessThan(String value) {
            addCriterion("ExeName <", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameLessThanOrEqualTo(String value) {
            addCriterion("ExeName <=", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameLike(String value) {
            addCriterion("ExeName like", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameNotLike(String value) {
            addCriterion("ExeName not like", value, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameIn(List<String> values) {
            addCriterion("ExeName in", values, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameNotIn(List<String> values) {
            addCriterion("ExeName not in", values, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameBetween(String value1, String value2) {
            addCriterion("ExeName between", value1, value2, "exename");
            return (Criteria) this;
        }

        public Criteria andExenameNotBetween(String value1, String value2) {
            addCriterion("ExeName not between", value1, value2, "exename");
            return (Criteria) this;
        }

        public Criteria andWndclassnameIsNull() {
            addCriterion("WndClassName is null");
            return (Criteria) this;
        }

        public Criteria andWndclassnameIsNotNull() {
            addCriterion("WndClassName is not null");
            return (Criteria) this;
        }

        public Criteria andWndclassnameEqualTo(String value) {
            addCriterion("WndClassName =", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameNotEqualTo(String value) {
            addCriterion("WndClassName <>", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameGreaterThan(String value) {
            addCriterion("WndClassName >", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("WndClassName >=", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameLessThan(String value) {
            addCriterion("WndClassName <", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameLessThanOrEqualTo(String value) {
            addCriterion("WndClassName <=", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameLike(String value) {
            addCriterion("WndClassName like", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameNotLike(String value) {
            addCriterion("WndClassName not like", value, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameIn(List<String> values) {
            addCriterion("WndClassName in", values, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameNotIn(List<String> values) {
            addCriterion("WndClassName not in", values, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameBetween(String value1, String value2) {
            addCriterion("WndClassName between", value1, value2, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andWndclassnameNotBetween(String value1, String value2) {
            addCriterion("WndClassName not between", value1, value2, "wndclassname");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("Caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("Caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("Caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("Caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("Caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("Caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("Caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("Caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("Caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("Caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("Caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("Caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("Caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("Caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIsNull() {
            addCriterion("OriginalFilename is null");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIsNotNull() {
            addCriterion("OriginalFilename is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameEqualTo(String value) {
            addCriterion("OriginalFilename =", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotEqualTo(String value) {
            addCriterion("OriginalFilename <>", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameGreaterThan(String value) {
            addCriterion("OriginalFilename >", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("OriginalFilename >=", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLessThan(String value) {
            addCriterion("OriginalFilename <", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLessThanOrEqualTo(String value) {
            addCriterion("OriginalFilename <=", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLike(String value) {
            addCriterion("OriginalFilename like", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotLike(String value) {
            addCriterion("OriginalFilename not like", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIn(List<String> values) {
            addCriterion("OriginalFilename in", values, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotIn(List<String> values) {
            addCriterion("OriginalFilename not in", values, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameBetween(String value1, String value2) {
            addCriterion("OriginalFilename between", value1, value2, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotBetween(String value1, String value2) {
            addCriterion("OriginalFilename not between", value1, value2, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andActivedIsNull() {
            addCriterion("Actived is null");
            return (Criteria) this;
        }

        public Criteria andActivedIsNotNull() {
            addCriterion("Actived is not null");
            return (Criteria) this;
        }

        public Criteria andActivedEqualTo(String value) {
            addCriterion("Actived =", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedNotEqualTo(String value) {
            addCriterion("Actived <>", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedGreaterThan(String value) {
            addCriterion("Actived >", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedGreaterThanOrEqualTo(String value) {
            addCriterion("Actived >=", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedLessThan(String value) {
            addCriterion("Actived <", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedLessThanOrEqualTo(String value) {
            addCriterion("Actived <=", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedLike(String value) {
            addCriterion("Actived like", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedNotLike(String value) {
            addCriterion("Actived not like", value, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedIn(List<String> values) {
            addCriterion("Actived in", values, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedNotIn(List<String> values) {
            addCriterion("Actived not in", values, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedBetween(String value1, String value2) {
            addCriterion("Actived between", value1, value2, "actived");
            return (Criteria) this;
        }

        public Criteria andActivedNotBetween(String value1, String value2) {
            addCriterion("Actived not between", value1, value2, "actived");
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