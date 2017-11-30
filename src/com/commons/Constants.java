package com.commons;

public class Constants {

    /*Constants related to Jakarta Struts */
    /**
     * Constant for storing the user status as whether the user accessing the system is a
     * valid user or not.The same will be set on Login.
     */
    public static final String USER_CONTAINER_KEY = "ContainerKey";
    public static final String INPUT_PATH = "inputfile_path";
    /**
     * For mapping the forward value specified in the struts-config file in the case
     * of successful operation
     */
    public static final String SUCCESS_FORWARD = "success";
    /**
     * For mapping the forward value specified in the struts-config file in the case
     * of successful operation
     */
    public static final String FAILURE_FORWARD = "failure";
    /**
     * For mapping the forward value specified in the struts-config file in the case
     * of file upload operation
     */
    public static final String FILE_UPLOAD_FORWARD = "fileUpload";
    /**
     * For mapping to error page in the struts-config file in case of errors.
     */
    public static final String SYSTEM_FAILURE_PAGE_FORWARD = "errorpage";
    /**
     * For storing the login status of the current user.
     */
    public static final String LOGIN_SUCCESSFUL = "loginSuccess";
    /**
     * Constant for storing the resource bundle location
     */
    public static final String RESOURCE_BUNDLE = "ResourceBundle";
    /**
     * Constant for storing the exception message bundle location
     */
    public static final String ERR_MESSAGE_BUNDLE = "ExceptionMsgBundle";
    /**
     * Constant to store empty string
     */
    public static final String EMPTY_STRING = "";
    /**
     * Constant to store ascending keyword for SQL Queries
     */
    public static final String ASCENDING = "ASC";
    /**
     * Constant to store descending keyword for SQL Queries
     */
    public static final String DESCENDING = "DESC";
    /**
     * Constant to store ALL keyword for SQL Queries
     */
    public static final String ALL = "All";
    /**
     * Constant to store * keyword for SQL Queries
     */
    public static final String ASTERIX = "*";

     /**
     * Constant to store ZM,NM,TM keyword for SQL Queries
     */
    public static final String ZM = "ZM";
        public static final String NM = "NM";
            public static final String TM = "TM";
    /**
     * Constant to store REQUESTOR keyword for SQL Queries
     */
    public static final String USER = "User";


