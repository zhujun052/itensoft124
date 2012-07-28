package com.itensoft.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolicyExample() {
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

        public Criteria andPrintcontroledIsNull() {
            addCriterion("PrintControled is null");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledIsNotNull() {
            addCriterion("PrintControled is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledEqualTo(String value) {
            addCriterion("PrintControled =", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledNotEqualTo(String value) {
            addCriterion("PrintControled <>", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledGreaterThan(String value) {
            addCriterion("PrintControled >", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledGreaterThanOrEqualTo(String value) {
            addCriterion("PrintControled >=", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledLessThan(String value) {
            addCriterion("PrintControled <", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledLessThanOrEqualTo(String value) {
            addCriterion("PrintControled <=", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledLike(String value) {
            addCriterion("PrintControled like", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledNotLike(String value) {
            addCriterion("PrintControled not like", value, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledIn(List<String> values) {
            addCriterion("PrintControled in", values, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledNotIn(List<String> values) {
            addCriterion("PrintControled not in", values, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledBetween(String value1, String value2) {
            addCriterion("PrintControled between", value1, value2, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledNotBetween(String value1, String value2) {
            addCriterion("PrintControled not between", value1, value2, "printcontroled");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeIsNull() {
            addCriterion("UDiskMode is null");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeIsNotNull() {
            addCriterion("UDiskMode is not null");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeEqualTo(Byte value) {
            addCriterion("UDiskMode =", value, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeNotEqualTo(Byte value) {
            addCriterion("UDiskMode <>", value, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeGreaterThan(Byte value) {
            addCriterion("UDiskMode >", value, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("UDiskMode >=", value, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeLessThan(Byte value) {
            addCriterion("UDiskMode <", value, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeLessThanOrEqualTo(Byte value) {
            addCriterion("UDiskMode <=", value, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeIn(List<Byte> values) {
            addCriterion("UDiskMode in", values, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeNotIn(List<Byte> values) {
            addCriterion("UDiskMode not in", values, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeBetween(Byte value1, Byte value2) {
            addCriterion("UDiskMode between", value1, value2, "udiskmode");
            return (Criteria) this;
        }

        public Criteria andUdiskmodeNotBetween(Byte value1, Byte value2) {
            addCriterion("UDiskMode not between", value1, value2, "udiskmode");
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

        public Criteria andOnlinemodeIsNull() {
            addCriterion("OnLineMode is null");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeIsNotNull() {
            addCriterion("OnLineMode is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeEqualTo(String value) {
            addCriterion("OnLineMode =", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeNotEqualTo(String value) {
            addCriterion("OnLineMode <>", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeGreaterThan(String value) {
            addCriterion("OnLineMode >", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeGreaterThanOrEqualTo(String value) {
            addCriterion("OnLineMode >=", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeLessThan(String value) {
            addCriterion("OnLineMode <", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeLessThanOrEqualTo(String value) {
            addCriterion("OnLineMode <=", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeLike(String value) {
            addCriterion("OnLineMode like", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeNotLike(String value) {
            addCriterion("OnLineMode not like", value, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeIn(List<String> values) {
            addCriterion("OnLineMode in", values, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeNotIn(List<String> values) {
            addCriterion("OnLineMode not in", values, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeBetween(String value1, String value2) {
            addCriterion("OnLineMode between", value1, value2, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andOnlinemodeNotBetween(String value1, String value2) {
            addCriterion("OnLineMode not between", value1, value2, "onlinemode");
            return (Criteria) this;
        }

        public Criteria andLogudiskopIsNull() {
            addCriterion("LogUDiskOp is null");
            return (Criteria) this;
        }

        public Criteria andLogudiskopIsNotNull() {
            addCriterion("LogUDiskOp is not null");
            return (Criteria) this;
        }

        public Criteria andLogudiskopEqualTo(String value) {
            addCriterion("LogUDiskOp =", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopNotEqualTo(String value) {
            addCriterion("LogUDiskOp <>", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopGreaterThan(String value) {
            addCriterion("LogUDiskOp >", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopGreaterThanOrEqualTo(String value) {
            addCriterion("LogUDiskOp >=", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopLessThan(String value) {
            addCriterion("LogUDiskOp <", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopLessThanOrEqualTo(String value) {
            addCriterion("LogUDiskOp <=", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopLike(String value) {
            addCriterion("LogUDiskOp like", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopNotLike(String value) {
            addCriterion("LogUDiskOp not like", value, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopIn(List<String> values) {
            addCriterion("LogUDiskOp in", values, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopNotIn(List<String> values) {
            addCriterion("LogUDiskOp not in", values, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopBetween(String value1, String value2) {
            addCriterion("LogUDiskOp between", value1, value2, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLogudiskopNotBetween(String value1, String value2) {
            addCriterion("LogUDiskOp not between", value1, value2, "logudiskop");
            return (Criteria) this;
        }

        public Criteria andLognetopIsNull() {
            addCriterion("LogNetOp is null");
            return (Criteria) this;
        }

        public Criteria andLognetopIsNotNull() {
            addCriterion("LogNetOp is not null");
            return (Criteria) this;
        }

        public Criteria andLognetopEqualTo(String value) {
            addCriterion("LogNetOp =", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopNotEqualTo(String value) {
            addCriterion("LogNetOp <>", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopGreaterThan(String value) {
            addCriterion("LogNetOp >", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopGreaterThanOrEqualTo(String value) {
            addCriterion("LogNetOp >=", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopLessThan(String value) {
            addCriterion("LogNetOp <", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopLessThanOrEqualTo(String value) {
            addCriterion("LogNetOp <=", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopLike(String value) {
            addCriterion("LogNetOp like", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopNotLike(String value) {
            addCriterion("LogNetOp not like", value, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopIn(List<String> values) {
            addCriterion("LogNetOp in", values, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopNotIn(List<String> values) {
            addCriterion("LogNetOp not in", values, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopBetween(String value1, String value2) {
            addCriterion("LogNetOp between", value1, value2, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLognetopNotBetween(String value1, String value2) {
            addCriterion("LogNetOp not between", value1, value2, "lognetop");
            return (Criteria) this;
        }

        public Criteria andLogprintIsNull() {
            addCriterion("LogPrint is null");
            return (Criteria) this;
        }

        public Criteria andLogprintIsNotNull() {
            addCriterion("LogPrint is not null");
            return (Criteria) this;
        }

        public Criteria andLogprintEqualTo(String value) {
            addCriterion("LogPrint =", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintNotEqualTo(String value) {
            addCriterion("LogPrint <>", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintGreaterThan(String value) {
            addCriterion("LogPrint >", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintGreaterThanOrEqualTo(String value) {
            addCriterion("LogPrint >=", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintLessThan(String value) {
            addCriterion("LogPrint <", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintLessThanOrEqualTo(String value) {
            addCriterion("LogPrint <=", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintLike(String value) {
            addCriterion("LogPrint like", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintNotLike(String value) {
            addCriterion("LogPrint not like", value, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintIn(List<String> values) {
            addCriterion("LogPrint in", values, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintNotIn(List<String> values) {
            addCriterion("LogPrint not in", values, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintBetween(String value1, String value2) {
            addCriterion("LogPrint between", value1, value2, "logprint");
            return (Criteria) this;
        }

        public Criteria andLogprintNotBetween(String value1, String value2) {
            addCriterion("LogPrint not between", value1, value2, "logprint");
            return (Criteria) this;
        }

        public Criteria andUseblacklistIsNull() {
            addCriterion("UseBlackList is null");
            return (Criteria) this;
        }

        public Criteria andUseblacklistIsNotNull() {
            addCriterion("UseBlackList is not null");
            return (Criteria) this;
        }

        public Criteria andUseblacklistEqualTo(String value) {
            addCriterion("UseBlackList =", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistNotEqualTo(String value) {
            addCriterion("UseBlackList <>", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistGreaterThan(String value) {
            addCriterion("UseBlackList >", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistGreaterThanOrEqualTo(String value) {
            addCriterion("UseBlackList >=", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistLessThan(String value) {
            addCriterion("UseBlackList <", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistLessThanOrEqualTo(String value) {
            addCriterion("UseBlackList <=", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistLike(String value) {
            addCriterion("UseBlackList like", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistNotLike(String value) {
            addCriterion("UseBlackList not like", value, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistIn(List<String> values) {
            addCriterion("UseBlackList in", values, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistNotIn(List<String> values) {
            addCriterion("UseBlackList not in", values, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistBetween(String value1, String value2) {
            addCriterion("UseBlackList between", value1, value2, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andUseblacklistNotBetween(String value1, String value2) {
            addCriterion("UseBlackList not between", value1, value2, "useblacklist");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledIsNull() {
            addCriterion("ClipboardControled is null");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledIsNotNull() {
            addCriterion("ClipboardControled is not null");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledEqualTo(String value) {
            addCriterion("ClipboardControled =", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledNotEqualTo(String value) {
            addCriterion("ClipboardControled <>", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledGreaterThan(String value) {
            addCriterion("ClipboardControled >", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledGreaterThanOrEqualTo(String value) {
            addCriterion("ClipboardControled >=", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledLessThan(String value) {
            addCriterion("ClipboardControled <", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledLessThanOrEqualTo(String value) {
            addCriterion("ClipboardControled <=", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledLike(String value) {
            addCriterion("ClipboardControled like", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledNotLike(String value) {
            addCriterion("ClipboardControled not like", value, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledIn(List<String> values) {
            addCriterion("ClipboardControled in", values, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledNotIn(List<String> values) {
            addCriterion("ClipboardControled not in", values, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledBetween(String value1, String value2) {
            addCriterion("ClipboardControled between", value1, value2, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andClipboardcontroledNotBetween(String value1, String value2) {
            addCriterion("ClipboardControled not between", value1, value2, "clipboardcontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledIsNull() {
            addCriterion("OLEControled is null");
            return (Criteria) this;
        }

        public Criteria andOlecontroledIsNotNull() {
            addCriterion("OLEControled is not null");
            return (Criteria) this;
        }

        public Criteria andOlecontroledEqualTo(String value) {
            addCriterion("OLEControled =", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledNotEqualTo(String value) {
            addCriterion("OLEControled <>", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledGreaterThan(String value) {
            addCriterion("OLEControled >", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledGreaterThanOrEqualTo(String value) {
            addCriterion("OLEControled >=", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledLessThan(String value) {
            addCriterion("OLEControled <", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledLessThanOrEqualTo(String value) {
            addCriterion("OLEControled <=", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledLike(String value) {
            addCriterion("OLEControled like", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledNotLike(String value) {
            addCriterion("OLEControled not like", value, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledIn(List<String> values) {
            addCriterion("OLEControled in", values, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledNotIn(List<String> values) {
            addCriterion("OLEControled not in", values, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledBetween(String value1, String value2) {
            addCriterion("OLEControled between", value1, value2, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andOlecontroledNotBetween(String value1, String value2) {
            addCriterion("OLEControled not between", value1, value2, "olecontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledIsNull() {
            addCriterion("DragdropControled is null");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledIsNotNull() {
            addCriterion("DragdropControled is not null");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledEqualTo(String value) {
            addCriterion("DragdropControled =", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledNotEqualTo(String value) {
            addCriterion("DragdropControled <>", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledGreaterThan(String value) {
            addCriterion("DragdropControled >", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledGreaterThanOrEqualTo(String value) {
            addCriterion("DragdropControled >=", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledLessThan(String value) {
            addCriterion("DragdropControled <", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledLessThanOrEqualTo(String value) {
            addCriterion("DragdropControled <=", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledLike(String value) {
            addCriterion("DragdropControled like", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledNotLike(String value) {
            addCriterion("DragdropControled not like", value, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledIn(List<String> values) {
            addCriterion("DragdropControled in", values, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledNotIn(List<String> values) {
            addCriterion("DragdropControled not in", values, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledBetween(String value1, String value2) {
            addCriterion("DragdropControled between", value1, value2, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andDragdropcontroledNotBetween(String value1, String value2) {
            addCriterion("DragdropControled not between", value1, value2, "dragdropcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledIsNull() {
            addCriterion("SnapShotControled is null");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledIsNotNull() {
            addCriterion("SnapShotControled is not null");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledEqualTo(String value) {
            addCriterion("SnapShotControled =", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledNotEqualTo(String value) {
            addCriterion("SnapShotControled <>", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledGreaterThan(String value) {
            addCriterion("SnapShotControled >", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledGreaterThanOrEqualTo(String value) {
            addCriterion("SnapShotControled >=", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledLessThan(String value) {
            addCriterion("SnapShotControled <", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledLessThanOrEqualTo(String value) {
            addCriterion("SnapShotControled <=", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledLike(String value) {
            addCriterion("SnapShotControled like", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledNotLike(String value) {
            addCriterion("SnapShotControled not like", value, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledIn(List<String> values) {
            addCriterion("SnapShotControled in", values, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledNotIn(List<String> values) {
            addCriterion("SnapShotControled not in", values, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledBetween(String value1, String value2) {
            addCriterion("SnapShotControled between", value1, value2, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andSnapshotcontroledNotBetween(String value1, String value2) {
            addCriterion("SnapShotControled not between", value1, value2, "snapshotcontroled");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexIsNull() {
            addCriterion("PrintControledEx is null");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexIsNotNull() {
            addCriterion("PrintControledEx is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexEqualTo(String value) {
            addCriterion("PrintControledEx =", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexNotEqualTo(String value) {
            addCriterion("PrintControledEx <>", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexGreaterThan(String value) {
            addCriterion("PrintControledEx >", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexGreaterThanOrEqualTo(String value) {
            addCriterion("PrintControledEx >=", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexLessThan(String value) {
            addCriterion("PrintControledEx <", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexLessThanOrEqualTo(String value) {
            addCriterion("PrintControledEx <=", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexLike(String value) {
            addCriterion("PrintControledEx like", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexNotLike(String value) {
            addCriterion("PrintControledEx not like", value, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexIn(List<String> values) {
            addCriterion("PrintControledEx in", values, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexNotIn(List<String> values) {
            addCriterion("PrintControledEx not in", values, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexBetween(String value1, String value2) {
            addCriterion("PrintControledEx between", value1, value2, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andPrintcontroledexNotBetween(String value1, String value2) {
            addCriterion("PrintControledEx not between", value1, value2, "printcontroledex");
            return (Criteria) this;
        }

        public Criteria andNeedkeyIsNull() {
            addCriterion("NeedKey is null");
            return (Criteria) this;
        }

        public Criteria andNeedkeyIsNotNull() {
            addCriterion("NeedKey is not null");
            return (Criteria) this;
        }

        public Criteria andNeedkeyEqualTo(String value) {
            addCriterion("NeedKey =", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyNotEqualTo(String value) {
            addCriterion("NeedKey <>", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyGreaterThan(String value) {
            addCriterion("NeedKey >", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyGreaterThanOrEqualTo(String value) {
            addCriterion("NeedKey >=", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyLessThan(String value) {
            addCriterion("NeedKey <", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyLessThanOrEqualTo(String value) {
            addCriterion("NeedKey <=", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyLike(String value) {
            addCriterion("NeedKey like", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyNotLike(String value) {
            addCriterion("NeedKey not like", value, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyIn(List<String> values) {
            addCriterion("NeedKey in", values, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyNotIn(List<String> values) {
            addCriterion("NeedKey not in", values, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyBetween(String value1, String value2) {
            addCriterion("NeedKey between", value1, value2, "needkey");
            return (Criteria) this;
        }

        public Criteria andNeedkeyNotBetween(String value1, String value2) {
            addCriterion("NeedKey not between", value1, value2, "needkey");
            return (Criteria) this;
        }

        public Criteria andValidatedaysIsNull() {
            addCriterion("ValidateDays is null");
            return (Criteria) this;
        }

        public Criteria andValidatedaysIsNotNull() {
            addCriterion("ValidateDays is not null");
            return (Criteria) this;
        }

        public Criteria andValidatedaysEqualTo(Integer value) {
            addCriterion("ValidateDays =", value, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysNotEqualTo(Integer value) {
            addCriterion("ValidateDays <>", value, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysGreaterThan(Integer value) {
            addCriterion("ValidateDays >", value, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidateDays >=", value, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysLessThan(Integer value) {
            addCriterion("ValidateDays <", value, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysLessThanOrEqualTo(Integer value) {
            addCriterion("ValidateDays <=", value, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysIn(List<Integer> values) {
            addCriterion("ValidateDays in", values, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysNotIn(List<Integer> values) {
            addCriterion("ValidateDays not in", values, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysBetween(Integer value1, Integer value2) {
            addCriterion("ValidateDays between", value1, value2, "validatedays");
            return (Criteria) this;
        }

        public Criteria andValidatedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidateDays not between", value1, value2, "validatedays");
            return (Criteria) this;
        }

        public Criteria andPreviewspecIsNull() {
            addCriterion("PreviewSpec is null");
            return (Criteria) this;
        }

        public Criteria andPreviewspecIsNotNull() {
            addCriterion("PreviewSpec is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewspecEqualTo(String value) {
            addCriterion("PreviewSpec =", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecNotEqualTo(String value) {
            addCriterion("PreviewSpec <>", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecGreaterThan(String value) {
            addCriterion("PreviewSpec >", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecGreaterThanOrEqualTo(String value) {
            addCriterion("PreviewSpec >=", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecLessThan(String value) {
            addCriterion("PreviewSpec <", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecLessThanOrEqualTo(String value) {
            addCriterion("PreviewSpec <=", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecLike(String value) {
            addCriterion("PreviewSpec like", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecNotLike(String value) {
            addCriterion("PreviewSpec not like", value, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecIn(List<String> values) {
            addCriterion("PreviewSpec in", values, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecNotIn(List<String> values) {
            addCriterion("PreviewSpec not in", values, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecBetween(String value1, String value2) {
            addCriterion("PreviewSpec between", value1, value2, "previewspec");
            return (Criteria) this;
        }

        public Criteria andPreviewspecNotBetween(String value1, String value2) {
            addCriterion("PreviewSpec not between", value1, value2, "previewspec");
            return (Criteria) this;
        }

        public Criteria andAutobackupIsNull() {
            addCriterion("AutoBackup is null");
            return (Criteria) this;
        }

        public Criteria andAutobackupIsNotNull() {
            addCriterion("AutoBackup is not null");
            return (Criteria) this;
        }

        public Criteria andAutobackupEqualTo(String value) {
            addCriterion("AutoBackup =", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupNotEqualTo(String value) {
            addCriterion("AutoBackup <>", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupGreaterThan(String value) {
            addCriterion("AutoBackup >", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupGreaterThanOrEqualTo(String value) {
            addCriterion("AutoBackup >=", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupLessThan(String value) {
            addCriterion("AutoBackup <", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupLessThanOrEqualTo(String value) {
            addCriterion("AutoBackup <=", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupLike(String value) {
            addCriterion("AutoBackup like", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupNotLike(String value) {
            addCriterion("AutoBackup not like", value, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupIn(List<String> values) {
            addCriterion("AutoBackup in", values, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupNotIn(List<String> values) {
            addCriterion("AutoBackup not in", values, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupBetween(String value1, String value2) {
            addCriterion("AutoBackup between", value1, value2, "autobackup");
            return (Criteria) this;
        }

        public Criteria andAutobackupNotBetween(String value1, String value2) {
            addCriterion("AutoBackup not between", value1, value2, "autobackup");
            return (Criteria) this;
        }

        public Criteria andBackupspecIsNull() {
            addCriterion("BackupSpec is null");
            return (Criteria) this;
        }

        public Criteria andBackupspecIsNotNull() {
            addCriterion("BackupSpec is not null");
            return (Criteria) this;
        }

        public Criteria andBackupspecEqualTo(String value) {
            addCriterion("BackupSpec =", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecNotEqualTo(String value) {
            addCriterion("BackupSpec <>", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecGreaterThan(String value) {
            addCriterion("BackupSpec >", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecGreaterThanOrEqualTo(String value) {
            addCriterion("BackupSpec >=", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecLessThan(String value) {
            addCriterion("BackupSpec <", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecLessThanOrEqualTo(String value) {
            addCriterion("BackupSpec <=", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecLike(String value) {
            addCriterion("BackupSpec like", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecNotLike(String value) {
            addCriterion("BackupSpec not like", value, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecIn(List<String> values) {
            addCriterion("BackupSpec in", values, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecNotIn(List<String> values) {
            addCriterion("BackupSpec not in", values, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecBetween(String value1, String value2) {
            addCriterion("BackupSpec between", value1, value2, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupspecNotBetween(String value1, String value2) {
            addCriterion("BackupSpec not between", value1, value2, "backupspec");
            return (Criteria) this;
        }

        public Criteria andBackupdirIsNull() {
            addCriterion("BackupDir is null");
            return (Criteria) this;
        }

        public Criteria andBackupdirIsNotNull() {
            addCriterion("BackupDir is not null");
            return (Criteria) this;
        }

        public Criteria andBackupdirEqualTo(String value) {
            addCriterion("BackupDir =", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirNotEqualTo(String value) {
            addCriterion("BackupDir <>", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirGreaterThan(String value) {
            addCriterion("BackupDir >", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirGreaterThanOrEqualTo(String value) {
            addCriterion("BackupDir >=", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirLessThan(String value) {
            addCriterion("BackupDir <", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirLessThanOrEqualTo(String value) {
            addCriterion("BackupDir <=", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirLike(String value) {
            addCriterion("BackupDir like", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirNotLike(String value) {
            addCriterion("BackupDir not like", value, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirIn(List<String> values) {
            addCriterion("BackupDir in", values, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirNotIn(List<String> values) {
            addCriterion("BackupDir not in", values, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirBetween(String value1, String value2) {
            addCriterion("BackupDir between", value1, value2, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupdirNotBetween(String value1, String value2) {
            addCriterion("BackupDir not between", value1, value2, "backupdir");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecIsNull() {
            addCriterion("BackupExcludeSpec is null");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecIsNotNull() {
            addCriterion("BackupExcludeSpec is not null");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecEqualTo(String value) {
            addCriterion("BackupExcludeSpec =", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecNotEqualTo(String value) {
            addCriterion("BackupExcludeSpec <>", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecGreaterThan(String value) {
            addCriterion("BackupExcludeSpec >", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecGreaterThanOrEqualTo(String value) {
            addCriterion("BackupExcludeSpec >=", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecLessThan(String value) {
            addCriterion("BackupExcludeSpec <", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecLessThanOrEqualTo(String value) {
            addCriterion("BackupExcludeSpec <=", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecLike(String value) {
            addCriterion("BackupExcludeSpec like", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecNotLike(String value) {
            addCriterion("BackupExcludeSpec not like", value, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecIn(List<String> values) {
            addCriterion("BackupExcludeSpec in", values, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecNotIn(List<String> values) {
            addCriterion("BackupExcludeSpec not in", values, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecBetween(String value1, String value2) {
            addCriterion("BackupExcludeSpec between", value1, value2, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupexcludespecNotBetween(String value1, String value2) {
            addCriterion("BackupExcludeSpec not between", value1, value2, "backupexcludespec");
            return (Criteria) this;
        }

        public Criteria andBackupcountIsNull() {
            addCriterion("BackupCount is null");
            return (Criteria) this;
        }

        public Criteria andBackupcountIsNotNull() {
            addCriterion("BackupCount is not null");
            return (Criteria) this;
        }

        public Criteria andBackupcountEqualTo(Integer value) {
            addCriterion("BackupCount =", value, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountNotEqualTo(Integer value) {
            addCriterion("BackupCount <>", value, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountGreaterThan(Integer value) {
            addCriterion("BackupCount >", value, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackupCount >=", value, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountLessThan(Integer value) {
            addCriterion("BackupCount <", value, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountLessThanOrEqualTo(Integer value) {
            addCriterion("BackupCount <=", value, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountIn(List<Integer> values) {
            addCriterion("BackupCount in", values, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountNotIn(List<Integer> values) {
            addCriterion("BackupCount not in", values, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountBetween(Integer value1, Integer value2) {
            addCriterion("BackupCount between", value1, value2, "backupcount");
            return (Criteria) this;
        }

        public Criteria andBackupcountNotBetween(Integer value1, Integer value2) {
            addCriterion("BackupCount not between", value1, value2, "backupcount");
            return (Criteria) this;
        }

        public Criteria andOverlayiconIsNull() {
            addCriterion("OverlayIcon is null");
            return (Criteria) this;
        }

        public Criteria andOverlayiconIsNotNull() {
            addCriterion("OverlayIcon is not null");
            return (Criteria) this;
        }

        public Criteria andOverlayiconEqualTo(String value) {
            addCriterion("OverlayIcon =", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconNotEqualTo(String value) {
            addCriterion("OverlayIcon <>", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconGreaterThan(String value) {
            addCriterion("OverlayIcon >", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconGreaterThanOrEqualTo(String value) {
            addCriterion("OverlayIcon >=", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconLessThan(String value) {
            addCriterion("OverlayIcon <", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconLessThanOrEqualTo(String value) {
            addCriterion("OverlayIcon <=", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconLike(String value) {
            addCriterion("OverlayIcon like", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconNotLike(String value) {
            addCriterion("OverlayIcon not like", value, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconIn(List<String> values) {
            addCriterion("OverlayIcon in", values, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconNotIn(List<String> values) {
            addCriterion("OverlayIcon not in", values, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconBetween(String value1, String value2) {
            addCriterion("OverlayIcon between", value1, value2, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andOverlayiconNotBetween(String value1, String value2) {
            addCriterion("OverlayIcon not between", value1, value2, "overlayicon");
            return (Criteria) this;
        }

        public Criteria andSpoolsvIsNull() {
            addCriterion("Spoolsv is null");
            return (Criteria) this;
        }

        public Criteria andSpoolsvIsNotNull() {
            addCriterion("Spoolsv is not null");
            return (Criteria) this;
        }

        public Criteria andSpoolsvEqualTo(String value) {
            addCriterion("Spoolsv =", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvNotEqualTo(String value) {
            addCriterion("Spoolsv <>", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvGreaterThan(String value) {
            addCriterion("Spoolsv >", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvGreaterThanOrEqualTo(String value) {
            addCriterion("Spoolsv >=", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvLessThan(String value) {
            addCriterion("Spoolsv <", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvLessThanOrEqualTo(String value) {
            addCriterion("Spoolsv <=", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvLike(String value) {
            addCriterion("Spoolsv like", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvNotLike(String value) {
            addCriterion("Spoolsv not like", value, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvIn(List<String> values) {
            addCriterion("Spoolsv in", values, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvNotIn(List<String> values) {
            addCriterion("Spoolsv not in", values, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvBetween(String value1, String value2) {
            addCriterion("Spoolsv between", value1, value2, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andSpoolsvNotBetween(String value1, String value2) {
            addCriterion("Spoolsv not between", value1, value2, "spoolsv");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotIsNull() {
            addCriterion("EncryptionSlot is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotIsNotNull() {
            addCriterion("EncryptionSlot is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotEqualTo(String value) {
            addCriterion("EncryptionSlot =", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotNotEqualTo(String value) {
            addCriterion("EncryptionSlot <>", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotGreaterThan(String value) {
            addCriterion("EncryptionSlot >", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotGreaterThanOrEqualTo(String value) {
            addCriterion("EncryptionSlot >=", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotLessThan(String value) {
            addCriterion("EncryptionSlot <", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotLessThanOrEqualTo(String value) {
            addCriterion("EncryptionSlot <=", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotLike(String value) {
            addCriterion("EncryptionSlot like", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotNotLike(String value) {
            addCriterion("EncryptionSlot not like", value, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotIn(List<String> values) {
            addCriterion("EncryptionSlot in", values, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotNotIn(List<String> values) {
            addCriterion("EncryptionSlot not in", values, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotBetween(String value1, String value2) {
            addCriterion("EncryptionSlot between", value1, value2, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andEncryptionslotNotBetween(String value1, String value2) {
            addCriterion("EncryptionSlot not between", value1, value2, "encryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotIsNull() {
            addCriterion("DecryptionSlot is null");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotIsNotNull() {
            addCriterion("DecryptionSlot is not null");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotEqualTo(String value) {
            addCriterion("DecryptionSlot =", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotNotEqualTo(String value) {
            addCriterion("DecryptionSlot <>", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotGreaterThan(String value) {
            addCriterion("DecryptionSlot >", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotGreaterThanOrEqualTo(String value) {
            addCriterion("DecryptionSlot >=", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotLessThan(String value) {
            addCriterion("DecryptionSlot <", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotLessThanOrEqualTo(String value) {
            addCriterion("DecryptionSlot <=", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotLike(String value) {
            addCriterion("DecryptionSlot like", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotNotLike(String value) {
            addCriterion("DecryptionSlot not like", value, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotIn(List<String> values) {
            addCriterion("DecryptionSlot in", values, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotNotIn(List<String> values) {
            addCriterion("DecryptionSlot not in", values, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotBetween(String value1, String value2) {
            addCriterion("DecryptionSlot between", value1, value2, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andDecryptionslotNotBetween(String value1, String value2) {
            addCriterion("DecryptionSlot not between", value1, value2, "decryptionslot");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNull() {
            addCriterion("Watermark is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNotNull() {
            addCriterion("Watermark is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkEqualTo(String value) {
            addCriterion("Watermark =", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotEqualTo(String value) {
            addCriterion("Watermark <>", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThan(String value) {
            addCriterion("Watermark >", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThanOrEqualTo(String value) {
            addCriterion("Watermark >=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThan(String value) {
            addCriterion("Watermark <", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThanOrEqualTo(String value) {
            addCriterion("Watermark <=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLike(String value) {
            addCriterion("Watermark like", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotLike(String value) {
            addCriterion("Watermark not like", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkIn(List<String> values) {
            addCriterion("Watermark in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotIn(List<String> values) {
            addCriterion("Watermark not in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkBetween(String value1, String value2) {
            addCriterion("Watermark between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotBetween(String value1, String value2) {
            addCriterion("Watermark not between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateIsNull() {
            addCriterion("CheckOfflineDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateIsNotNull() {
            addCriterion("CheckOfflineDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateEqualTo(String value) {
            addCriterion("CheckOfflineDate =", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateNotEqualTo(String value) {
            addCriterion("CheckOfflineDate <>", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateGreaterThan(String value) {
            addCriterion("CheckOfflineDate >", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateGreaterThanOrEqualTo(String value) {
            addCriterion("CheckOfflineDate >=", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateLessThan(String value) {
            addCriterion("CheckOfflineDate <", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateLessThanOrEqualTo(String value) {
            addCriterion("CheckOfflineDate <=", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateLike(String value) {
            addCriterion("CheckOfflineDate like", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateNotLike(String value) {
            addCriterion("CheckOfflineDate not like", value, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateIn(List<String> values) {
            addCriterion("CheckOfflineDate in", values, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateNotIn(List<String> values) {
            addCriterion("CheckOfflineDate not in", values, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateBetween(String value1, String value2) {
            addCriterion("CheckOfflineDate between", value1, value2, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andCheckofflinedateNotBetween(String value1, String value2) {
            addCriterion("CheckOfflineDate not between", value1, value2, "checkofflinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateIsNull() {
            addCriterion("OfflineDate is null");
            return (Criteria) this;
        }

        public Criteria andOfflinedateIsNotNull() {
            addCriterion("OfflineDate is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinedateEqualTo(Date value) {
            addCriterion("OfflineDate =", value, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateNotEqualTo(Date value) {
            addCriterion("OfflineDate <>", value, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateGreaterThan(Date value) {
            addCriterion("OfflineDate >", value, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateGreaterThanOrEqualTo(Date value) {
            addCriterion("OfflineDate >=", value, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateLessThan(Date value) {
            addCriterion("OfflineDate <", value, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateLessThanOrEqualTo(Date value) {
            addCriterion("OfflineDate <=", value, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateIn(List<Date> values) {
            addCriterion("OfflineDate in", values, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateNotIn(List<Date> values) {
            addCriterion("OfflineDate not in", values, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateBetween(Date value1, Date value2) {
            addCriterion("OfflineDate between", value1, value2, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andOfflinedateNotBetween(Date value1, Date value2) {
            addCriterion("OfflineDate not between", value1, value2, "offlinedate");
            return (Criteria) this;
        }

        public Criteria andFtpIsNull() {
            addCriterion("Ftp is null");
            return (Criteria) this;
        }

        public Criteria andFtpIsNotNull() {
            addCriterion("Ftp is not null");
            return (Criteria) this;
        }

        public Criteria andFtpEqualTo(String value) {
            addCriterion("Ftp =", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpNotEqualTo(String value) {
            addCriterion("Ftp <>", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpGreaterThan(String value) {
            addCriterion("Ftp >", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpGreaterThanOrEqualTo(String value) {
            addCriterion("Ftp >=", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpLessThan(String value) {
            addCriterion("Ftp <", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpLessThanOrEqualTo(String value) {
            addCriterion("Ftp <=", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpLike(String value) {
            addCriterion("Ftp like", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpNotLike(String value) {
            addCriterion("Ftp not like", value, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpIn(List<String> values) {
            addCriterion("Ftp in", values, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpNotIn(List<String> values) {
            addCriterion("Ftp not in", values, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpBetween(String value1, String value2) {
            addCriterion("Ftp between", value1, value2, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpNotBetween(String value1, String value2) {
            addCriterion("Ftp not between", value1, value2, "ftp");
            return (Criteria) this;
        }

        public Criteria andFtpusernameIsNull() {
            addCriterion("FtpUserName is null");
            return (Criteria) this;
        }

        public Criteria andFtpusernameIsNotNull() {
            addCriterion("FtpUserName is not null");
            return (Criteria) this;
        }

        public Criteria andFtpusernameEqualTo(String value) {
            addCriterion("FtpUserName =", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameNotEqualTo(String value) {
            addCriterion("FtpUserName <>", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameGreaterThan(String value) {
            addCriterion("FtpUserName >", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameGreaterThanOrEqualTo(String value) {
            addCriterion("FtpUserName >=", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameLessThan(String value) {
            addCriterion("FtpUserName <", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameLessThanOrEqualTo(String value) {
            addCriterion("FtpUserName <=", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameLike(String value) {
            addCriterion("FtpUserName like", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameNotLike(String value) {
            addCriterion("FtpUserName not like", value, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameIn(List<String> values) {
            addCriterion("FtpUserName in", values, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameNotIn(List<String> values) {
            addCriterion("FtpUserName not in", values, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameBetween(String value1, String value2) {
            addCriterion("FtpUserName between", value1, value2, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtpusernameNotBetween(String value1, String value2) {
            addCriterion("FtpUserName not between", value1, value2, "ftpusername");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIsNull() {
            addCriterion("FtpPassword is null");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIsNotNull() {
            addCriterion("FtpPassword is not null");
            return (Criteria) this;
        }

        public Criteria andFtppasswordEqualTo(String value) {
            addCriterion("FtpPassword =", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotEqualTo(String value) {
            addCriterion("FtpPassword <>", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordGreaterThan(String value) {
            addCriterion("FtpPassword >", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("FtpPassword >=", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLessThan(String value) {
            addCriterion("FtpPassword <", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLessThanOrEqualTo(String value) {
            addCriterion("FtpPassword <=", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLike(String value) {
            addCriterion("FtpPassword like", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotLike(String value) {
            addCriterion("FtpPassword not like", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIn(List<String> values) {
            addCriterion("FtpPassword in", values, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotIn(List<String> values) {
            addCriterion("FtpPassword not in", values, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordBetween(String value1, String value2) {
            addCriterion("FtpPassword between", value1, value2, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotBetween(String value1, String value2) {
            addCriterion("FtpPassword not between", value1, value2, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonIsNull() {
            addCriterion("UIShowManagerIcon is null");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonIsNotNull() {
            addCriterion("UIShowManagerIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonEqualTo(String value) {
            addCriterion("UIShowManagerIcon =", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonNotEqualTo(String value) {
            addCriterion("UIShowManagerIcon <>", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonGreaterThan(String value) {
            addCriterion("UIShowManagerIcon >", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonGreaterThanOrEqualTo(String value) {
            addCriterion("UIShowManagerIcon >=", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonLessThan(String value) {
            addCriterion("UIShowManagerIcon <", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonLessThanOrEqualTo(String value) {
            addCriterion("UIShowManagerIcon <=", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonLike(String value) {
            addCriterion("UIShowManagerIcon like", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonNotLike(String value) {
            addCriterion("UIShowManagerIcon not like", value, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonIn(List<String> values) {
            addCriterion("UIShowManagerIcon in", values, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonNotIn(List<String> values) {
            addCriterion("UIShowManagerIcon not in", values, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonBetween(String value1, String value2) {
            addCriterion("UIShowManagerIcon between", value1, value2, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowmanagericonNotBetween(String value1, String value2) {
            addCriterion("UIShowManagerIcon not between", value1, value2, "uishowmanagericon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconIsNull() {
            addCriterion("UIShowExecutorIcon is null");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconIsNotNull() {
            addCriterion("UIShowExecutorIcon is not null");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconEqualTo(String value) {
            addCriterion("UIShowExecutorIcon =", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconNotEqualTo(String value) {
            addCriterion("UIShowExecutorIcon <>", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconGreaterThan(String value) {
            addCriterion("UIShowExecutorIcon >", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconGreaterThanOrEqualTo(String value) {
            addCriterion("UIShowExecutorIcon >=", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconLessThan(String value) {
            addCriterion("UIShowExecutorIcon <", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconLessThanOrEqualTo(String value) {
            addCriterion("UIShowExecutorIcon <=", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconLike(String value) {
            addCriterion("UIShowExecutorIcon like", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconNotLike(String value) {
            addCriterion("UIShowExecutorIcon not like", value, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconIn(List<String> values) {
            addCriterion("UIShowExecutorIcon in", values, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconNotIn(List<String> values) {
            addCriterion("UIShowExecutorIcon not in", values, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconBetween(String value1, String value2) {
            addCriterion("UIShowExecutorIcon between", value1, value2, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andUishowexecutoriconNotBetween(String value1, String value2) {
            addCriterion("UIShowExecutorIcon not between", value1, value2, "uishowexecutoricon");
            return (Criteria) this;
        }

        public Criteria andFtpbackupIsNull() {
            addCriterion("FtpBackup is null");
            return (Criteria) this;
        }

        public Criteria andFtpbackupIsNotNull() {
            addCriterion("FtpBackup is not null");
            return (Criteria) this;
        }

        public Criteria andFtpbackupEqualTo(String value) {
            addCriterion("FtpBackup =", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupNotEqualTo(String value) {
            addCriterion("FtpBackup <>", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupGreaterThan(String value) {
            addCriterion("FtpBackup >", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupGreaterThanOrEqualTo(String value) {
            addCriterion("FtpBackup >=", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupLessThan(String value) {
            addCriterion("FtpBackup <", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupLessThanOrEqualTo(String value) {
            addCriterion("FtpBackup <=", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupLike(String value) {
            addCriterion("FtpBackup like", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupNotLike(String value) {
            addCriterion("FtpBackup not like", value, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupIn(List<String> values) {
            addCriterion("FtpBackup in", values, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupNotIn(List<String> values) {
            addCriterion("FtpBackup not in", values, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupBetween(String value1, String value2) {
            addCriterion("FtpBackup between", value1, value2, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupNotBetween(String value1, String value2) {
            addCriterion("FtpBackup not between", value1, value2, "ftpbackup");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameIsNull() {
            addCriterion("FtpBackupUserName is null");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameIsNotNull() {
            addCriterion("FtpBackupUserName is not null");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameEqualTo(String value) {
            addCriterion("FtpBackupUserName =", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameNotEqualTo(String value) {
            addCriterion("FtpBackupUserName <>", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameGreaterThan(String value) {
            addCriterion("FtpBackupUserName >", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameGreaterThanOrEqualTo(String value) {
            addCriterion("FtpBackupUserName >=", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameLessThan(String value) {
            addCriterion("FtpBackupUserName <", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameLessThanOrEqualTo(String value) {
            addCriterion("FtpBackupUserName <=", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameLike(String value) {
            addCriterion("FtpBackupUserName like", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameNotLike(String value) {
            addCriterion("FtpBackupUserName not like", value, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameIn(List<String> values) {
            addCriterion("FtpBackupUserName in", values, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameNotIn(List<String> values) {
            addCriterion("FtpBackupUserName not in", values, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameBetween(String value1, String value2) {
            addCriterion("FtpBackupUserName between", value1, value2, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackupusernameNotBetween(String value1, String value2) {
            addCriterion("FtpBackupUserName not between", value1, value2, "ftpbackupusername");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordIsNull() {
            addCriterion("FtpBackupPassword is null");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordIsNotNull() {
            addCriterion("FtpBackupPassword is not null");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordEqualTo(String value) {
            addCriterion("FtpBackupPassword =", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordNotEqualTo(String value) {
            addCriterion("FtpBackupPassword <>", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordGreaterThan(String value) {
            addCriterion("FtpBackupPassword >", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("FtpBackupPassword >=", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordLessThan(String value) {
            addCriterion("FtpBackupPassword <", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordLessThanOrEqualTo(String value) {
            addCriterion("FtpBackupPassword <=", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordLike(String value) {
            addCriterion("FtpBackupPassword like", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordNotLike(String value) {
            addCriterion("FtpBackupPassword not like", value, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordIn(List<String> values) {
            addCriterion("FtpBackupPassword in", values, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordNotIn(List<String> values) {
            addCriterion("FtpBackupPassword not in", values, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordBetween(String value1, String value2) {
            addCriterion("FtpBackupPassword between", value1, value2, "ftpbackuppassword");
            return (Criteria) this;
        }

        public Criteria andFtpbackuppasswordNotBetween(String value1, String value2) {
            addCriterion("FtpBackupPassword not between", value1, value2, "ftpbackuppassword");
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