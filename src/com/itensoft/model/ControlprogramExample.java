package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class ControlprogramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ControlprogramExample() {
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

        public Criteria andExcludefileIsNull() {
            addCriterion("ExcludeFile is null");
            return (Criteria) this;
        }

        public Criteria andExcludefileIsNotNull() {
            addCriterion("ExcludeFile is not null");
            return (Criteria) this;
        }

        public Criteria andExcludefileEqualTo(String value) {
            addCriterion("ExcludeFile =", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileNotEqualTo(String value) {
            addCriterion("ExcludeFile <>", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileGreaterThan(String value) {
            addCriterion("ExcludeFile >", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileGreaterThanOrEqualTo(String value) {
            addCriterion("ExcludeFile >=", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileLessThan(String value) {
            addCriterion("ExcludeFile <", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileLessThanOrEqualTo(String value) {
            addCriterion("ExcludeFile <=", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileLike(String value) {
            addCriterion("ExcludeFile like", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileNotLike(String value) {
            addCriterion("ExcludeFile not like", value, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileIn(List<String> values) {
            addCriterion("ExcludeFile in", values, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileNotIn(List<String> values) {
            addCriterion("ExcludeFile not in", values, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileBetween(String value1, String value2) {
            addCriterion("ExcludeFile between", value1, value2, "excludefile");
            return (Criteria) this;
        }

        public Criteria andExcludefileNotBetween(String value1, String value2) {
            addCriterion("ExcludeFile not between", value1, value2, "excludefile");
            return (Criteria) this;
        }

        public Criteria andNeedinjectIsNull() {
            addCriterion("NeedInject is null");
            return (Criteria) this;
        }

        public Criteria andNeedinjectIsNotNull() {
            addCriterion("NeedInject is not null");
            return (Criteria) this;
        }

        public Criteria andNeedinjectEqualTo(String value) {
            addCriterion("NeedInject =", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectNotEqualTo(String value) {
            addCriterion("NeedInject <>", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectGreaterThan(String value) {
            addCriterion("NeedInject >", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectGreaterThanOrEqualTo(String value) {
            addCriterion("NeedInject >=", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectLessThan(String value) {
            addCriterion("NeedInject <", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectLessThanOrEqualTo(String value) {
            addCriterion("NeedInject <=", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectLike(String value) {
            addCriterion("NeedInject like", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectNotLike(String value) {
            addCriterion("NeedInject not like", value, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectIn(List<String> values) {
            addCriterion("NeedInject in", values, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectNotIn(List<String> values) {
            addCriterion("NeedInject not in", values, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectBetween(String value1, String value2) {
            addCriterion("NeedInject between", value1, value2, "needinject");
            return (Criteria) this;
        }

        public Criteria andNeedinjectNotBetween(String value1, String value2) {
            addCriterion("NeedInject not between", value1, value2, "needinject");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("Md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("Md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("Md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("Md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("Md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("Md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("Md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("Md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("Md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("Md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("Md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("Md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("Md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("Md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIsNull() {
            addCriterion("OriginalFileName is null");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIsNotNull() {
            addCriterion("OriginalFileName is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameEqualTo(String value) {
            addCriterion("OriginalFileName =", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotEqualTo(String value) {
            addCriterion("OriginalFileName <>", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameGreaterThan(String value) {
            addCriterion("OriginalFileName >", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("OriginalFileName >=", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLessThan(String value) {
            addCriterion("OriginalFileName <", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLessThanOrEqualTo(String value) {
            addCriterion("OriginalFileName <=", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameLike(String value) {
            addCriterion("OriginalFileName like", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotLike(String value) {
            addCriterion("OriginalFileName not like", value, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameIn(List<String> values) {
            addCriterion("OriginalFileName in", values, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotIn(List<String> values) {
            addCriterion("OriginalFileName not in", values, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameBetween(String value1, String value2) {
            addCriterion("OriginalFileName between", value1, value2, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andOriginalfilenameNotBetween(String value1, String value2) {
            addCriterion("OriginalFileName not between", value1, value2, "originalfilename");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andIncludefileIsNull() {
            addCriterion("IncludeFile is null");
            return (Criteria) this;
        }

        public Criteria andIncludefileIsNotNull() {
            addCriterion("IncludeFile is not null");
            return (Criteria) this;
        }

        public Criteria andIncludefileEqualTo(String value) {
            addCriterion("IncludeFile =", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileNotEqualTo(String value) {
            addCriterion("IncludeFile <>", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileGreaterThan(String value) {
            addCriterion("IncludeFile >", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileGreaterThanOrEqualTo(String value) {
            addCriterion("IncludeFile >=", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileLessThan(String value) {
            addCriterion("IncludeFile <", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileLessThanOrEqualTo(String value) {
            addCriterion("IncludeFile <=", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileLike(String value) {
            addCriterion("IncludeFile like", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileNotLike(String value) {
            addCriterion("IncludeFile not like", value, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileIn(List<String> values) {
            addCriterion("IncludeFile in", values, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileNotIn(List<String> values) {
            addCriterion("IncludeFile not in", values, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileBetween(String value1, String value2) {
            addCriterion("IncludeFile between", value1, value2, "includefile");
            return (Criteria) this;
        }

        public Criteria andIncludefileNotBetween(String value1, String value2) {
            addCriterion("IncludeFile not between", value1, value2, "includefile");
            return (Criteria) this;
        }

        public Criteria andClosewriteIsNull() {
            addCriterion("CloseWrite is null");
            return (Criteria) this;
        }

        public Criteria andClosewriteIsNotNull() {
            addCriterion("CloseWrite is not null");
            return (Criteria) this;
        }

        public Criteria andClosewriteEqualTo(String value) {
            addCriterion("CloseWrite =", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteNotEqualTo(String value) {
            addCriterion("CloseWrite <>", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteGreaterThan(String value) {
            addCriterion("CloseWrite >", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteGreaterThanOrEqualTo(String value) {
            addCriterion("CloseWrite >=", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteLessThan(String value) {
            addCriterion("CloseWrite <", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteLessThanOrEqualTo(String value) {
            addCriterion("CloseWrite <=", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteLike(String value) {
            addCriterion("CloseWrite like", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteNotLike(String value) {
            addCriterion("CloseWrite not like", value, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteIn(List<String> values) {
            addCriterion("CloseWrite in", values, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteNotIn(List<String> values) {
            addCriterion("CloseWrite not in", values, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteBetween(String value1, String value2) {
            addCriterion("CloseWrite between", value1, value2, "closewrite");
            return (Criteria) this;
        }

        public Criteria andClosewriteNotBetween(String value1, String value2) {
            addCriterion("CloseWrite not between", value1, value2, "closewrite");
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

        public Criteria andRestrictedformcountIsNull() {
            addCriterion("RestrictedFormCount is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountIsNotNull() {
            addCriterion("RestrictedFormCount is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountEqualTo(Integer value) {
            addCriterion("RestrictedFormCount =", value, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountNotEqualTo(Integer value) {
            addCriterion("RestrictedFormCount <>", value, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountGreaterThan(Integer value) {
            addCriterion("RestrictedFormCount >", value, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RestrictedFormCount >=", value, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountLessThan(Integer value) {
            addCriterion("RestrictedFormCount <", value, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountLessThanOrEqualTo(Integer value) {
            addCriterion("RestrictedFormCount <=", value, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountIn(List<Integer> values) {
            addCriterion("RestrictedFormCount in", values, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountNotIn(List<Integer> values) {
            addCriterion("RestrictedFormCount not in", values, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountBetween(Integer value1, Integer value2) {
            addCriterion("RestrictedFormCount between", value1, value2, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andRestrictedformcountNotBetween(Integer value1, Integer value2) {
            addCriterion("RestrictedFormCount not between", value1, value2, "restrictedformcount");
            return (Criteria) this;
        }

        public Criteria andSignsubjectIsNull() {
            addCriterion("SignSubject is null");
            return (Criteria) this;
        }

        public Criteria andSignsubjectIsNotNull() {
            addCriterion("SignSubject is not null");
            return (Criteria) this;
        }

        public Criteria andSignsubjectEqualTo(String value) {
            addCriterion("SignSubject =", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectNotEqualTo(String value) {
            addCriterion("SignSubject <>", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectGreaterThan(String value) {
            addCriterion("SignSubject >", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SignSubject >=", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectLessThan(String value) {
            addCriterion("SignSubject <", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectLessThanOrEqualTo(String value) {
            addCriterion("SignSubject <=", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectLike(String value) {
            addCriterion("SignSubject like", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectNotLike(String value) {
            addCriterion("SignSubject not like", value, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectIn(List<String> values) {
            addCriterion("SignSubject in", values, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectNotIn(List<String> values) {
            addCriterion("SignSubject not in", values, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectBetween(String value1, String value2) {
            addCriterion("SignSubject between", value1, value2, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignsubjectNotBetween(String value1, String value2) {
            addCriterion("SignSubject not between", value1, value2, "signsubject");
            return (Criteria) this;
        }

        public Criteria andSignissuerIsNull() {
            addCriterion("SignIssuer is null");
            return (Criteria) this;
        }

        public Criteria andSignissuerIsNotNull() {
            addCriterion("SignIssuer is not null");
            return (Criteria) this;
        }

        public Criteria andSignissuerEqualTo(String value) {
            addCriterion("SignIssuer =", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerNotEqualTo(String value) {
            addCriterion("SignIssuer <>", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerGreaterThan(String value) {
            addCriterion("SignIssuer >", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerGreaterThanOrEqualTo(String value) {
            addCriterion("SignIssuer >=", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerLessThan(String value) {
            addCriterion("SignIssuer <", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerLessThanOrEqualTo(String value) {
            addCriterion("SignIssuer <=", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerLike(String value) {
            addCriterion("SignIssuer like", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerNotLike(String value) {
            addCriterion("SignIssuer not like", value, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerIn(List<String> values) {
            addCriterion("SignIssuer in", values, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerNotIn(List<String> values) {
            addCriterion("SignIssuer not in", values, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerBetween(String value1, String value2) {
            addCriterion("SignIssuer between", value1, value2, "signissuer");
            return (Criteria) this;
        }

        public Criteria andSignissuerNotBetween(String value1, String value2) {
            addCriterion("SignIssuer not between", value1, value2, "signissuer");
            return (Criteria) this;
        }

        public Criteria andLicenseclassIsNull() {
            addCriterion("LicenseClass is null");
            return (Criteria) this;
        }

        public Criteria andLicenseclassIsNotNull() {
            addCriterion("LicenseClass is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseclassEqualTo(Integer value) {
            addCriterion("LicenseClass =", value, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassNotEqualTo(Integer value) {
            addCriterion("LicenseClass <>", value, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassGreaterThan(Integer value) {
            addCriterion("LicenseClass >", value, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("LicenseClass >=", value, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassLessThan(Integer value) {
            addCriterion("LicenseClass <", value, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassLessThanOrEqualTo(Integer value) {
            addCriterion("LicenseClass <=", value, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassIn(List<Integer> values) {
            addCriterion("LicenseClass in", values, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassNotIn(List<Integer> values) {
            addCriterion("LicenseClass not in", values, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassBetween(Integer value1, Integer value2) {
            addCriterion("LicenseClass between", value1, value2, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andLicenseclassNotBetween(Integer value1, Integer value2) {
            addCriterion("LicenseClass not between", value1, value2, "licenseclass");
            return (Criteria) this;
        }

        public Criteria andMapIsNull() {
            addCriterion("Map is null");
            return (Criteria) this;
        }

        public Criteria andMapIsNotNull() {
            addCriterion("Map is not null");
            return (Criteria) this;
        }

        public Criteria andMapEqualTo(String value) {
            addCriterion("Map =", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotEqualTo(String value) {
            addCriterion("Map <>", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapGreaterThan(String value) {
            addCriterion("Map >", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapGreaterThanOrEqualTo(String value) {
            addCriterion("Map >=", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapLessThan(String value) {
            addCriterion("Map <", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapLessThanOrEqualTo(String value) {
            addCriterion("Map <=", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapLike(String value) {
            addCriterion("Map like", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotLike(String value) {
            addCriterion("Map not like", value, "map");
            return (Criteria) this;
        }

        public Criteria andMapIn(List<String> values) {
            addCriterion("Map in", values, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotIn(List<String> values) {
            addCriterion("Map not in", values, "map");
            return (Criteria) this;
        }

        public Criteria andMapBetween(String value1, String value2) {
            addCriterion("Map between", value1, value2, "map");
            return (Criteria) this;
        }

        public Criteria andMapNotBetween(String value1, String value2) {
            addCriterion("Map not between", value1, value2, "map");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedIsNull() {
            addCriterion("SubProcessInherited is null");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedIsNotNull() {
            addCriterion("SubProcessInherited is not null");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedEqualTo(String value) {
            addCriterion("SubProcessInherited =", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedNotEqualTo(String value) {
            addCriterion("SubProcessInherited <>", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedGreaterThan(String value) {
            addCriterion("SubProcessInherited >", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedGreaterThanOrEqualTo(String value) {
            addCriterion("SubProcessInherited >=", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedLessThan(String value) {
            addCriterion("SubProcessInherited <", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedLessThanOrEqualTo(String value) {
            addCriterion("SubProcessInherited <=", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedLike(String value) {
            addCriterion("SubProcessInherited like", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedNotLike(String value) {
            addCriterion("SubProcessInherited not like", value, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedIn(List<String> values) {
            addCriterion("SubProcessInherited in", values, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedNotIn(List<String> values) {
            addCriterion("SubProcessInherited not in", values, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedBetween(String value1, String value2) {
            addCriterion("SubProcessInherited between", value1, value2, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andSubprocessinheritedNotBetween(String value1, String value2) {
            addCriterion("SubProcessInherited not between", value1, value2, "subprocessinherited");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostIsNull() {
            addCriterion("CreateBySvchost is null");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostIsNotNull() {
            addCriterion("CreateBySvchost is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostEqualTo(String value) {
            addCriterion("CreateBySvchost =", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostNotEqualTo(String value) {
            addCriterion("CreateBySvchost <>", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostGreaterThan(String value) {
            addCriterion("CreateBySvchost >", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostGreaterThanOrEqualTo(String value) {
            addCriterion("CreateBySvchost >=", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostLessThan(String value) {
            addCriterion("CreateBySvchost <", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostLessThanOrEqualTo(String value) {
            addCriterion("CreateBySvchost <=", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostLike(String value) {
            addCriterion("CreateBySvchost like", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostNotLike(String value) {
            addCriterion("CreateBySvchost not like", value, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostIn(List<String> values) {
            addCriterion("CreateBySvchost in", values, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostNotIn(List<String> values) {
            addCriterion("CreateBySvchost not in", values, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostBetween(String value1, String value2) {
            addCriterion("CreateBySvchost between", value1, value2, "createbysvchost");
            return (Criteria) this;
        }

        public Criteria andCreatebysvchostNotBetween(String value1, String value2) {
            addCriterion("CreateBySvchost not between", value1, value2, "createbysvchost");
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