    /**
     * Constant to store TECHNICIAN keyword for SQL Queries
     */
    public static final String TECHNICIAN = "Technician";
    public static final String CMDB = "CMDB";
    /**
     * Constant to store HELPDESK ADMINISTRATOR keyword for SQL Queries
     */
    public static final String HELPDESK_ADMINISTRATOR = "SDM";
    /**
     * Constant to store MAIN HELPDESK ADMINISTRATOR keyword for SQL Queries
     */
    public static final String MAIN_HELPDESK_ADMINISTRATOR = "SD";
    /**
     * Constant to store Report Analyst keyword for SQL Queries
     */
    public static final String REPORT_ANALYST = "ReportAnalyst";
    /**


     * Constant to store GROUP keyword for SQL Queries
     */
    public static final String GROUP = "Group";
    /**
     * Constant to store GROUP_MEMBER keyword for SQL Queries
     */
    public static final String GROUP_MEMBER = "Group Member";
    /**
     * Constant to store ALL GROUP MEMBERS keyword for SQL Queries
     */
    public static final String GROUP_MEMBERS = "All Group Members";
    /**
     * Constant for SQL UPPER function
     */
    public static final String UPPER = "UPPER";
    /**
     * Constant for Open bracket '('
     */
    public static final String OPEN_BRACKET = "(";
    /**
     * Constant for Close bracket ')'
     */
    public static final String CLOSE_BRACKET = ")";
    /**
     * Constant for Single Quote "'"
     */
    public static final String SINGLE_QUOTE = "'";
    /**
     * Constant for Double Quote '"'
     */
    public static final String DOUBLE_QUOTE = "\"";
    /**
     * Constant for Period
     */
    public static final String PERIOD = ".";
    /**
     * Constant for SELECT clause
     */
    public static final String SELECT = "SELECT";
    /**
     * Constant for FROM clause
     */
    public static final String FROM = "FROM";
    /**
     * Constant for WHERE clause
     */
    public static final String WHERE = "WHERE";
    /**
     * Constant for SINGLE_SPACE
     */
    public static final String SINGLE_SPACE = " ";
    /**
     * Constant for EQUALS_SIGN
     */
    public static final String EQUALS_SIGN = "=";
    /**
     * Constant for HYPHEN
     */
    public static final String HYPHEN = "-";
    /**
     * Constant for COLON
     */
    public static final String COLON = ":";
    /**
     * Constant for COMMA
     */
    public static final String COMMA = ",";
    /**
     * Constant for FORWARD_SLASH
     */
    public static final String FORWARD_SLASH = "/";
    /**
     * Constant for BACKWARD_SLASH
     */
    public static final String BACKWARD_SLASH = "\\";
    /**
     * Constant for ORDER BY clause
     */
    public static final String ORDER_BY = "ORDER BY";
    /**
     * Constant for COLD
     */
    public static final String COLD = "Cold";
    /**
     * Variable to store the arguments for modal dialog opened
     */
    public static final String MODAL_ARG3 = "dialogHeight:350px;dialogWidth:550px;scroll:no;resize:no;status:no;";
    /**
     * Back Actions
     */
    public static final String VIEW_REQUESTS = "viewRequests";
    public static final String REQUESTOR_MAIN = "requestorMain";
    public static final String TECHNICIAN_MAIN = "technicianMain";
    public static final String VIEW_PROBLEMS = "viewProblems";
    /**
     * Constants for YES and NO flags
     */
    public static final String YES = "Y";
    public static final String NO = "N";
    public static final String YES_STRING = "YES";
    public static final String NO_STRING = "NO";
    /**
     * Constants for EMail Type
     */
    public static final String INCIDENT_TYPE = "I";
    public static final String CHANGE_TYPE = "C";
    public static final String PROBLEM_TYPE = "P";
    public static final String ACK_TYPE = "A";
    /**
     * EMail Separator
     */
    public static final String EMAIL_SEPARATOR = "=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=";
    /**
     * Constants for Request Types
     */
    public static final String INCIDENT = "Incident";
    public static final String CHANGE = "RFC";
    public static final String PROBLEM = "Problem";
    public static final String IMACID = "IMACID";
    /**
     * Constant for ID
     */
    public static final String ID = "ID";
    /**
     * Constants for SLA Clock Actions
     */
    public static final String STOP = "STOP";
    public static final String START = "START";
    public static final String PAUSED = "Paused";
    public static final String NEW = "New";
    public static final String CLOSED = "Closed";
    /**
     * Constants for CIID Change type
     */
    public static final String SYSTEM = "System";
    public static final String MEMORY = "RAM";
    public static final String PROCESSOR = "Processor";
    public static final String OS = "OS";
    public static final String HTD = "HDD";
    public static final String DRIVE = "Drive";
    public static final String SOFTWARE = "Software";
    public static final String SERVICEPACK = "ServicePack";
    /*
     * Pagination
//     */ // Cloud Database Settings //

//    public static final String DB_NAME = "obuflimi_upsdkh";
//    public static final String DBUSER_NAME = "obuflimi_upsdkh";
//    public static final String DBPASSWORD = "Info@101";

   public static final String DB_NAME = "dqpos";
    public static final String DBUSER_NAME = "root";
    public static final String DBPASSWORD = "root";


    public static final String NEXT = "Next";
    public static final String[] GRAPH_SHADES = {"AFD8F8", "F6BD0F", "8BBA00", "FF8E46", "008E8E", "D64646", "8E468E", "588526", "B3AA00", "008ED6", "9D080D", "A186BE"};
}
