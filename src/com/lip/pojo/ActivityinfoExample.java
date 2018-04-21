package com.lip.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAvidIsNull() {
            addCriterion("avid is null");
            return (Criteria) this;
        }

        public Criteria andAvidIsNotNull() {
            addCriterion("avid is not null");
            return (Criteria) this;
        }

        public Criteria andAvidEqualTo(Integer value) {
            addCriterion("avid =", value, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidNotEqualTo(Integer value) {
            addCriterion("avid <>", value, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidGreaterThan(Integer value) {
            addCriterion("avid >", value, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("avid >=", value, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidLessThan(Integer value) {
            addCriterion("avid <", value, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidLessThanOrEqualTo(Integer value) {
            addCriterion("avid <=", value, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidIn(List<Integer> values) {
            addCriterion("avid in", values, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidNotIn(List<Integer> values) {
            addCriterion("avid not in", values, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidBetween(Integer value1, Integer value2) {
            addCriterion("avid between", value1, value2, "avid");
            return (Criteria) this;
        }

        public Criteria andAvidNotBetween(Integer value1, Integer value2) {
            addCriterion("avid not between", value1, value2, "avid");
            return (Criteria) this;
        }

        public Criteria andAvnameIsNull() {
            addCriterion("avname is null");
            return (Criteria) this;
        }

        public Criteria andAvnameIsNotNull() {
            addCriterion("avname is not null");
            return (Criteria) this;
        }

        public Criteria andAvnameEqualTo(String value) {
            addCriterion("avname =", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameNotEqualTo(String value) {
            addCriterion("avname <>", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameGreaterThan(String value) {
            addCriterion("avname >", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameGreaterThanOrEqualTo(String value) {
            addCriterion("avname >=", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameLessThan(String value) {
            addCriterion("avname <", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameLessThanOrEqualTo(String value) {
            addCriterion("avname <=", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameLike(String value) {
            addCriterion("avname like", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameNotLike(String value) {
            addCriterion("avname not like", value, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameIn(List<String> values) {
            addCriterion("avname in", values, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameNotIn(List<String> values) {
            addCriterion("avname not in", values, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameBetween(String value1, String value2) {
            addCriterion("avname between", value1, value2, "avname");
            return (Criteria) this;
        }

        public Criteria andAvnameNotBetween(String value1, String value2) {
            addCriterion("avname not between", value1, value2, "avname");
            return (Criteria) this;
        }

        public Criteria andAvplaceIsNull() {
            addCriterion("avplace is null");
            return (Criteria) this;
        }

        public Criteria andAvplaceIsNotNull() {
            addCriterion("avplace is not null");
            return (Criteria) this;
        }

        public Criteria andAvplaceEqualTo(String value) {
            addCriterion("avplace =", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceNotEqualTo(String value) {
            addCriterion("avplace <>", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceGreaterThan(String value) {
            addCriterion("avplace >", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceGreaterThanOrEqualTo(String value) {
            addCriterion("avplace >=", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceLessThan(String value) {
            addCriterion("avplace <", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceLessThanOrEqualTo(String value) {
            addCriterion("avplace <=", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceLike(String value) {
            addCriterion("avplace like", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceNotLike(String value) {
            addCriterion("avplace not like", value, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceIn(List<String> values) {
            addCriterion("avplace in", values, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceNotIn(List<String> values) {
            addCriterion("avplace not in", values, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceBetween(String value1, String value2) {
            addCriterion("avplace between", value1, value2, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvplaceNotBetween(String value1, String value2) {
            addCriterion("avplace not between", value1, value2, "avplace");
            return (Criteria) this;
        }

        public Criteria andAvstimeIsNull() {
            addCriterion("avstime is null");
            return (Criteria) this;
        }

        public Criteria andAvstimeIsNotNull() {
            addCriterion("avstime is not null");
            return (Criteria) this;
        }

        public Criteria andAvstimeEqualTo(Date value) {
            addCriterionForJDBCDate("avstime =", value, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("avstime <>", value, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("avstime >", value, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("avstime >=", value, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeLessThan(Date value) {
            addCriterionForJDBCDate("avstime <", value, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("avstime <=", value, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeIn(List<Date> values) {
            addCriterionForJDBCDate("avstime in", values, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("avstime not in", values, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("avstime between", value1, value2, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("avstime not between", value1, value2, "avstime");
            return (Criteria) this;
        }

        public Criteria andAvpicIsNull() {
            addCriterion("avpic is null");
            return (Criteria) this;
        }

        public Criteria andAvpicIsNotNull() {
            addCriterion("avpic is not null");
            return (Criteria) this;
        }

        public Criteria andAvpicEqualTo(String value) {
            addCriterion("avpic =", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicNotEqualTo(String value) {
            addCriterion("avpic <>", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicGreaterThan(String value) {
            addCriterion("avpic >", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicGreaterThanOrEqualTo(String value) {
            addCriterion("avpic >=", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicLessThan(String value) {
            addCriterion("avpic <", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicLessThanOrEqualTo(String value) {
            addCriterion("avpic <=", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicLike(String value) {
            addCriterion("avpic like", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicNotLike(String value) {
            addCriterion("avpic not like", value, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicIn(List<String> values) {
            addCriterion("avpic in", values, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicNotIn(List<String> values) {
            addCriterion("avpic not in", values, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicBetween(String value1, String value2) {
            addCriterion("avpic between", value1, value2, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvpicNotBetween(String value1, String value2) {
            addCriterion("avpic not between", value1, value2, "avpic");
            return (Criteria) this;
        }

        public Criteria andAvdetailIsNull() {
            addCriterion("avdetail is null");
            return (Criteria) this;
        }

        public Criteria andAvdetailIsNotNull() {
            addCriterion("avdetail is not null");
            return (Criteria) this;
        }

        public Criteria andAvdetailEqualTo(String value) {
            addCriterion("avdetail =", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailNotEqualTo(String value) {
            addCriterion("avdetail <>", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailGreaterThan(String value) {
            addCriterion("avdetail >", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailGreaterThanOrEqualTo(String value) {
            addCriterion("avdetail >=", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailLessThan(String value) {
            addCriterion("avdetail <", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailLessThanOrEqualTo(String value) {
            addCriterion("avdetail <=", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailLike(String value) {
            addCriterion("avdetail like", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailNotLike(String value) {
            addCriterion("avdetail not like", value, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailIn(List<String> values) {
            addCriterion("avdetail in", values, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailNotIn(List<String> values) {
            addCriterion("avdetail not in", values, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailBetween(String value1, String value2) {
            addCriterion("avdetail between", value1, value2, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvdetailNotBetween(String value1, String value2) {
            addCriterion("avdetail not between", value1, value2, "avdetail");
            return (Criteria) this;
        }

        public Criteria andAvetimeIsNull() {
            addCriterion("avetime is null");
            return (Criteria) this;
        }

        public Criteria andAvetimeIsNotNull() {
            addCriterion("avetime is not null");
            return (Criteria) this;
        }

        public Criteria andAvetimeEqualTo(Date value) {
            addCriterion("avetime =", value, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeNotEqualTo(Date value) {
            addCriterion("avetime <>", value, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeGreaterThan(Date value) {
            addCriterion("avetime >", value, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("avetime >=", value, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeLessThan(Date value) {
            addCriterion("avetime <", value, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeLessThanOrEqualTo(Date value) {
            addCriterion("avetime <=", value, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeIn(List<Date> values) {
            addCriterion("avetime in", values, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeNotIn(List<Date> values) {
            addCriterion("avetime not in", values, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeBetween(Date value1, Date value2) {
            addCriterion("avetime between", value1, value2, "avetime");
            return (Criteria) this;
        }

        public Criteria andAvetimeNotBetween(Date value1, Date value2) {
            addCriterion("avetime not between", value1, value2, "avetime");
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