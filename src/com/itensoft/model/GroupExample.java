package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class GroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andInheritsetIsNull() {
            addCriterion("InheritSet is null");
            return (Criteria) this;
        }

        public Criteria andInheritsetIsNotNull() {
            addCriterion("InheritSet is not null");
            return (Criteria) this;
        }

        public Criteria andInheritsetEqualTo(String value) {
            addCriterion("InheritSet =", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetNotEqualTo(String value) {
            addCriterion("InheritSet <>", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetGreaterThan(String value) {
            addCriterion("InheritSet >", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetGreaterThanOrEqualTo(String value) {
            addCriterion("InheritSet >=", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetLessThan(String value) {
            addCriterion("InheritSet <", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetLessThanOrEqualTo(String value) {
            addCriterion("InheritSet <=", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetLike(String value) {
            addCriterion("InheritSet like", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetNotLike(String value) {
            addCriterion("InheritSet not like", value, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetIn(List<String> values) {
            addCriterion("InheritSet in", values, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetNotIn(List<String> values) {
            addCriterion("InheritSet not in", values, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetBetween(String value1, String value2) {
            addCriterion("InheritSet between", value1, value2, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritsetNotBetween(String value1, String value2) {
            addCriterion("InheritSet not between", value1, value2, "inheritset");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramIsNull() {
            addCriterion("InheritPlainProgram is null");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramIsNotNull() {
            addCriterion("InheritPlainProgram is not null");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramEqualTo(String value) {
            addCriterion("InheritPlainProgram =", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramNotEqualTo(String value) {
            addCriterion("InheritPlainProgram <>", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramGreaterThan(String value) {
            addCriterion("InheritPlainProgram >", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramGreaterThanOrEqualTo(String value) {
            addCriterion("InheritPlainProgram >=", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramLessThan(String value) {
            addCriterion("InheritPlainProgram <", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramLessThanOrEqualTo(String value) {
            addCriterion("InheritPlainProgram <=", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramLike(String value) {
            addCriterion("InheritPlainProgram like", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramNotLike(String value) {
            addCriterion("InheritPlainProgram not like", value, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramIn(List<String> values) {
            addCriterion("InheritPlainProgram in", values, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramNotIn(List<String> values) {
            addCriterion("InheritPlainProgram not in", values, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramBetween(String value1, String value2) {
            addCriterion("InheritPlainProgram between", value1, value2, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritplainprogramNotBetween(String value1, String value2) {
            addCriterion("InheritPlainProgram not between", value1, value2, "inheritplainprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramIsNull() {
            addCriterion("InheritBlackProgram is null");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramIsNotNull() {
            addCriterion("InheritBlackProgram is not null");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramEqualTo(String value) {
            addCriterion("InheritBlackProgram =", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramNotEqualTo(String value) {
            addCriterion("InheritBlackProgram <>", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramGreaterThan(String value) {
            addCriterion("InheritBlackProgram >", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramGreaterThanOrEqualTo(String value) {
            addCriterion("InheritBlackProgram >=", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramLessThan(String value) {
            addCriterion("InheritBlackProgram <", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramLessThanOrEqualTo(String value) {
            addCriterion("InheritBlackProgram <=", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramLike(String value) {
            addCriterion("InheritBlackProgram like", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramNotLike(String value) {
            addCriterion("InheritBlackProgram not like", value, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramIn(List<String> values) {
            addCriterion("InheritBlackProgram in", values, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramNotIn(List<String> values) {
            addCriterion("InheritBlackProgram not in", values, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramBetween(String value1, String value2) {
            addCriterion("InheritBlackProgram between", value1, value2, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritblackprogramNotBetween(String value1, String value2) {
            addCriterion("InheritBlackProgram not between", value1, value2, "inheritblackprogram");
            return (Criteria) this;
        }

        public Criteria andInheritrcvIsNull() {
            addCriterion("InheritRcv is null");
            return (Criteria) this;
        }

        public Criteria andInheritrcvIsNotNull() {
            addCriterion("InheritRcv is not null");
            return (Criteria) this;
        }

        public Criteria andInheritrcvEqualTo(String value) {
            addCriterion("InheritRcv =", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvNotEqualTo(String value) {
            addCriterion("InheritRcv <>", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvGreaterThan(String value) {
            addCriterion("InheritRcv >", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvGreaterThanOrEqualTo(String value) {
            addCriterion("InheritRcv >=", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvLessThan(String value) {
            addCriterion("InheritRcv <", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvLessThanOrEqualTo(String value) {
            addCriterion("InheritRcv <=", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvLike(String value) {
            addCriterion("InheritRcv like", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvNotLike(String value) {
            addCriterion("InheritRcv not like", value, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvIn(List<String> values) {
            addCriterion("InheritRcv in", values, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvNotIn(List<String> values) {
            addCriterion("InheritRcv not in", values, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvBetween(String value1, String value2) {
            addCriterion("InheritRcv between", value1, value2, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritrcvNotBetween(String value1, String value2) {
            addCriterion("InheritRcv not between", value1, value2, "inheritrcv");
            return (Criteria) this;
        }

        public Criteria andInheritidentityIsNull() {
            addCriterion("InheritIdentity is null");
            return (Criteria) this;
        }

        public Criteria andInheritidentityIsNotNull() {
            addCriterion("InheritIdentity is not null");
            return (Criteria) this;
        }

        public Criteria andInheritidentityEqualTo(String value) {
            addCriterion("InheritIdentity =", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityNotEqualTo(String value) {
            addCriterion("InheritIdentity <>", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityGreaterThan(String value) {
            addCriterion("InheritIdentity >", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityGreaterThanOrEqualTo(String value) {
            addCriterion("InheritIdentity >=", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityLessThan(String value) {
            addCriterion("InheritIdentity <", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityLessThanOrEqualTo(String value) {
            addCriterion("InheritIdentity <=", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityLike(String value) {
            addCriterion("InheritIdentity like", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityNotLike(String value) {
            addCriterion("InheritIdentity not like", value, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityIn(List<String> values) {
            addCriterion("InheritIdentity in", values, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityNotIn(List<String> values) {
            addCriterion("InheritIdentity not in", values, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityBetween(String value1, String value2) {
            addCriterion("InheritIdentity between", value1, value2, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritidentityNotBetween(String value1, String value2) {
            addCriterion("InheritIdentity not between", value1, value2, "inheritidentity");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerIsNull() {
            addCriterion("InheritVirtualManager is null");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerIsNotNull() {
            addCriterion("InheritVirtualManager is not null");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerEqualTo(String value) {
            addCriterion("InheritVirtualManager =", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerNotEqualTo(String value) {
            addCriterion("InheritVirtualManager <>", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerGreaterThan(String value) {
            addCriterion("InheritVirtualManager >", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("InheritVirtualManager >=", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerLessThan(String value) {
            addCriterion("InheritVirtualManager <", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerLessThanOrEqualTo(String value) {
            addCriterion("InheritVirtualManager <=", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerLike(String value) {
            addCriterion("InheritVirtualManager like", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerNotLike(String value) {
            addCriterion("InheritVirtualManager not like", value, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerIn(List<String> values) {
            addCriterion("InheritVirtualManager in", values, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerNotIn(List<String> values) {
            addCriterion("InheritVirtualManager not in", values, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerBetween(String value1, String value2) {
            addCriterion("InheritVirtualManager between", value1, value2, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andInheritvirtualmanagerNotBetween(String value1, String value2) {
            addCriterion("InheritVirtualManager not between", value1, value2, "inheritvirtualmanager");
            return (Criteria) this;
        }

        public Criteria andPolicycodeIsNull() {
            addCriterion("PolicyCode is null");
            return (Criteria) this;
        }

        public Criteria andPolicycodeIsNotNull() {
            addCriterion("PolicyCode is not null");
            return (Criteria) this;
        }

        public Criteria andPolicycodeEqualTo(Integer value) {
            addCriterion("PolicyCode =", value, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeNotEqualTo(Integer value) {
            addCriterion("PolicyCode <>", value, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeGreaterThan(Integer value) {
            addCriterion("PolicyCode >", value, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PolicyCode >=", value, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeLessThan(Integer value) {
            addCriterion("PolicyCode <", value, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeLessThanOrEqualTo(Integer value) {
            addCriterion("PolicyCode <=", value, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeIn(List<Integer> values) {
            addCriterion("PolicyCode in", values, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeNotIn(List<Integer> values) {
            addCriterion("PolicyCode not in", values, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeBetween(Integer value1, Integer value2) {
            addCriterion("PolicyCode between", value1, value2, "policycode");
            return (Criteria) this;
        }

        public Criteria andPolicycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PolicyCode not between", value1, value2, "policycode");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("HostName is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("HostName is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("HostName =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("HostName <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("HostName >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("HostName >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("HostName <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("HostName <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("HostName like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("HostName not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("HostName in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("HostName not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("HostName between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("HostName not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andAuditedIsNull() {
            addCriterion("Audited is null");
            return (Criteria) this;
        }

        public Criteria andAuditedIsNotNull() {
            addCriterion("Audited is not null");
            return (Criteria) this;
        }

        public Criteria andAuditedEqualTo(String value) {
            addCriterion("Audited =", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedNotEqualTo(String value) {
            addCriterion("Audited <>", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedGreaterThan(String value) {
            addCriterion("Audited >", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedGreaterThanOrEqualTo(String value) {
            addCriterion("Audited >=", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedLessThan(String value) {
            addCriterion("Audited <", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedLessThanOrEqualTo(String value) {
            addCriterion("Audited <=", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedLike(String value) {
            addCriterion("Audited like", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedNotLike(String value) {
            addCriterion("Audited not like", value, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedIn(List<String> values) {
            addCriterion("Audited in", values, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedNotIn(List<String> values) {
            addCriterion("Audited not in", values, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedBetween(String value1, String value2) {
            addCriterion("Audited between", value1, value2, "audited");
            return (Criteria) this;
        }

        public Criteria andAuditedNotBetween(String value1, String value2) {
            addCriterion("Audited not between", value1, value2, "audited");
            return (Criteria) this;
        }

        public Criteria andRefreshidIsNull() {
            addCriterion("RefreshId is null");
            return (Criteria) this;
        }

        public Criteria andRefreshidIsNotNull() {
            addCriterion("RefreshId is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshidEqualTo(Integer value) {
            addCriterion("RefreshId =", value, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidNotEqualTo(Integer value) {
            addCriterion("RefreshId <>", value, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidGreaterThan(Integer value) {
            addCriterion("RefreshId >", value, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RefreshId >=", value, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidLessThan(Integer value) {
            addCriterion("RefreshId <", value, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidLessThanOrEqualTo(Integer value) {
            addCriterion("RefreshId <=", value, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidIn(List<Integer> values) {
            addCriterion("RefreshId in", values, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidNotIn(List<Integer> values) {
            addCriterion("RefreshId not in", values, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidBetween(Integer value1, Integer value2) {
            addCriterion("RefreshId between", value1, value2, "refreshid");
            return (Criteria) this;
        }

        public Criteria andRefreshidNotBetween(Integer value1, Integer value2) {
            addCriterion("RefreshId not between", value1, value2, "refreshid");
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