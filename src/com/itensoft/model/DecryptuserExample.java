package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class DecryptuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DecryptuserExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIsNull() {
            addCriterion("OfflineTime is null");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIsNotNull() {
            addCriterion("OfflineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeEqualTo(Integer value) {
            addCriterion("OfflineTime =", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotEqualTo(Integer value) {
            addCriterion("OfflineTime <>", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeGreaterThan(Integer value) {
            addCriterion("OfflineTime >", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OfflineTime >=", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeLessThan(Integer value) {
            addCriterion("OfflineTime <", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeLessThanOrEqualTo(Integer value) {
            addCriterion("OfflineTime <=", value, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeIn(List<Integer> values) {
            addCriterion("OfflineTime in", values, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotIn(List<Integer> values) {
            addCriterion("OfflineTime not in", values, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeBetween(Integer value1, Integer value2) {
            addCriterion("OfflineTime between", value1, value2, "offlinetime");
            return (Criteria) this;
        }

        public Criteria andOfflinetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("OfflineTime not between", value1, value2, "offlinetime");
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

        public Criteria andActencryptIsNull() {
            addCriterion("ActEncrypt is null");
            return (Criteria) this;
        }

        public Criteria andActencryptIsNotNull() {
            addCriterion("ActEncrypt is not null");
            return (Criteria) this;
        }

        public Criteria andActencryptEqualTo(String value) {
            addCriterion("ActEncrypt =", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptNotEqualTo(String value) {
            addCriterion("ActEncrypt <>", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptGreaterThan(String value) {
            addCriterion("ActEncrypt >", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptGreaterThanOrEqualTo(String value) {
            addCriterion("ActEncrypt >=", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptLessThan(String value) {
            addCriterion("ActEncrypt <", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptLessThanOrEqualTo(String value) {
            addCriterion("ActEncrypt <=", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptLike(String value) {
            addCriterion("ActEncrypt like", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptNotLike(String value) {
            addCriterion("ActEncrypt not like", value, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptIn(List<String> values) {
            addCriterion("ActEncrypt in", values, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptNotIn(List<String> values) {
            addCriterion("ActEncrypt not in", values, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptBetween(String value1, String value2) {
            addCriterion("ActEncrypt between", value1, value2, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActencryptNotBetween(String value1, String value2) {
            addCriterion("ActEncrypt not between", value1, value2, "actencrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptIsNull() {
            addCriterion("ActDecrypt is null");
            return (Criteria) this;
        }

        public Criteria andActdecryptIsNotNull() {
            addCriterion("ActDecrypt is not null");
            return (Criteria) this;
        }

        public Criteria andActdecryptEqualTo(String value) {
            addCriterion("ActDecrypt =", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptNotEqualTo(String value) {
            addCriterion("ActDecrypt <>", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptGreaterThan(String value) {
            addCriterion("ActDecrypt >", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptGreaterThanOrEqualTo(String value) {
            addCriterion("ActDecrypt >=", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptLessThan(String value) {
            addCriterion("ActDecrypt <", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptLessThanOrEqualTo(String value) {
            addCriterion("ActDecrypt <=", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptLike(String value) {
            addCriterion("ActDecrypt like", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptNotLike(String value) {
            addCriterion("ActDecrypt not like", value, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptIn(List<String> values) {
            addCriterion("ActDecrypt in", values, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptNotIn(List<String> values) {
            addCriterion("ActDecrypt not in", values, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptBetween(String value1, String value2) {
            addCriterion("ActDecrypt between", value1, value2, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdecryptNotBetween(String value1, String value2) {
            addCriterion("ActDecrypt not between", value1, value2, "actdecrypt");
            return (Criteria) this;
        }

        public Criteria andActdeployIsNull() {
            addCriterion("ActDeploy is null");
            return (Criteria) this;
        }

        public Criteria andActdeployIsNotNull() {
            addCriterion("ActDeploy is not null");
            return (Criteria) this;
        }

        public Criteria andActdeployEqualTo(String value) {
            addCriterion("ActDeploy =", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployNotEqualTo(String value) {
            addCriterion("ActDeploy <>", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployGreaterThan(String value) {
            addCriterion("ActDeploy >", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployGreaterThanOrEqualTo(String value) {
            addCriterion("ActDeploy >=", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployLessThan(String value) {
            addCriterion("ActDeploy <", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployLessThanOrEqualTo(String value) {
            addCriterion("ActDeploy <=", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployLike(String value) {
            addCriterion("ActDeploy like", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployNotLike(String value) {
            addCriterion("ActDeploy not like", value, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployIn(List<String> values) {
            addCriterion("ActDeploy in", values, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployNotIn(List<String> values) {
            addCriterion("ActDeploy not in", values, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployBetween(String value1, String value2) {
            addCriterion("ActDeploy between", value1, value2, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActdeployNotBetween(String value1, String value2) {
            addCriterion("ActDeploy not between", value1, value2, "actdeploy");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvIsNull() {
            addCriterion("ActAdjuestRcv is null");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvIsNotNull() {
            addCriterion("ActAdjuestRcv is not null");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvEqualTo(String value) {
            addCriterion("ActAdjuestRcv =", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvNotEqualTo(String value) {
            addCriterion("ActAdjuestRcv <>", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvGreaterThan(String value) {
            addCriterion("ActAdjuestRcv >", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvGreaterThanOrEqualTo(String value) {
            addCriterion("ActAdjuestRcv >=", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvLessThan(String value) {
            addCriterion("ActAdjuestRcv <", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvLessThanOrEqualTo(String value) {
            addCriterion("ActAdjuestRcv <=", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvLike(String value) {
            addCriterion("ActAdjuestRcv like", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvNotLike(String value) {
            addCriterion("ActAdjuestRcv not like", value, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvIn(List<String> values) {
            addCriterion("ActAdjuestRcv in", values, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvNotIn(List<String> values) {
            addCriterion("ActAdjuestRcv not in", values, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvBetween(String value1, String value2) {
            addCriterion("ActAdjuestRcv between", value1, value2, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andActadjuestrcvNotBetween(String value1, String value2) {
            addCriterion("ActAdjuestRcv not between", value1, value2, "actadjuestrcv");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyIsNull() {
            addCriterion("DefReadonly is null");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyIsNotNull() {
            addCriterion("DefReadonly is not null");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyEqualTo(String value) {
            addCriterion("DefReadonly =", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyNotEqualTo(String value) {
            addCriterion("DefReadonly <>", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyGreaterThan(String value) {
            addCriterion("DefReadonly >", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyGreaterThanOrEqualTo(String value) {
            addCriterion("DefReadonly >=", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyLessThan(String value) {
            addCriterion("DefReadonly <", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyLessThanOrEqualTo(String value) {
            addCriterion("DefReadonly <=", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyLike(String value) {
            addCriterion("DefReadonly like", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyNotLike(String value) {
            addCriterion("DefReadonly not like", value, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyIn(List<String> values) {
            addCriterion("DefReadonly in", values, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyNotIn(List<String> values) {
            addCriterion("DefReadonly not in", values, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyBetween(String value1, String value2) {
            addCriterion("DefReadonly between", value1, value2, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefreadonlyNotBetween(String value1, String value2) {
            addCriterion("DefReadonly not between", value1, value2, "defreadonly");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintIsNull() {
            addCriterion("DefDisablePrint is null");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintIsNotNull() {
            addCriterion("DefDisablePrint is not null");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintEqualTo(String value) {
            addCriterion("DefDisablePrint =", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintNotEqualTo(String value) {
            addCriterion("DefDisablePrint <>", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintGreaterThan(String value) {
            addCriterion("DefDisablePrint >", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintGreaterThanOrEqualTo(String value) {
            addCriterion("DefDisablePrint >=", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintLessThan(String value) {
            addCriterion("DefDisablePrint <", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintLessThanOrEqualTo(String value) {
            addCriterion("DefDisablePrint <=", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintLike(String value) {
            addCriterion("DefDisablePrint like", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintNotLike(String value) {
            addCriterion("DefDisablePrint not like", value, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintIn(List<String> values) {
            addCriterion("DefDisablePrint in", values, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintNotIn(List<String> values) {
            addCriterion("DefDisablePrint not in", values, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintBetween(String value1, String value2) {
            addCriterion("DefDisablePrint between", value1, value2, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDefdisableprintNotBetween(String value1, String value2) {
            addCriterion("DefDisablePrint not between", value1, value2, "defdisableprint");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeIsNull() {
            addCriterion("DefLastDateTime is null");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeIsNotNull() {
            addCriterion("DefLastDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeEqualTo(String value) {
            addCriterion("DefLastDateTime =", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeNotEqualTo(String value) {
            addCriterion("DefLastDateTime <>", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeGreaterThan(String value) {
            addCriterion("DefLastDateTime >", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DefLastDateTime >=", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeLessThan(String value) {
            addCriterion("DefLastDateTime <", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeLessThanOrEqualTo(String value) {
            addCriterion("DefLastDateTime <=", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeLike(String value) {
            addCriterion("DefLastDateTime like", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeNotLike(String value) {
            addCriterion("DefLastDateTime not like", value, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeIn(List<String> values) {
            addCriterion("DefLastDateTime in", values, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeNotIn(List<String> values) {
            addCriterion("DefLastDateTime not in", values, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeBetween(String value1, String value2) {
            addCriterion("DefLastDateTime between", value1, value2, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDeflastdatetimeNotBetween(String value1, String value2) {
            addCriterion("DefLastDateTime not between", value1, value2, "deflastdatetime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeIsNull() {
            addCriterion("DefAllowLocalTime is null");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeIsNotNull() {
            addCriterion("DefAllowLocalTime is not null");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeEqualTo(String value) {
            addCriterion("DefAllowLocalTime =", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeNotEqualTo(String value) {
            addCriterion("DefAllowLocalTime <>", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeGreaterThan(String value) {
            addCriterion("DefAllowLocalTime >", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeGreaterThanOrEqualTo(String value) {
            addCriterion("DefAllowLocalTime >=", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeLessThan(String value) {
            addCriterion("DefAllowLocalTime <", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeLessThanOrEqualTo(String value) {
            addCriterion("DefAllowLocalTime <=", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeLike(String value) {
            addCriterion("DefAllowLocalTime like", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeNotLike(String value) {
            addCriterion("DefAllowLocalTime not like", value, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeIn(List<String> values) {
            addCriterion("DefAllowLocalTime in", values, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeNotIn(List<String> values) {
            addCriterion("DefAllowLocalTime not in", values, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeBetween(String value1, String value2) {
            addCriterion("DefAllowLocalTime between", value1, value2, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefallowlocaltimeNotBetween(String value1, String value2) {
            addCriterion("DefAllowLocalTime not between", value1, value2, "defallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActreadonlyIsNull() {
            addCriterion("ActReadOnly is null");
            return (Criteria) this;
        }

        public Criteria andActreadonlyIsNotNull() {
            addCriterion("ActReadOnly is not null");
            return (Criteria) this;
        }

        public Criteria andActreadonlyEqualTo(String value) {
            addCriterion("ActReadOnly =", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyNotEqualTo(String value) {
            addCriterion("ActReadOnly <>", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyGreaterThan(String value) {
            addCriterion("ActReadOnly >", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyGreaterThanOrEqualTo(String value) {
            addCriterion("ActReadOnly >=", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyLessThan(String value) {
            addCriterion("ActReadOnly <", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyLessThanOrEqualTo(String value) {
            addCriterion("ActReadOnly <=", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyLike(String value) {
            addCriterion("ActReadOnly like", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyNotLike(String value) {
            addCriterion("ActReadOnly not like", value, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyIn(List<String> values) {
            addCriterion("ActReadOnly in", values, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyNotIn(List<String> values) {
            addCriterion("ActReadOnly not in", values, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyBetween(String value1, String value2) {
            addCriterion("ActReadOnly between", value1, value2, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActreadonlyNotBetween(String value1, String value2) {
            addCriterion("ActReadOnly not between", value1, value2, "actreadonly");
            return (Criteria) this;
        }

        public Criteria andActdisableprintIsNull() {
            addCriterion("ActDisablePrint is null");
            return (Criteria) this;
        }

        public Criteria andActdisableprintIsNotNull() {
            addCriterion("ActDisablePrint is not null");
            return (Criteria) this;
        }

        public Criteria andActdisableprintEqualTo(String value) {
            addCriterion("ActDisablePrint =", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintNotEqualTo(String value) {
            addCriterion("ActDisablePrint <>", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintGreaterThan(String value) {
            addCriterion("ActDisablePrint >", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintGreaterThanOrEqualTo(String value) {
            addCriterion("ActDisablePrint >=", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintLessThan(String value) {
            addCriterion("ActDisablePrint <", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintLessThanOrEqualTo(String value) {
            addCriterion("ActDisablePrint <=", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintLike(String value) {
            addCriterion("ActDisablePrint like", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintNotLike(String value) {
            addCriterion("ActDisablePrint not like", value, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintIn(List<String> values) {
            addCriterion("ActDisablePrint in", values, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintNotIn(List<String> values) {
            addCriterion("ActDisablePrint not in", values, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintBetween(String value1, String value2) {
            addCriterion("ActDisablePrint between", value1, value2, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActdisableprintNotBetween(String value1, String value2) {
            addCriterion("ActDisablePrint not between", value1, value2, "actdisableprint");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeIsNull() {
            addCriterion("ActLastDateTime is null");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeIsNotNull() {
            addCriterion("ActLastDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeEqualTo(String value) {
            addCriterion("ActLastDateTime =", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeNotEqualTo(String value) {
            addCriterion("ActLastDateTime <>", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeGreaterThan(String value) {
            addCriterion("ActLastDateTime >", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ActLastDateTime >=", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeLessThan(String value) {
            addCriterion("ActLastDateTime <", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeLessThanOrEqualTo(String value) {
            addCriterion("ActLastDateTime <=", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeLike(String value) {
            addCriterion("ActLastDateTime like", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeNotLike(String value) {
            addCriterion("ActLastDateTime not like", value, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeIn(List<String> values) {
            addCriterion("ActLastDateTime in", values, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeNotIn(List<String> values) {
            addCriterion("ActLastDateTime not in", values, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeBetween(String value1, String value2) {
            addCriterion("ActLastDateTime between", value1, value2, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActlastdatetimeNotBetween(String value1, String value2) {
            addCriterion("ActLastDateTime not between", value1, value2, "actlastdatetime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeIsNull() {
            addCriterion("ActAllowLocalTime is null");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeIsNotNull() {
            addCriterion("ActAllowLocalTime is not null");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeEqualTo(String value) {
            addCriterion("ActAllowLocalTime =", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeNotEqualTo(String value) {
            addCriterion("ActAllowLocalTime <>", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeGreaterThan(String value) {
            addCriterion("ActAllowLocalTime >", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeGreaterThanOrEqualTo(String value) {
            addCriterion("ActAllowLocalTime >=", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeLessThan(String value) {
            addCriterion("ActAllowLocalTime <", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeLessThanOrEqualTo(String value) {
            addCriterion("ActAllowLocalTime <=", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeLike(String value) {
            addCriterion("ActAllowLocalTime like", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeNotLike(String value) {
            addCriterion("ActAllowLocalTime not like", value, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeIn(List<String> values) {
            addCriterion("ActAllowLocalTime in", values, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeNotIn(List<String> values) {
            addCriterion("ActAllowLocalTime not in", values, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeBetween(String value1, String value2) {
            addCriterion("ActAllowLocalTime between", value1, value2, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andActallowlocaltimeNotBetween(String value1, String value2) {
            addCriterion("ActAllowLocalTime not between", value1, value2, "actallowlocaltime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeIsNull() {
            addCriterion("DefDeployTime is null");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeIsNotNull() {
            addCriterion("DefDeployTime is not null");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeEqualTo(Integer value) {
            addCriterion("DefDeployTime =", value, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeNotEqualTo(Integer value) {
            addCriterion("DefDeployTime <>", value, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeGreaterThan(Integer value) {
            addCriterion("DefDeployTime >", value, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DefDeployTime >=", value, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeLessThan(Integer value) {
            addCriterion("DefDeployTime <", value, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeLessThanOrEqualTo(Integer value) {
            addCriterion("DefDeployTime <=", value, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeIn(List<Integer> values) {
            addCriterion("DefDeployTime in", values, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeNotIn(List<Integer> values) {
            addCriterion("DefDeployTime not in", values, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeBetween(Integer value1, Integer value2) {
            addCriterion("DefDeployTime between", value1, value2, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andDefdeploytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("DefDeployTime not between", value1, value2, "defdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeIsNull() {
            addCriterion("MaxDeployTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeIsNotNull() {
            addCriterion("MaxDeployTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeEqualTo(Integer value) {
            addCriterion("MaxDeployTime =", value, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeNotEqualTo(Integer value) {
            addCriterion("MaxDeployTime <>", value, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeGreaterThan(Integer value) {
            addCriterion("MaxDeployTime >", value, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxDeployTime >=", value, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeLessThan(Integer value) {
            addCriterion("MaxDeployTime <", value, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeLessThanOrEqualTo(Integer value) {
            addCriterion("MaxDeployTime <=", value, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeIn(List<Integer> values) {
            addCriterion("MaxDeployTime in", values, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeNotIn(List<Integer> values) {
            addCriterion("MaxDeployTime not in", values, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeBetween(Integer value1, Integer value2) {
            addCriterion("MaxDeployTime between", value1, value2, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andMaxdeploytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxDeployTime not between", value1, value2, "maxdeploytime");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnIsNull() {
            addCriterion("USBKeySn is null");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnIsNotNull() {
            addCriterion("USBKeySn is not null");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnEqualTo(String value) {
            addCriterion("USBKeySn =", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnNotEqualTo(String value) {
            addCriterion("USBKeySn <>", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnGreaterThan(String value) {
            addCriterion("USBKeySn >", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnGreaterThanOrEqualTo(String value) {
            addCriterion("USBKeySn >=", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnLessThan(String value) {
            addCriterion("USBKeySn <", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnLessThanOrEqualTo(String value) {
            addCriterion("USBKeySn <=", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnLike(String value) {
            addCriterion("USBKeySn like", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnNotLike(String value) {
            addCriterion("USBKeySn not like", value, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnIn(List<String> values) {
            addCriterion("USBKeySn in", values, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnNotIn(List<String> values) {
            addCriterion("USBKeySn not in", values, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnBetween(String value1, String value2) {
            addCriterion("USBKeySn between", value1, value2, "usbkeysn");
            return (Criteria) this;
        }

        public Criteria andUsbkeysnNotBetween(String value1, String value2) {
            addCriterion("USBKeySn not between", value1, value2, "usbkeysn");
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