package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class VirtualmanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualmanagerExample() {
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

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
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

        public Criteria andUser1IsNull() {
            addCriterion("User1 is null");
            return (Criteria) this;
        }

        public Criteria andUser1IsNotNull() {
            addCriterion("User1 is not null");
            return (Criteria) this;
        }

        public Criteria andUser1EqualTo(String value) {
            addCriterion("User1 =", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotEqualTo(String value) {
            addCriterion("User1 <>", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1GreaterThan(String value) {
            addCriterion("User1 >", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1GreaterThanOrEqualTo(String value) {
            addCriterion("User1 >=", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1LessThan(String value) {
            addCriterion("User1 <", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1LessThanOrEqualTo(String value) {
            addCriterion("User1 <=", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1Like(String value) {
            addCriterion("User1 like", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotLike(String value) {
            addCriterion("User1 not like", value, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1In(List<String> values) {
            addCriterion("User1 in", values, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotIn(List<String> values) {
            addCriterion("User1 not in", values, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1Between(String value1, String value2) {
            addCriterion("User1 between", value1, value2, "user1");
            return (Criteria) this;
        }

        public Criteria andUser1NotBetween(String value1, String value2) {
            addCriterion("User1 not between", value1, value2, "user1");
            return (Criteria) this;
        }

        public Criteria andPriority1IsNull() {
            addCriterion("Priority1 is null");
            return (Criteria) this;
        }

        public Criteria andPriority1IsNotNull() {
            addCriterion("Priority1 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority1EqualTo(Integer value) {
            addCriterion("Priority1 =", value, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1NotEqualTo(Integer value) {
            addCriterion("Priority1 <>", value, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1GreaterThan(Integer value) {
            addCriterion("Priority1 >", value, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority1 >=", value, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1LessThan(Integer value) {
            addCriterion("Priority1 <", value, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1LessThanOrEqualTo(Integer value) {
            addCriterion("Priority1 <=", value, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1In(List<Integer> values) {
            addCriterion("Priority1 in", values, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1NotIn(List<Integer> values) {
            addCriterion("Priority1 not in", values, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1Between(Integer value1, Integer value2) {
            addCriterion("Priority1 between", value1, value2, "priority1");
            return (Criteria) this;
        }

        public Criteria andPriority1NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority1 not between", value1, value2, "priority1");
            return (Criteria) this;
        }

        public Criteria andUser2IsNull() {
            addCriterion("User2 is null");
            return (Criteria) this;
        }

        public Criteria andUser2IsNotNull() {
            addCriterion("User2 is not null");
            return (Criteria) this;
        }

        public Criteria andUser2EqualTo(String value) {
            addCriterion("User2 =", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2NotEqualTo(String value) {
            addCriterion("User2 <>", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2GreaterThan(String value) {
            addCriterion("User2 >", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2GreaterThanOrEqualTo(String value) {
            addCriterion("User2 >=", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2LessThan(String value) {
            addCriterion("User2 <", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2LessThanOrEqualTo(String value) {
            addCriterion("User2 <=", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2Like(String value) {
            addCriterion("User2 like", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2NotLike(String value) {
            addCriterion("User2 not like", value, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2In(List<String> values) {
            addCriterion("User2 in", values, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2NotIn(List<String> values) {
            addCriterion("User2 not in", values, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2Between(String value1, String value2) {
            addCriterion("User2 between", value1, value2, "user2");
            return (Criteria) this;
        }

        public Criteria andUser2NotBetween(String value1, String value2) {
            addCriterion("User2 not between", value1, value2, "user2");
            return (Criteria) this;
        }

        public Criteria andPriority2IsNull() {
            addCriterion("Priority2 is null");
            return (Criteria) this;
        }

        public Criteria andPriority2IsNotNull() {
            addCriterion("Priority2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority2EqualTo(Integer value) {
            addCriterion("Priority2 =", value, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2NotEqualTo(Integer value) {
            addCriterion("Priority2 <>", value, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2GreaterThan(Integer value) {
            addCriterion("Priority2 >", value, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority2 >=", value, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2LessThan(Integer value) {
            addCriterion("Priority2 <", value, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2LessThanOrEqualTo(Integer value) {
            addCriterion("Priority2 <=", value, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2In(List<Integer> values) {
            addCriterion("Priority2 in", values, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2NotIn(List<Integer> values) {
            addCriterion("Priority2 not in", values, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2Between(Integer value1, Integer value2) {
            addCriterion("Priority2 between", value1, value2, "priority2");
            return (Criteria) this;
        }

        public Criteria andPriority2NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority2 not between", value1, value2, "priority2");
            return (Criteria) this;
        }

        public Criteria andUser3IsNull() {
            addCriterion("User3 is null");
            return (Criteria) this;
        }

        public Criteria andUser3IsNotNull() {
            addCriterion("User3 is not null");
            return (Criteria) this;
        }

        public Criteria andUser3EqualTo(String value) {
            addCriterion("User3 =", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3NotEqualTo(String value) {
            addCriterion("User3 <>", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3GreaterThan(String value) {
            addCriterion("User3 >", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3GreaterThanOrEqualTo(String value) {
            addCriterion("User3 >=", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3LessThan(String value) {
            addCriterion("User3 <", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3LessThanOrEqualTo(String value) {
            addCriterion("User3 <=", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3Like(String value) {
            addCriterion("User3 like", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3NotLike(String value) {
            addCriterion("User3 not like", value, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3In(List<String> values) {
            addCriterion("User3 in", values, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3NotIn(List<String> values) {
            addCriterion("User3 not in", values, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3Between(String value1, String value2) {
            addCriterion("User3 between", value1, value2, "user3");
            return (Criteria) this;
        }

        public Criteria andUser3NotBetween(String value1, String value2) {
            addCriterion("User3 not between", value1, value2, "user3");
            return (Criteria) this;
        }

        public Criteria andPriority3IsNull() {
            addCriterion("Priority3 is null");
            return (Criteria) this;
        }

        public Criteria andPriority3IsNotNull() {
            addCriterion("Priority3 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority3EqualTo(Integer value) {
            addCriterion("Priority3 =", value, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3NotEqualTo(Integer value) {
            addCriterion("Priority3 <>", value, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3GreaterThan(Integer value) {
            addCriterion("Priority3 >", value, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority3 >=", value, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3LessThan(Integer value) {
            addCriterion("Priority3 <", value, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3LessThanOrEqualTo(Integer value) {
            addCriterion("Priority3 <=", value, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3In(List<Integer> values) {
            addCriterion("Priority3 in", values, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3NotIn(List<Integer> values) {
            addCriterion("Priority3 not in", values, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3Between(Integer value1, Integer value2) {
            addCriterion("Priority3 between", value1, value2, "priority3");
            return (Criteria) this;
        }

        public Criteria andPriority3NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority3 not between", value1, value2, "priority3");
            return (Criteria) this;
        }

        public Criteria andUser4IsNull() {
            addCriterion("User4 is null");
            return (Criteria) this;
        }

        public Criteria andUser4IsNotNull() {
            addCriterion("User4 is not null");
            return (Criteria) this;
        }

        public Criteria andUser4EqualTo(String value) {
            addCriterion("User4 =", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4NotEqualTo(String value) {
            addCriterion("User4 <>", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4GreaterThan(String value) {
            addCriterion("User4 >", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4GreaterThanOrEqualTo(String value) {
            addCriterion("User4 >=", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4LessThan(String value) {
            addCriterion("User4 <", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4LessThanOrEqualTo(String value) {
            addCriterion("User4 <=", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4Like(String value) {
            addCriterion("User4 like", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4NotLike(String value) {
            addCriterion("User4 not like", value, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4In(List<String> values) {
            addCriterion("User4 in", values, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4NotIn(List<String> values) {
            addCriterion("User4 not in", values, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4Between(String value1, String value2) {
            addCriterion("User4 between", value1, value2, "user4");
            return (Criteria) this;
        }

        public Criteria andUser4NotBetween(String value1, String value2) {
            addCriterion("User4 not between", value1, value2, "user4");
            return (Criteria) this;
        }

        public Criteria andPriority4IsNull() {
            addCriterion("Priority4 is null");
            return (Criteria) this;
        }

        public Criteria andPriority4IsNotNull() {
            addCriterion("Priority4 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority4EqualTo(Integer value) {
            addCriterion("Priority4 =", value, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4NotEqualTo(Integer value) {
            addCriterion("Priority4 <>", value, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4GreaterThan(Integer value) {
            addCriterion("Priority4 >", value, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority4 >=", value, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4LessThan(Integer value) {
            addCriterion("Priority4 <", value, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4LessThanOrEqualTo(Integer value) {
            addCriterion("Priority4 <=", value, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4In(List<Integer> values) {
            addCriterion("Priority4 in", values, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4NotIn(List<Integer> values) {
            addCriterion("Priority4 not in", values, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4Between(Integer value1, Integer value2) {
            addCriterion("Priority4 between", value1, value2, "priority4");
            return (Criteria) this;
        }

        public Criteria andPriority4NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority4 not between", value1, value2, "priority4");
            return (Criteria) this;
        }

        public Criteria andUser5IsNull() {
            addCriterion("User5 is null");
            return (Criteria) this;
        }

        public Criteria andUser5IsNotNull() {
            addCriterion("User5 is not null");
            return (Criteria) this;
        }

        public Criteria andUser5EqualTo(String value) {
            addCriterion("User5 =", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5NotEqualTo(String value) {
            addCriterion("User5 <>", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5GreaterThan(String value) {
            addCriterion("User5 >", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5GreaterThanOrEqualTo(String value) {
            addCriterion("User5 >=", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5LessThan(String value) {
            addCriterion("User5 <", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5LessThanOrEqualTo(String value) {
            addCriterion("User5 <=", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5Like(String value) {
            addCriterion("User5 like", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5NotLike(String value) {
            addCriterion("User5 not like", value, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5In(List<String> values) {
            addCriterion("User5 in", values, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5NotIn(List<String> values) {
            addCriterion("User5 not in", values, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5Between(String value1, String value2) {
            addCriterion("User5 between", value1, value2, "user5");
            return (Criteria) this;
        }

        public Criteria andUser5NotBetween(String value1, String value2) {
            addCriterion("User5 not between", value1, value2, "user5");
            return (Criteria) this;
        }

        public Criteria andPriority5IsNull() {
            addCriterion("Priority5 is null");
            return (Criteria) this;
        }

        public Criteria andPriority5IsNotNull() {
            addCriterion("Priority5 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority5EqualTo(Integer value) {
            addCriterion("Priority5 =", value, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5NotEqualTo(Integer value) {
            addCriterion("Priority5 <>", value, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5GreaterThan(Integer value) {
            addCriterion("Priority5 >", value, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority5 >=", value, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5LessThan(Integer value) {
            addCriterion("Priority5 <", value, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5LessThanOrEqualTo(Integer value) {
            addCriterion("Priority5 <=", value, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5In(List<Integer> values) {
            addCriterion("Priority5 in", values, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5NotIn(List<Integer> values) {
            addCriterion("Priority5 not in", values, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5Between(Integer value1, Integer value2) {
            addCriterion("Priority5 between", value1, value2, "priority5");
            return (Criteria) this;
        }

        public Criteria andPriority5NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority5 not between", value1, value2, "priority5");
            return (Criteria) this;
        }

        public Criteria andUser6IsNull() {
            addCriterion("User6 is null");
            return (Criteria) this;
        }

        public Criteria andUser6IsNotNull() {
            addCriterion("User6 is not null");
            return (Criteria) this;
        }

        public Criteria andUser6EqualTo(String value) {
            addCriterion("User6 =", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6NotEqualTo(String value) {
            addCriterion("User6 <>", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6GreaterThan(String value) {
            addCriterion("User6 >", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6GreaterThanOrEqualTo(String value) {
            addCriterion("User6 >=", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6LessThan(String value) {
            addCriterion("User6 <", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6LessThanOrEqualTo(String value) {
            addCriterion("User6 <=", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6Like(String value) {
            addCriterion("User6 like", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6NotLike(String value) {
            addCriterion("User6 not like", value, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6In(List<String> values) {
            addCriterion("User6 in", values, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6NotIn(List<String> values) {
            addCriterion("User6 not in", values, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6Between(String value1, String value2) {
            addCriterion("User6 between", value1, value2, "user6");
            return (Criteria) this;
        }

        public Criteria andUser6NotBetween(String value1, String value2) {
            addCriterion("User6 not between", value1, value2, "user6");
            return (Criteria) this;
        }

        public Criteria andPriority6IsNull() {
            addCriterion("Priority6 is null");
            return (Criteria) this;
        }

        public Criteria andPriority6IsNotNull() {
            addCriterion("Priority6 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority6EqualTo(Integer value) {
            addCriterion("Priority6 =", value, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6NotEqualTo(Integer value) {
            addCriterion("Priority6 <>", value, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6GreaterThan(Integer value) {
            addCriterion("Priority6 >", value, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority6 >=", value, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6LessThan(Integer value) {
            addCriterion("Priority6 <", value, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6LessThanOrEqualTo(Integer value) {
            addCriterion("Priority6 <=", value, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6In(List<Integer> values) {
            addCriterion("Priority6 in", values, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6NotIn(List<Integer> values) {
            addCriterion("Priority6 not in", values, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6Between(Integer value1, Integer value2) {
            addCriterion("Priority6 between", value1, value2, "priority6");
            return (Criteria) this;
        }

        public Criteria andPriority6NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority6 not between", value1, value2, "priority6");
            return (Criteria) this;
        }

        public Criteria andUser7IsNull() {
            addCriterion("User7 is null");
            return (Criteria) this;
        }

        public Criteria andUser7IsNotNull() {
            addCriterion("User7 is not null");
            return (Criteria) this;
        }

        public Criteria andUser7EqualTo(String value) {
            addCriterion("User7 =", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7NotEqualTo(String value) {
            addCriterion("User7 <>", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7GreaterThan(String value) {
            addCriterion("User7 >", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7GreaterThanOrEqualTo(String value) {
            addCriterion("User7 >=", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7LessThan(String value) {
            addCriterion("User7 <", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7LessThanOrEqualTo(String value) {
            addCriterion("User7 <=", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7Like(String value) {
            addCriterion("User7 like", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7NotLike(String value) {
            addCriterion("User7 not like", value, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7In(List<String> values) {
            addCriterion("User7 in", values, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7NotIn(List<String> values) {
            addCriterion("User7 not in", values, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7Between(String value1, String value2) {
            addCriterion("User7 between", value1, value2, "user7");
            return (Criteria) this;
        }

        public Criteria andUser7NotBetween(String value1, String value2) {
            addCriterion("User7 not between", value1, value2, "user7");
            return (Criteria) this;
        }

        public Criteria andPriority7IsNull() {
            addCriterion("Priority7 is null");
            return (Criteria) this;
        }

        public Criteria andPriority7IsNotNull() {
            addCriterion("Priority7 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority7EqualTo(Integer value) {
            addCriterion("Priority7 =", value, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7NotEqualTo(Integer value) {
            addCriterion("Priority7 <>", value, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7GreaterThan(Integer value) {
            addCriterion("Priority7 >", value, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority7 >=", value, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7LessThan(Integer value) {
            addCriterion("Priority7 <", value, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7LessThanOrEqualTo(Integer value) {
            addCriterion("Priority7 <=", value, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7In(List<Integer> values) {
            addCriterion("Priority7 in", values, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7NotIn(List<Integer> values) {
            addCriterion("Priority7 not in", values, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7Between(Integer value1, Integer value2) {
            addCriterion("Priority7 between", value1, value2, "priority7");
            return (Criteria) this;
        }

        public Criteria andPriority7NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority7 not between", value1, value2, "priority7");
            return (Criteria) this;
        }

        public Criteria andUser8IsNull() {
            addCriterion("User8 is null");
            return (Criteria) this;
        }

        public Criteria andUser8IsNotNull() {
            addCriterion("User8 is not null");
            return (Criteria) this;
        }

        public Criteria andUser8EqualTo(String value) {
            addCriterion("User8 =", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8NotEqualTo(String value) {
            addCriterion("User8 <>", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8GreaterThan(String value) {
            addCriterion("User8 >", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8GreaterThanOrEqualTo(String value) {
            addCriterion("User8 >=", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8LessThan(String value) {
            addCriterion("User8 <", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8LessThanOrEqualTo(String value) {
            addCriterion("User8 <=", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8Like(String value) {
            addCriterion("User8 like", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8NotLike(String value) {
            addCriterion("User8 not like", value, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8In(List<String> values) {
            addCriterion("User8 in", values, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8NotIn(List<String> values) {
            addCriterion("User8 not in", values, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8Between(String value1, String value2) {
            addCriterion("User8 between", value1, value2, "user8");
            return (Criteria) this;
        }

        public Criteria andUser8NotBetween(String value1, String value2) {
            addCriterion("User8 not between", value1, value2, "user8");
            return (Criteria) this;
        }

        public Criteria andPriority8IsNull() {
            addCriterion("Priority8 is null");
            return (Criteria) this;
        }

        public Criteria andPriority8IsNotNull() {
            addCriterion("Priority8 is not null");
            return (Criteria) this;
        }

        public Criteria andPriority8EqualTo(Integer value) {
            addCriterion("Priority8 =", value, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8NotEqualTo(Integer value) {
            addCriterion("Priority8 <>", value, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8GreaterThan(Integer value) {
            addCriterion("Priority8 >", value, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8GreaterThanOrEqualTo(Integer value) {
            addCriterion("Priority8 >=", value, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8LessThan(Integer value) {
            addCriterion("Priority8 <", value, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8LessThanOrEqualTo(Integer value) {
            addCriterion("Priority8 <=", value, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8In(List<Integer> values) {
            addCriterion("Priority8 in", values, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8NotIn(List<Integer> values) {
            addCriterion("Priority8 not in", values, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8Between(Integer value1, Integer value2) {
            addCriterion("Priority8 between", value1, value2, "priority8");
            return (Criteria) this;
        }

        public Criteria andPriority8NotBetween(Integer value1, Integer value2) {
            addCriterion("Priority8 not between", value1, value2, "priority8");
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