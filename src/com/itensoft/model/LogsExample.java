package com.itensoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogsExample() {
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

        public Criteria andDatetime1IsNull() {
            addCriterion("DateTime1 is null");
            return (Criteria) this;
        }

        public Criteria andDatetime1IsNotNull() {
            addCriterion("DateTime1 is not null");
            return (Criteria) this;
        }

        public Criteria andDatetime1EqualTo(Date value) {
            addCriterion("DateTime1 =", value, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1NotEqualTo(Date value) {
            addCriterion("DateTime1 <>", value, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1GreaterThan(Date value) {
            addCriterion("DateTime1 >", value, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1GreaterThanOrEqualTo(Date value) {
            addCriterion("DateTime1 >=", value, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1LessThan(Date value) {
            addCriterion("DateTime1 <", value, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1LessThanOrEqualTo(Date value) {
            addCriterion("DateTime1 <=", value, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1In(List<Date> values) {
            addCriterion("DateTime1 in", values, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1NotIn(List<Date> values) {
            addCriterion("DateTime1 not in", values, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1Between(Date value1, Date value2) {
            addCriterion("DateTime1 between", value1, value2, "datetime1");
            return (Criteria) this;
        }

        public Criteria andDatetime1NotBetween(Date value1, Date value2) {
            addCriterion("DateTime1 not between", value1, value2, "datetime1");
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

        public Criteria andReason1IsNull() {
            addCriterion("Reason1 is null");
            return (Criteria) this;
        }

        public Criteria andReason1IsNotNull() {
            addCriterion("Reason1 is not null");
            return (Criteria) this;
        }

        public Criteria andReason1EqualTo(String value) {
            addCriterion("Reason1 =", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1NotEqualTo(String value) {
            addCriterion("Reason1 <>", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1GreaterThan(String value) {
            addCriterion("Reason1 >", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1GreaterThanOrEqualTo(String value) {
            addCriterion("Reason1 >=", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1LessThan(String value) {
            addCriterion("Reason1 <", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1LessThanOrEqualTo(String value) {
            addCriterion("Reason1 <=", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1Like(String value) {
            addCriterion("Reason1 like", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1NotLike(String value) {
            addCriterion("Reason1 not like", value, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1In(List<String> values) {
            addCriterion("Reason1 in", values, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1NotIn(List<String> values) {
            addCriterion("Reason1 not in", values, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1Between(String value1, String value2) {
            addCriterion("Reason1 between", value1, value2, "reason1");
            return (Criteria) this;
        }

        public Criteria andReason1NotBetween(String value1, String value2) {
            addCriterion("Reason1 not between", value1, value2, "reason1");
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

        public Criteria andDatetime2IsNull() {
            addCriterion("DateTime2 is null");
            return (Criteria) this;
        }

        public Criteria andDatetime2IsNotNull() {
            addCriterion("DateTime2 is not null");
            return (Criteria) this;
        }

        public Criteria andDatetime2EqualTo(Date value) {
            addCriterion("DateTime2 =", value, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2NotEqualTo(Date value) {
            addCriterion("DateTime2 <>", value, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2GreaterThan(Date value) {
            addCriterion("DateTime2 >", value, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2GreaterThanOrEqualTo(Date value) {
            addCriterion("DateTime2 >=", value, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2LessThan(Date value) {
            addCriterion("DateTime2 <", value, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2LessThanOrEqualTo(Date value) {
            addCriterion("DateTime2 <=", value, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2In(List<Date> values) {
            addCriterion("DateTime2 in", values, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2NotIn(List<Date> values) {
            addCriterion("DateTime2 not in", values, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2Between(Date value1, Date value2) {
            addCriterion("DateTime2 between", value1, value2, "datetime2");
            return (Criteria) this;
        }

        public Criteria andDatetime2NotBetween(Date value1, Date value2) {
            addCriterion("DateTime2 not between", value1, value2, "datetime2");
            return (Criteria) this;
        }

        public Criteria andResult1IsNull() {
            addCriterion("Result1 is null");
            return (Criteria) this;
        }

        public Criteria andResult1IsNotNull() {
            addCriterion("Result1 is not null");
            return (Criteria) this;
        }

        public Criteria andResult1EqualTo(String value) {
            addCriterion("Result1 =", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotEqualTo(String value) {
            addCriterion("Result1 <>", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1GreaterThan(String value) {
            addCriterion("Result1 >", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1GreaterThanOrEqualTo(String value) {
            addCriterion("Result1 >=", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1LessThan(String value) {
            addCriterion("Result1 <", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1LessThanOrEqualTo(String value) {
            addCriterion("Result1 <=", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1Like(String value) {
            addCriterion("Result1 like", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotLike(String value) {
            addCriterion("Result1 not like", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1In(List<String> values) {
            addCriterion("Result1 in", values, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotIn(List<String> values) {
            addCriterion("Result1 not in", values, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1Between(String value1, String value2) {
            addCriterion("Result1 between", value1, value2, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotBetween(String value1, String value2) {
            addCriterion("Result1 not between", value1, value2, "result1");
            return (Criteria) this;
        }

        public Criteria andReason2IsNull() {
            addCriterion("Reason2 is null");
            return (Criteria) this;
        }

        public Criteria andReason2IsNotNull() {
            addCriterion("Reason2 is not null");
            return (Criteria) this;
        }

        public Criteria andReason2EqualTo(String value) {
            addCriterion("Reason2 =", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2NotEqualTo(String value) {
            addCriterion("Reason2 <>", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2GreaterThan(String value) {
            addCriterion("Reason2 >", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2GreaterThanOrEqualTo(String value) {
            addCriterion("Reason2 >=", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2LessThan(String value) {
            addCriterion("Reason2 <", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2LessThanOrEqualTo(String value) {
            addCriterion("Reason2 <=", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2Like(String value) {
            addCriterion("Reason2 like", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2NotLike(String value) {
            addCriterion("Reason2 not like", value, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2In(List<String> values) {
            addCriterion("Reason2 in", values, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2NotIn(List<String> values) {
            addCriterion("Reason2 not in", values, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2Between(String value1, String value2) {
            addCriterion("Reason2 between", value1, value2, "reason2");
            return (Criteria) this;
        }

        public Criteria andReason2NotBetween(String value1, String value2) {
            addCriterion("Reason2 not between", value1, value2, "reason2");
            return (Criteria) this;
        }

        public Criteria andProcesscodeIsNull() {
            addCriterion("ProcessCode is null");
            return (Criteria) this;
        }

        public Criteria andProcesscodeIsNotNull() {
            addCriterion("ProcessCode is not null");
            return (Criteria) this;
        }

        public Criteria andProcesscodeEqualTo(Integer value) {
            addCriterion("ProcessCode =", value, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeNotEqualTo(Integer value) {
            addCriterion("ProcessCode <>", value, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeGreaterThan(Integer value) {
            addCriterion("ProcessCode >", value, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProcessCode >=", value, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeLessThan(Integer value) {
            addCriterion("ProcessCode <", value, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeLessThanOrEqualTo(Integer value) {
            addCriterion("ProcessCode <=", value, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeIn(List<Integer> values) {
            addCriterion("ProcessCode in", values, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeNotIn(List<Integer> values) {
            addCriterion("ProcessCode not in", values, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeBetween(Integer value1, Integer value2) {
            addCriterion("ProcessCode between", value1, value2, "processcode");
            return (Criteria) this;
        }

        public Criteria andProcesscodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ProcessCode not between", value1, value2, "processcode");
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

        public Criteria andDatetime3IsNull() {
            addCriterion("DateTime3 is null");
            return (Criteria) this;
        }

        public Criteria andDatetime3IsNotNull() {
            addCriterion("DateTime3 is not null");
            return (Criteria) this;
        }

        public Criteria andDatetime3EqualTo(Date value) {
            addCriterion("DateTime3 =", value, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3NotEqualTo(Date value) {
            addCriterion("DateTime3 <>", value, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3GreaterThan(Date value) {
            addCriterion("DateTime3 >", value, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3GreaterThanOrEqualTo(Date value) {
            addCriterion("DateTime3 >=", value, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3LessThan(Date value) {
            addCriterion("DateTime3 <", value, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3LessThanOrEqualTo(Date value) {
            addCriterion("DateTime3 <=", value, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3In(List<Date> values) {
            addCriterion("DateTime3 in", values, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3NotIn(List<Date> values) {
            addCriterion("DateTime3 not in", values, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3Between(Date value1, Date value2) {
            addCriterion("DateTime3 between", value1, value2, "datetime3");
            return (Criteria) this;
        }

        public Criteria andDatetime3NotBetween(Date value1, Date value2) {
            addCriterion("DateTime3 not between", value1, value2, "datetime3");
            return (Criteria) this;
        }

        public Criteria andResult2IsNull() {
            addCriterion("Result2 is null");
            return (Criteria) this;
        }

        public Criteria andResult2IsNotNull() {
            addCriterion("Result2 is not null");
            return (Criteria) this;
        }

        public Criteria andResult2EqualTo(String value) {
            addCriterion("Result2 =", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotEqualTo(String value) {
            addCriterion("Result2 <>", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2GreaterThan(String value) {
            addCriterion("Result2 >", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2GreaterThanOrEqualTo(String value) {
            addCriterion("Result2 >=", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2LessThan(String value) {
            addCriterion("Result2 <", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2LessThanOrEqualTo(String value) {
            addCriterion("Result2 <=", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2Like(String value) {
            addCriterion("Result2 like", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotLike(String value) {
            addCriterion("Result2 not like", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2In(List<String> values) {
            addCriterion("Result2 in", values, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotIn(List<String> values) {
            addCriterion("Result2 not in", values, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2Between(String value1, String value2) {
            addCriterion("Result2 between", value1, value2, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotBetween(String value1, String value2) {
            addCriterion("Result2 not between", value1, value2, "result2");
            return (Criteria) this;
        }

        public Criteria andReason3IsNull() {
            addCriterion("Reason3 is null");
            return (Criteria) this;
        }

        public Criteria andReason3IsNotNull() {
            addCriterion("Reason3 is not null");
            return (Criteria) this;
        }

        public Criteria andReason3EqualTo(String value) {
            addCriterion("Reason3 =", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3NotEqualTo(String value) {
            addCriterion("Reason3 <>", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3GreaterThan(String value) {
            addCriterion("Reason3 >", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3GreaterThanOrEqualTo(String value) {
            addCriterion("Reason3 >=", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3LessThan(String value) {
            addCriterion("Reason3 <", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3LessThanOrEqualTo(String value) {
            addCriterion("Reason3 <=", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3Like(String value) {
            addCriterion("Reason3 like", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3NotLike(String value) {
            addCriterion("Reason3 not like", value, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3In(List<String> values) {
            addCriterion("Reason3 in", values, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3NotIn(List<String> values) {
            addCriterion("Reason3 not in", values, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3Between(String value1, String value2) {
            addCriterion("Reason3 between", value1, value2, "reason3");
            return (Criteria) this;
        }

        public Criteria andReason3NotBetween(String value1, String value2) {
            addCriterion("Reason3 not between", value1, value2, "reason3");
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