package com.itensoft.model;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andActualnameIsNull() {
            addCriterion("ActualName is null");
            return (Criteria) this;
        }

        public Criteria andActualnameIsNotNull() {
            addCriterion("ActualName is not null");
            return (Criteria) this;
        }

        public Criteria andActualnameEqualTo(String value) {
            addCriterion("ActualName =", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameNotEqualTo(String value) {
            addCriterion("ActualName <>", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameGreaterThan(String value) {
            addCriterion("ActualName >", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameGreaterThanOrEqualTo(String value) {
            addCriterion("ActualName >=", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameLessThan(String value) {
            addCriterion("ActualName <", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameLessThanOrEqualTo(String value) {
            addCriterion("ActualName <=", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameLike(String value) {
            addCriterion("ActualName like", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameNotLike(String value) {
            addCriterion("ActualName not like", value, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameIn(List<String> values) {
            addCriterion("ActualName in", values, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameNotIn(List<String> values) {
            addCriterion("ActualName not in", values, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameBetween(String value1, String value2) {
            addCriterion("ActualName between", value1, value2, "actualname");
            return (Criteria) this;
        }

        public Criteria andActualnameNotBetween(String value1, String value2) {
            addCriterion("ActualName not between", value1, value2, "actualname");
            return (Criteria) this;
        }

        public Criteria andScanencryptionIsNull() {
            addCriterion("ScanEncryption is null");
            return (Criteria) this;
        }

        public Criteria andScanencryptionIsNotNull() {
            addCriterion("ScanEncryption is not null");
            return (Criteria) this;
        }

        public Criteria andScanencryptionEqualTo(String value) {
            addCriterion("ScanEncryption =", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionNotEqualTo(String value) {
            addCriterion("ScanEncryption <>", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionGreaterThan(String value) {
            addCriterion("ScanEncryption >", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionGreaterThanOrEqualTo(String value) {
            addCriterion("ScanEncryption >=", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionLessThan(String value) {
            addCriterion("ScanEncryption <", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionLessThanOrEqualTo(String value) {
            addCriterion("ScanEncryption <=", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionLike(String value) {
            addCriterion("ScanEncryption like", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionNotLike(String value) {
            addCriterion("ScanEncryption not like", value, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionIn(List<String> values) {
            addCriterion("ScanEncryption in", values, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionNotIn(List<String> values) {
            addCriterion("ScanEncryption not in", values, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionBetween(String value1, String value2) {
            addCriterion("ScanEncryption between", value1, value2, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScanencryptionNotBetween(String value1, String value2) {
            addCriterion("ScanEncryption not between", value1, value2, "scanencryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionIsNull() {
            addCriterion("ScanDecryption is null");
            return (Criteria) this;
        }

        public Criteria andScandecryptionIsNotNull() {
            addCriterion("ScanDecryption is not null");
            return (Criteria) this;
        }

        public Criteria andScandecryptionEqualTo(String value) {
            addCriterion("ScanDecryption =", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionNotEqualTo(String value) {
            addCriterion("ScanDecryption <>", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionGreaterThan(String value) {
            addCriterion("ScanDecryption >", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionGreaterThanOrEqualTo(String value) {
            addCriterion("ScanDecryption >=", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionLessThan(String value) {
            addCriterion("ScanDecryption <", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionLessThanOrEqualTo(String value) {
            addCriterion("ScanDecryption <=", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionLike(String value) {
            addCriterion("ScanDecryption like", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionNotLike(String value) {
            addCriterion("ScanDecryption not like", value, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionIn(List<String> values) {
            addCriterion("ScanDecryption in", values, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionNotIn(List<String> values) {
            addCriterion("ScanDecryption not in", values, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionBetween(String value1, String value2) {
            addCriterion("ScanDecryption between", value1, value2, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andScandecryptionNotBetween(String value1, String value2) {
            addCriterion("ScanDecryption not between", value1, value2, "scandecryption");
            return (Criteria) this;
        }

        public Criteria andAuditclientIsNull() {
            addCriterion("AuditClient is null");
            return (Criteria) this;
        }

        public Criteria andAuditclientIsNotNull() {
            addCriterion("AuditClient is not null");
            return (Criteria) this;
        }

        public Criteria andAuditclientEqualTo(String value) {
            addCriterion("AuditClient =", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientNotEqualTo(String value) {
            addCriterion("AuditClient <>", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientGreaterThan(String value) {
            addCriterion("AuditClient >", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientGreaterThanOrEqualTo(String value) {
            addCriterion("AuditClient >=", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientLessThan(String value) {
            addCriterion("AuditClient <", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientLessThanOrEqualTo(String value) {
            addCriterion("AuditClient <=", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientLike(String value) {
            addCriterion("AuditClient like", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientNotLike(String value) {
            addCriterion("AuditClient not like", value, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientIn(List<String> values) {
            addCriterion("AuditClient in", values, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientNotIn(List<String> values) {
            addCriterion("AuditClient not in", values, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientBetween(String value1, String value2) {
            addCriterion("AuditClient between", value1, value2, "auditclient");
            return (Criteria) this;
        }

        public Criteria andAuditclientNotBetween(String value1, String value2) {
            addCriterion("AuditClient not between", value1, value2, "auditclient");
            return (Criteria) this;
        }

        public Criteria andImportouIsNull() {
            addCriterion("ImportOU is null");
            return (Criteria) this;
        }

        public Criteria andImportouIsNotNull() {
            addCriterion("ImportOU is not null");
            return (Criteria) this;
        }

        public Criteria andImportouEqualTo(String value) {
            addCriterion("ImportOU =", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouNotEqualTo(String value) {
            addCriterion("ImportOU <>", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouGreaterThan(String value) {
            addCriterion("ImportOU >", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouGreaterThanOrEqualTo(String value) {
            addCriterion("ImportOU >=", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouLessThan(String value) {
            addCriterion("ImportOU <", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouLessThanOrEqualTo(String value) {
            addCriterion("ImportOU <=", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouLike(String value) {
            addCriterion("ImportOU like", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouNotLike(String value) {
            addCriterion("ImportOU not like", value, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouIn(List<String> values) {
            addCriterion("ImportOU in", values, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouNotIn(List<String> values) {
            addCriterion("ImportOU not in", values, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouBetween(String value1, String value2) {
            addCriterion("ImportOU between", value1, value2, "importou");
            return (Criteria) this;
        }

        public Criteria andImportouNotBetween(String value1, String value2) {
            addCriterion("ImportOU not between", value1, value2, "importou");
            return (Criteria) this;
        }

        public Criteria andUninstallclientIsNull() {
            addCriterion("UninstallClient is null");
            return (Criteria) this;
        }

        public Criteria andUninstallclientIsNotNull() {
            addCriterion("UninstallClient is not null");
            return (Criteria) this;
        }

        public Criteria andUninstallclientEqualTo(String value) {
            addCriterion("UninstallClient =", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientNotEqualTo(String value) {
            addCriterion("UninstallClient <>", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientGreaterThan(String value) {
            addCriterion("UninstallClient >", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientGreaterThanOrEqualTo(String value) {
            addCriterion("UninstallClient >=", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientLessThan(String value) {
            addCriterion("UninstallClient <", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientLessThanOrEqualTo(String value) {
            addCriterion("UninstallClient <=", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientLike(String value) {
            addCriterion("UninstallClient like", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientNotLike(String value) {
            addCriterion("UninstallClient not like", value, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientIn(List<String> values) {
            addCriterion("UninstallClient in", values, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientNotIn(List<String> values) {
            addCriterion("UninstallClient not in", values, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientBetween(String value1, String value2) {
            addCriterion("UninstallClient between", value1, value2, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andUninstallclientNotBetween(String value1, String value2) {
            addCriterion("UninstallClient not between", value1, value2, "uninstallclient");
            return (Criteria) this;
        }

        public Criteria andGroupsetupIsNull() {
            addCriterion("GroupSetup is null");
            return (Criteria) this;
        }

        public Criteria andGroupsetupIsNotNull() {
            addCriterion("GroupSetup is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsetupEqualTo(String value) {
            addCriterion("GroupSetup =", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupNotEqualTo(String value) {
            addCriterion("GroupSetup <>", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupGreaterThan(String value) {
            addCriterion("GroupSetup >", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupGreaterThanOrEqualTo(String value) {
            addCriterion("GroupSetup >=", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupLessThan(String value) {
            addCriterion("GroupSetup <", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupLessThanOrEqualTo(String value) {
            addCriterion("GroupSetup <=", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupLike(String value) {
            addCriterion("GroupSetup like", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupNotLike(String value) {
            addCriterion("GroupSetup not like", value, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupIn(List<String> values) {
            addCriterion("GroupSetup in", values, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupNotIn(List<String> values) {
            addCriterion("GroupSetup not in", values, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupBetween(String value1, String value2) {
            addCriterion("GroupSetup between", value1, value2, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andGroupsetupNotBetween(String value1, String value2) {
            addCriterion("GroupSetup not between", value1, value2, "groupsetup");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserIsNull() {
            addCriterion("ManageDecryptionUser is null");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserIsNotNull() {
            addCriterion("ManageDecryptionUser is not null");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserEqualTo(String value) {
            addCriterion("ManageDecryptionUser =", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserNotEqualTo(String value) {
            addCriterion("ManageDecryptionUser <>", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserGreaterThan(String value) {
            addCriterion("ManageDecryptionUser >", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserGreaterThanOrEqualTo(String value) {
            addCriterion("ManageDecryptionUser >=", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserLessThan(String value) {
            addCriterion("ManageDecryptionUser <", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserLessThanOrEqualTo(String value) {
            addCriterion("ManageDecryptionUser <=", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserLike(String value) {
            addCriterion("ManageDecryptionUser like", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserNotLike(String value) {
            addCriterion("ManageDecryptionUser not like", value, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserIn(List<String> values) {
            addCriterion("ManageDecryptionUser in", values, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserNotIn(List<String> values) {
            addCriterion("ManageDecryptionUser not in", values, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserBetween(String value1, String value2) {
            addCriterion("ManageDecryptionUser between", value1, value2, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManagedecryptionuserNotBetween(String value1, String value2) {
            addCriterion("ManageDecryptionUser not between", value1, value2, "managedecryptionuser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserIsNull() {
            addCriterion("ManageServerUser is null");
            return (Criteria) this;
        }

        public Criteria andManageserveruserIsNotNull() {
            addCriterion("ManageServerUser is not null");
            return (Criteria) this;
        }

        public Criteria andManageserveruserEqualTo(String value) {
            addCriterion("ManageServerUser =", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserNotEqualTo(String value) {
            addCriterion("ManageServerUser <>", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserGreaterThan(String value) {
            addCriterion("ManageServerUser >", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserGreaterThanOrEqualTo(String value) {
            addCriterion("ManageServerUser >=", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserLessThan(String value) {
            addCriterion("ManageServerUser <", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserLessThanOrEqualTo(String value) {
            addCriterion("ManageServerUser <=", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserLike(String value) {
            addCriterion("ManageServerUser like", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserNotLike(String value) {
            addCriterion("ManageServerUser not like", value, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserIn(List<String> values) {
            addCriterion("ManageServerUser in", values, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserNotIn(List<String> values) {
            addCriterion("ManageServerUser not in", values, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserBetween(String value1, String value2) {
            addCriterion("ManageServerUser between", value1, value2, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManageserveruserNotBetween(String value1, String value2) {
            addCriterion("ManageServerUser not between", value1, value2, "manageserveruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserIsNull() {
            addCriterion("ManageManagerUser is null");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserIsNotNull() {
            addCriterion("ManageManagerUser is not null");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserEqualTo(String value) {
            addCriterion("ManageManagerUser =", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserNotEqualTo(String value) {
            addCriterion("ManageManagerUser <>", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserGreaterThan(String value) {
            addCriterion("ManageManagerUser >", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserGreaterThanOrEqualTo(String value) {
            addCriterion("ManageManagerUser >=", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserLessThan(String value) {
            addCriterion("ManageManagerUser <", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserLessThanOrEqualTo(String value) {
            addCriterion("ManageManagerUser <=", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserLike(String value) {
            addCriterion("ManageManagerUser like", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserNotLike(String value) {
            addCriterion("ManageManagerUser not like", value, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserIn(List<String> values) {
            addCriterion("ManageManagerUser in", values, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserNotIn(List<String> values) {
            addCriterion("ManageManagerUser not in", values, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserBetween(String value1, String value2) {
            addCriterion("ManageManagerUser between", value1, value2, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagemanageruserNotBetween(String value1, String value2) {
            addCriterion("ManageManagerUser not between", value1, value2, "managemanageruser");
            return (Criteria) this;
        }

        public Criteria andManagecertIsNull() {
            addCriterion("ManageCert is null");
            return (Criteria) this;
        }

        public Criteria andManagecertIsNotNull() {
            addCriterion("ManageCert is not null");
            return (Criteria) this;
        }

        public Criteria andManagecertEqualTo(String value) {
            addCriterion("ManageCert =", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertNotEqualTo(String value) {
            addCriterion("ManageCert <>", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertGreaterThan(String value) {
            addCriterion("ManageCert >", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertGreaterThanOrEqualTo(String value) {
            addCriterion("ManageCert >=", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertLessThan(String value) {
            addCriterion("ManageCert <", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertLessThanOrEqualTo(String value) {
            addCriterion("ManageCert <=", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertLike(String value) {
            addCriterion("ManageCert like", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertNotLike(String value) {
            addCriterion("ManageCert not like", value, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertIn(List<String> values) {
            addCriterion("ManageCert in", values, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertNotIn(List<String> values) {
            addCriterion("ManageCert not in", values, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertBetween(String value1, String value2) {
            addCriterion("ManageCert between", value1, value2, "managecert");
            return (Criteria) this;
        }

        public Criteria andManagecertNotBetween(String value1, String value2) {
            addCriterion("ManageCert not between", value1, value2, "managecert");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibIsNull() {
            addCriterion("UpdatePolicyLib is null");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibIsNotNull() {
            addCriterion("UpdatePolicyLib is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibEqualTo(String value) {
            addCriterion("UpdatePolicyLib =", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibNotEqualTo(String value) {
            addCriterion("UpdatePolicyLib <>", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibGreaterThan(String value) {
            addCriterion("UpdatePolicyLib >", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibGreaterThanOrEqualTo(String value) {
            addCriterion("UpdatePolicyLib >=", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibLessThan(String value) {
            addCriterion("UpdatePolicyLib <", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibLessThanOrEqualTo(String value) {
            addCriterion("UpdatePolicyLib <=", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibLike(String value) {
            addCriterion("UpdatePolicyLib like", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibNotLike(String value) {
            addCriterion("UpdatePolicyLib not like", value, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibIn(List<String> values) {
            addCriterion("UpdatePolicyLib in", values, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibNotIn(List<String> values) {
            addCriterion("UpdatePolicyLib not in", values, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibBetween(String value1, String value2) {
            addCriterion("UpdatePolicyLib between", value1, value2, "updatepolicylib");
            return (Criteria) this;
        }

        public Criteria andUpdatepolicylibNotBetween(String value1, String value2) {
            addCriterion("UpdatePolicyLib not between", value1, value2, "updatepolicylib");
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