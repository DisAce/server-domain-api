
package com.coiol.platform.common.constant;

/**
 * 响应码
 * 
 * @author master@coiol.com
 * @version V 1.0.0.0
 * @since Server 1.0
 */
public interface ResultCode
{

	/**
	 * 成功标识
	 */
	String SUCCESS_CODE = "0";

	/**
	 * 成功
	 */
	int SUCCESS = 200;

	/**
	 * 系统其他错误
	 */
	int EXTRA_ERROR = -1;

	/**
	 * 暂不支持此业务
	 */
	int NOT_SUPPORT_NOW = -999;

	/**
	 * PASS_SERVICE_CODE
	 */
	int PASS_SERVICE_CODE = 520;

	/**
	 * 消息推送失败
	 */
	int PUSHMSG_FAILED = 2000;

	/**
	 * 系统错误 范围20000～20999
	 */
	/* ******系统错误***start************* */

	/**
	 * 其他错误
	 */
	int OTHER_SERVER_ERROR = 20000;

	/**
	 * 非法的servlet请求
	 */
	int ERROR_REQUEST_INTERFACE = 20001;

	/**
	 * 图书借阅--借阅过期
	 */
	int BORROW_BOOK_OVERDUE = 20002;

	/**
	 * 接口并发数超过限制
	 */
	int INTERFACE_LIMITED_ERROR = 20003;

	/**
	 * 数据逻辑异常
	 */
	int DATA_LOGIC_ERROR = 20030;

	/**
	 * cmp模型错误
	 */
	int CMP_MODEL_ERROR = 20100;

	/**
	 * 报文格式错误
	 */
	int MESSAGE_FORMAR_ERROR = 20103;

	/**
	 * 未查询到在线用户
	 */
	int NO_QUEREY_THE_ONLINE_USER = 20104;

	/**
	 * 分配查询凭证失败
	 */
	int QUERY_ARTIFACT_FAILED = 20105;

	/**
	 * 数据库错误
	 */
	int DATABASE_ERROR = 20106;

	/**
	 * 系统错误
	 */
	int SYSTEM_ERROR = 20107;

	/**
	 * 凭证已失效
	 */
	int ARTIFACT_EXPIRED = 20108;

	/**
	 * 密码不符合规则
	 */
	int PASSWORD_DOES_NOT_RULE = 20109;

	/**
	 * 外站ID不存在配置表中
	 */
	int CPID_NO_EXIST = 320000;

	/**
	 * 图书ID与外站id不匹配
	 */
	int BOOKID_MATCH_CPID = 320003;

	/**
	 * 外站密钥校验不通过
	 */
	int SERCRET_KEY_INVALID = 320002;

	/**
	 * 用户已注册移动通行证
	 */
	int PASSPORT_HAS_REGISTERED = 20110;

	/**
	 * 调用sso接口失败
	 */
	int CALL_SSO_INTERFACE_FAIL = 20111;

	/**
	 * 未查询到此凭证
	 */
	int DOES_NOT_QUERY = 20112;

	/**
	 * 通行证不存在
	 */
	int PASSPORTID_NOT_EXIST = 20113;

	/**
	 * 密码错误
	 */
	int PASSWORD_IS_ERROR = 20114;

	/**
	 * 鉴权场景系统不支持
	 */
	int AUTHSCENE_PROMOTION_INVALID = 20115;

	/**
	 * 请求消息发布实体的域名不能为空
	 */
	int ASDOMAIN_IS_NOT_MATCHING = 20118;

	/**
	 * 入参校验失败
	 */
	int PARAMTER_CHECK_FAIL = 20119;

	/**
	 * 账号被锁定
	 */
	int VGOP_ACCOUNT_LOCKED = 20120;

	/* ******系统错误***end************* */

	/* ******非CMWAP 用户登录************* */
	/**
	 * 用户登录状态为空
	 */
	int USERTOKEN_ISNULL = 22221;

	/**
	 * 用户登录状态标识usertoken为空
	 */
	int USERTOKEN_ID_ISNULL = 22222;

	/**
	 * 用户登录状态标识IP为空
	 */
	int USERTOKEN_IP_ISNULL = 22223;

	/**
	 * 无用户登录状态记录删除
	 */
	int DEL_USERTOKEN_FALURE = 22228;

	/**
	 * token有效时间失效
	 */
	int TOKEN_VALID_FALURE = 22229;

	/**
	 * 没有相关token数据
	 */
	int USERTOKEN_NODATA = 22224;

	/**
	 * 用户IP与存储IP不一致
	 */
	int USERTOKEN_IP_ISAVILID = 22225;

	/* ******非CMWAP 用户登录***end********** */

	/**
	 * portal支持 范围21000～21999
	 */
	/* ******portal支持***start************* */
	/**
	 * 标签数据表中，标签类型ID在标签类型表中不存在
	 */
	int PTL_DB_LABEL_TYPE_UNMATCHED = 21001;

	/**
	 * 标签数据表中，标签类型表中没有配置相应的标签实体类
	 */
	int PTL_DB_LABEL_TYPE_CLASS_MISSED = 21002;

	/**
	 * 标签数据表中，标签类型表中配置的标签实体类错误
	 * 
	 */
	int PTL_DB_LABEL_TYPE_CLASS_ERROR = 21003;

	/**
	 * 标签数据实体表出错
	 */
	int PTL_DB_LABEL_ERROR = 21004;

	/**
	 * 标签参数表出错
	 */
	int PTL_DB_LABEL_TYPE_PROPERTY_ERROR = 21005;

	/**
	 * 标签类型表出错
	 */
	int PTL_DB_LABEL_TYPE_ERROR = 21006;

	/**
	 * 节点查找页面的表错误
	 */
	int PTL_DB_NODE_MAP_PAGE = 21007;

	/**
	 * portal参数表错误
	 */
	int PTL_DB_PORTAL_PARAM = 21008;

	/**
	 * portal目录变更请求错误
	 */
	int PTL_SERVER_NODECHAGE = 21009;

	/**
	 * portal内容变更请求错误
	 */
	int PTL_SERVER_CONTENTCHAGE = 21010;

	/**
	 * portal参数变更请求错误
	 */
	int PTL_SERVER_PARAMETERCHAGE = 21011;

	/**
	 * portal标签变更请求错误
	 */
	int PTL_SERVER_LABELCHAGE = 21012;

	/**
	 * 标签LabelAccessDAO接口异常
	 */
	int LABEL_DAO_ERROR_UNKNOWN = 21013;

	/**
	 * 根节点没有关联首页
	 */
	int ROOTNODE_UNATTACHED_PAGE = 21014;

	/**
	 * 标签ID不存在
	 */
	int LABEL_ID_NOT_EXIST = 21015;

	/**
	 * portal参数名不存在（暂未使用）
	 */
	int PORTAL_PARAM_NAME_NOT_EXIST = 21016;

	/**
	 * 节点ID不存在（已有统一标识ID_HAVE_NO_CATALOG）
	 */

	/**
	 * 排行榜类型不存在
	 */
	int RANK_PARAM_TYPE_INVALID = 21017;

	/**
	 * 节点应为长整型
	 */
	int NODE_SHOULD_IS_LONG = 21018;

	/**
	 * 首页节点信息为空
	 */
	int FIRST_PAGE_NODE_INFO_IS_NULL = 21019;

	/**
	 * 首页节点信息列表为空
	 */
	int FIRST_PAGE_NODE_INFO_LIST_IS_NULL = 21020;

	/**
	 * 排行榜类型不匹配
	 */
	int RANK_PARAM_NOT_MATCH = 21021;

	/* ******portal支持***end************* */

	/* ****** terminal portal支持*** start ************* */
	/**
	 * 终端目录数据库访问错误
	 */
	int TER_PTL_CATALOG_DB_ERROR = 21100;

	/**
	 * 终端目录数据库访问代码错误
	 */
	int TER_PTL_CATALOG_DBACCESS_ERROR = 21101;

	/**
	 * 终端目录不存在
	 */
	int TER_PTL_CATALOG_NOT_EXIST = 21102;

	/**
	 * 区块数据库访问错误
	 */
	int TER_PTL_BLOCK_DB_ERROR = 21103;

	/**
	 * 区块数据库访问代码错误
	 */
	int TER_PTL_BLOCK_DBACCESS_ERROR = 21104;

	/**
	 * 区块不存在
	 */
	int TER_PTL_BLOCK_NOT_EXIST = 21105;

	/**
	 * 终端目录首页数据库访问错误
	 */
	int TER_PTL_CATALOG_PAGE_DB_ERROR = 21106;

	/**
	 * 终端目录首页数据库访问代码错误
	 */
	int TER_PTL_CATALOG_PAGE_DBACCESS_ERROR = 21107;

	/**
	 * 区块数据不合法
	 */
	int TER_PTL_BLOCK_DATA_INVALID = 21108;

	/**
	 * 区块类型ID不合法
	 */
	int TER_PTL_BLOCK_TYPEID_INVALID = 21109;

	/**
	 * 登录页数据不存在
	 */
	int TER_PTL_LOGIN_PAGE_DATA_NOT_EXIST = 21110;

	/* ****** terminal portal支持*** end ************* */

	/**
	 * 参数为空判断 范围22000～22999
	 */

	/**
	 * 传递赠送参数不匹配
	 */
	int PRESENT_PARM_IS_NOT_MATCHING = 21111;

	/* ******参数为空***start************* */
	/**
	 * 手机号码为空
	 */
	int MSISDN_IS_NULL = 22000;

	/**
	 * 业务接入方式为空
	 */
	int SUBSCRIBE_WAY_IS_NULL = 22001;

	/**
	 * 作家标识为空
	 */
	int AUTHORID_IS_NULL = 22002;

	/**
	 * 书项标识为空
	 */
	int BOOKID_IS_NULL = 22003;

	/**
	 * 章节标识为空
	 */
	int CHAPTERID_IS_NULL = 22004;

	/**
	 * 章内字数偏移信息为空
	 */
	int POSITION_IS_NULL = 22005;

	/**
	 * 书签类型为空
	 */
	int BOOKMARK_TYPE_IS_NULL = 22006;

	/**
	 * 书签标识为空
	 */
	int BOOKMARKID_IS_NULL = 22007;

	/**
	 * 专区标识为空
	 */
	int CATEGORYID_IS_NULL = 22008;

	/**
	 * 客户端版本为空
	 */
	int CLIENT_VERSION_IS_NULL = 22009;

	/**
	 * 终端类型为空
	 */
	int USER_AGENT_IS_NULL = 22010;

	/**
	 * 搜索内容为空
	 */
	int SEARCH_CONTENT_IS_NULL = 22011;

	/**
	 * 搜索内容类型不合法
	 */
	int SEARCH_CONTENT_ERROR = 22131;

	/**
	 * 书卷为空
	 */
	int VOLUME_OBJECT_IS_NULL = 22012;

	/**
	 * 章节为空
	 */
	int CHAPTER_IS_NULL = 22013;

	/**
	 * 产品标识为空
	 */
	int PRODUCTID_IS_NULL = 22014;

	/**
	 * 排行时间类型为空（总排行，日排行，月排行榜）
	 */
	int RANK_DATETYPE_IS_NULL = 22015;

	/**
	 * 节点标识和节点排行不能同时为空
	 */
	int NODERANK_AND_NODEID_ALL_NULL = 22016;

	/**
	 * 日月排行和排行时间不能同时为空
	 */
	int EMPTY_RANKDATE = 22017;

	/**
	 * 排行时间长度不合规范
	 */
	int RANKDATE_LENGTH_ILLEGAL = 22018;

	/**
	 * 接受人手机号码为空
	 */
	int ACCEPTOR_MOBILE_IS_NULL = 22019;

	/**
	 * 发送方手机号码为空
	 */
	int SEND_MOBILE_IS_NULL = 22020;

	/**
	 * wapIp为空
	 */
	int WAPIP_IS_NULL = 22021;

	/**
	 * 用户标识为空
	 */
	int USERID_IS_NULL = 22022;

	/**
	 * 预定购操作类型为空
	 */
	int PRE_SUBSCRIPTION_OPERATIONTYPE_IS_NULL = 22023;

	/**
	 * 用户手机号码与书签标识同时为空
	 */
	int MOBILE_AND_BOOKMARKID_ALL_NULL = 22024;

	/**
	 * 推荐类型为空
	 */
	int RECOMMENDTYPE_IS_NULL = 22025;

	/**
	 * 用户设置信息为空
	 */
	int MODIFY_USERINFO_IS_NULL = 22026;

	/**
	 * 缺少用户注册基本信息
	 */
	int REGISTER_USERINFO_IS_NULL = 22027;

	/**
	 * 用户角色为空
	 */
	int ROLE_IS_NULL = 22028;

	/**
	 * 标签ID为空
	 */
	int LABELID_IS_NULL = 22029;

	/**
	 * nodeID为空
	 */
	int NODEID_IS_NULL = 22030;

	/**
	 * 会员费用为空或参数非法
	 */
	int FEE_IS_NULL = 22031;

	/**
	 * 好友手机号码不能为空
	 */
	int FRIEND_MOBILE_IS_NULL = 22032;

	/**
	 * 消息hash为空
	 */
	int CLIENT_HASH_IS_NULL = 22033;

	/**
	 * 用户呢称为空
	 */
	int NICKNAME_IS_NULL = 22034;

	/**
	 * 评论内容为空
	 */
	int COMENT_CONTENT = 22035;

	/**
	 * 页面类型为空
	 */
	int PAGE_TYPE_IS_NULL = 22036;

	/**
	 * 页面类型不为数字类型
	 */
	int PAGE_TYPE_IS_NOT_NUM = 22037;

	/**
	 * 内容类型为空
	 */
	int CONTENT_TYPE_IS_NULL = 22038;

	/**
	 * 是否为书籍不能为空
	 */
	int CHAPTER_ISBOOK_IS_NULL = 22039;

	/**
	 * 批量内容鉴权或者批量按次订购时，传入参数章节ID数组不能为空
	 */
	int CHAPTER_ID_LIST_IS_NULL = 22040;

	/**
	 * 搜索出现异常
	 */
	int SEARCH_ERROR = 22041;

	/**
	 * 城市ID为空
	 */
	int CITYID_IS_NULL = 22042;

	/**
	 * 参数为空
	 */
	int PARAMETER_IS_NULL = 22500;

	/**
	 * 终端类型为空
	 */
	int TERM_TYPE_IS_NULL = 22501;

	/**
	 * 终端厂商为空
	 */
	int TERM_VENDOR_IS_NULL = 22502;

	/**
	 * 终端版本为空
	 */
	int TERM_VERSION_IS_NULL = 22503;

	/**
	 * 终端软件版本为空
	 */
	int TERM_SOFT_VERSION_TYPE_IS_NULL = 22504;

	/**
	 * 终端型号为空
	 */
	int TERM_MODEL_IS_NULL = 22505;

	/**
	 * 区块Id为空
	 */
	int BLOCKID_IS_NULL = 22506;

	/**
	 * 目录Id为空
	 */
	int CATALOGID_IS_NULL = 22507;

	/**
	 * 系统信息key为空
	 */
	int SYSTEM_KEY_IS_NULL = 22508;

	/**
	 * 适配页面错误
	 */
	int TER_PTL_GET_LOCAL_PAGE_ERROR = 22509;

	/**
	 * 查询省市对应的页面错误
	 */
	int TER_PTL_GET_AREA_PAGE_DB_ERROR = 22510;

	/**
	 * 页面名称为空
	 */
	int WAP_PAGE_NAME_IS_NULL = 22511;

	/**
	 * 请求参数为为空
	 */
	int SHORTURL_IS_NULL = 22512;

	/**
	 * 页面来源代码为为空
	 */
	int PAGE_FRCODE_IS_NULL = 22513;

	/**
	 * 页面样式ID为空
	 */
	int WAP_PAGE_CLASSID_IS_NULL = 22516;

	/**
	 * 搜索对象类型为空
	 */
	int OBJECTTYPE_IS_NULL = 22517;

	/**
	 * 根据门户类型或版本号查不到内容类型
	 */
	int NO_CONTENTTYPE_BYBOOKANDVERSION = 22518;

	/**
	 * 版本号为空
	 */
	int VERSION_IS_NULL = 22519;

	/**
	 * 促销包不支持通过该门户订购
	 */
	int PURCHASE_PROMOTION_INVALID_PORTALTYPE = 22520;

	/**
	 * 版本号没有对应的版本组
	 */
	int GET_VERSION_TEAM_IS_NULL = 22521;

	/**
	 * 样式标识不能为空
	 */
	int WAP_STYLE_FLAG_ISNULL = 22522;

	/**
	 * 样式标识不能为空
	 */
	int SP_ID_ISNULL = 22523;

	/**
	 * 样式标识不能为空
	 */
	int SP_PRODUCT_ID_ISNULL = 22524;

	/**
	 * 验证码功能编号为空
	 */
	int VERIFYCODE_FUNCID_IS_ERROR = 22600;

	/**
	 * accept字符串为空
	 */
	int ACCEPT_IS_NULL = 22605;

	/**
	 * email为空
	 */
	int EMAIL_IS_NULL = 22606;

	/**
	 * id参数为空
	 */
	int USER_EMAIL_ID_IS_NULL = 22607;

	/**
	 * 邮箱激活token或重置密码token为空
	 */
	int EMAIL_TOKEN_IS_NULL = 22608;

	/**
	 * ip参数为空
	 */
	int IP_ADDRESS_IS_NULL = 22609;

	/**
	 * 区域ID为空或区域ID不存在
	 */
	int AREAID_IS_NULL = 22610;

	/**
	 * 品牌ID不能为空
	 */
	int BRANDID_NOT_NULL = 22630;

	/**
	 * 视频url摘要不能为空
	 */
	int SUMMARY_URL_NOT_NULL = 22631;

	/**
	 * 渠道ID为空
	 */
	int CHANNEL_ID_ISNULL = 22632;

	/**
	 * 处罚结束时间为空
	 */
	int PUNISH_END_DATE_ISNULL = 22633;

	/**
	 * 打赏月份为空
	 */
	int REWARD_MONTH_ISNULL = 22634;

	/**
	 * 移动通行证id为空
	 */
	int IDMPASSPORTID_ISNULL = 22638;

	/**
	 * 用户填写的用户名(手机号或邮箱)为空
	 */
	int USERACCOUNT_ISNULL = 22639;

	/**
	 * 地域编码为空
	 */
	int COUNTRYCODE_ISNULL = 22640;

	/**
	 * 地域编码类型不合法
	 */
	int CODETYPE_IS_ILLEGAL = 22641;

	/**
	 * 映射编码为空
	 **/
	int MAPPEDCODE_ISNULL = 22642;

	/**
	 * 用户类型为空
	 */
	int USERACCOUNTTYPE_ISNULL = 22643;

	/* ******参数为空***end************* */

	/**
	 * 参数类型不正确（如转型失败）范围23000～23999
	 */
	/* ******参数类型合法性***start************* */

	/**
	 * 分页编号应为整数
	 */
	int PAGE_NUM_SHOULD_INTEGER = 23000;

	/**
	 * 分页长度应为整数
	 */
	int PAGE_LEN_SHOULD_INTEGER = 23001;

	/**
	 * 书项标识不是长整型
	 */
	int BOOKID_IS_NOT_LONG_TYPE = 23002;

	/**
	 * 专区标识不是长整型
	 */
	int CATEGORYID_IS_NOT_LONG_TYPE = 23003;

	/**
	 * 搜索类型应为整型
	 */
	int SEARCH_TYPE_SHOULD_INTEGER = 23004;

	/**
	 * 排序方式应为整数
	 */
	int SORT_TYPE_SHOULD_INTEGER = 23005;

	/**
	 * 卷标识不是长整型
	 */
	int VOLUMEID_IS_NOT_LONG_TYPE = 23006;

	/**
	 * 门户类型应为整型
	 */
	int PORTALTYPE_SHOULD_INTEGER = 23007;

	/**
	 * 年龄应为整数
	 */
	int AGETYPE_SHOULD_INTEGER = 23008;

	/**
	 * 分页字数应为整数
	 */
	int COUNT_SHOULD_INTEGER = 23009;

	/**
	 * 预定购操作类型不合要求
	 */
	int PRE_SUBSCRIPTION_OPERATIONTYPE_ILLEGAL = 23010;

	/**
	 * 投票项值不合要求
	 */
	int OPTION_VALUE_ILLEGAL = 23011;

	/**
	 * 书签类型不合法
	 */
	int BOOKMARK_TYPE_IS_ILLEGAL = 23012;

	/**
	 * 用户角色不合要求
	 */
	int ROLE_ILLEGAL = 23013;

	/**
	 * 用户状态应为整型
	 */
	int STATE_SHOULD_INTEGER = 23014;

	/**
	 * 标签ID应为整型
	 */
	int LABELID_NOT_INTEGER = 23015;

	/**
	 * 客户端不合法
	 */
	int CLIENT_ILLEGAL = 23016;

	/**
	 * 关联类型应为整型
	 */
	int ASSOCIATE_TYPE_SHOULD_INTEGER = 23017;

	/**
	 * 书项标识应为整型
	 */
	int BOOKID_NOT_INTEGER = 23018;

	/**
	 * 章节标识应为整型
	 */
	int CHAPTERID_NOT_INTEGER = 23019;

	/**
	 * 书籍类型不合法
	 */
	int BOOK_TYPE_IS_ILLEGAL = 23020;

	/**
	 * 预定更新字段 应该为整型
	 */
	int SCHEDULEUPDATE_SHOULD_BE_INTEGER = 23024;

	/**
	 * 订购提醒 应该为整型
	 */
	int SUBSCRIBEREMIND_SHOULD_BE_INTEGER = 23024;

	/**
	 * www 样式标识 应该为整型
	 */
	int SHOULD_BE_INTEGER = 23020;

	/**
	 * 没有添加书签信息
	 */
	int NO_ADD_BOOKMARK_INFO = 23021;

	// add by ykf13180 2009-08-06
	/**
	 * 终端图书目录首页Id 应该为整型
	 */
	int TERMINAL_SHOULD_BE_INTEGER = 23022;

	/**
	 * 章节不是为长整型
	 */
	int CHAPTER_ID_IS_NOT_LONG = 23023;

	/**
	 * 参数为非数字
	 */
	int PARAMETER_ISNOT_NUMBER = 23500;

	/**
	 * 书讯标识不合法
	 */
	int BOOKNEWSID_NO_CONTENT = 23501;

	/**
	 * 热词类型无效
	 */
	int HOTWORDTYPE_IS_INVAL = 23502;

	/**
	 * 热词专区热词不存在
	 */
	int HOTWORDTYPE_IS_NOTEXIES = 23506;

	/**
	 * 手机号长度错误，非11位
	 */
	int MSISDN_LENGTH_ERROR = 23503;

	/**
	 * 图书分类ID不合法
	 */
	int BOOK_CLASS_IS_ERROR = 23504;

	/**
	 * 搜索结果分类数量应为整型
	 */
	int RESULTSIZE_SHOULD_INTEGER = 23505;

	/**
	 * 日期类型必须为YYYYMMDDHHMMSS格式
	 */
	int DATE_FORMAT_NOT_YYYYMMDDHHMMSS = 23025;

	/**
	 * 用户等级信息不存在
	 */
	int SCORE_LEVEL_NOT_EXIST = 23026;

	/**
	 * SSO 鉴权类型不正确
	 */
	int SSO_AUTHORITY_NOT_VALID = 23027;

	/**
	 * 分册ID与章节ID不能同时存在（下载鉴权时支持分册、章节，但只处理一种场景）
	 */
	int FASCICULEID_AND_CHAPTERID_MUTEX = 23028;

	/**
	 * 日期类型必须为YYYYMMDD格式
	 */
	int DATE_FORMAT_NOT_YYYYMMDD = 23029;

	/**
	 * 变更类型不合法
	 */
	int CHANGE_TYPE_IS_INVAL = 23030;

	/**
	 * 下载听书码率或在线听书码率参数不合法
	 */
	int DOWNLOADCODERATE_OR_ONLINECODERATE_IS_INVAL = 23033;

	/**
	 * 操作系统为空
	 */
	int OPERTAING_SYSTEM_IS_NULL = 23034;

	/**
	 * 是否集成HLS标志非法
	 */
	int IS_INTEGRATE_HLS_INVALID = 23035;

	/**
	 * 网络环境非法
	 */
	int BEAR_TYPE_IS_INVALID = 23036;

	/**
	 * 默认视频码流列表为空
	 */
	int DEFAULT_MEDIA_URL_LIST_IS_NULL = 23037;

	/**
	 * 视频编码方式非法
	 */
	int MEDIA_CODE_IS_INVALID = 23038;

	/**
	 * 默认低质量视频url地址为空
	 */
	int MEDIA_CODE_LOW_IS_NULLL = 23039;

	/**
	 * 默认中质量视频url地址为空
	 */
	int MEDIA_CODE_MIDDLE_IS_NULLL = 23040;

	/**
	 * 默认高质量视频url地址为空
	 */
	int MEDIA_CODE_HIGH_IS_NULLL = 23041;

	/**
	 * 视频地址url为空
	 */
	int MEDIA_URL_IS_NULL = 23042;

	/**
	 * 发布类型错误
	 */
	int IS_NOT_PUBLISHTYPE = 23043;

	/**
	 * 留言状态错误
	 */
	int IS_NOT_STATUS = 23044;

	/**
	 * 日期类型必须为YYYYMM格式
	 */
	int DATE_FORMAT_NOT_YYYYMM = 251101;

	/* ******参数类型合法性***end************ */

	/**
	 * 模块中业务逻辑错误（按模块划分，模块编号从240**～299**） 范围为24000～29999
	 */

	/* ******会员相关***start************* */

	/**
	 * 已是会员
	 */
	int IS_ASSOCIATOR = 24000;

	/**
	 * 不是会员
	 */
	int IS_NOT_ASSOCIATOR = 24001;

	/**
	 * 会员状态非生效
	 */
	int NO_EFFECTIVE_ASSOCIATOR_STATES = 24002;

	/**
	 * 会员定价信息不存在
	 */
	int ASSOCIATORFEE_IS_NULL = 24003;

	/* ******会员相关***end************ */

	/* ******作家相关***start************* */
	/**
	 * 作家不存在
	 */
	int AUTHOR_RECORD_NOT_FOUND = 24100;

	/**
	 * 作品信息为空
	 */
	int BOOKS_RECORDS_IS_NULL = 24101;

	/* ******作家相关***end************* */

	/* ******书签相关***start************* */
	/**
	 * 同一位置书签已有
	 */
	int BOOKMARK_HAVE_EXIST_IN_SAME_POSITION = 24200;

	/**
	 * 添加书签失败
	 */
	int ADD_BOOKMARK_FAIL = 24201;

	/**
	 * 更新一本中的书签失败
	 */
	int UPDATA_BOOK_BOOKMARK_FAIL = 24202;

	/**
	 * 删除书签失败
	 */
	int DEL_BOOKMARK_FAIL = 24203;

	/**
	 * 书签记录不存在
	 */
	int BOOKMARK_RECORD_NOT_FOUND = 24204;

	/**
	 * 用户书签中书的数量达到最大值
	 */
	int BOOKMARK_BOOK_COUNT_IS_MAX = 24205;

	/**
	 * 书是不存在的
	 */
	int BOOK_NOT_EXIST = 24206;

	/* ******书签相关***end************* */

	// modify by kf56385 at 2011-10-9 for cmr09-req-748 begin
	/* ******读书笔记相关***start************* */

	/**
	 * 读书笔记条数达到上限
	 */
	int USERNOTE_COUNT_IS_MAX = 24207;

	/**
	 * 笔记内容超过超过最大长度
	 */
	int NOTECONTENT_LENGTH_IS_MAX = 24208;

	/**
	 * 修改的笔记不存在
	 */
	int UPDATE_USERNOTE_NOT_EXIST = 24209;

	/**
	 * 笔记内容为空
	 */
	int NOTECONTENT_IS_NULL = 24211;

	/**
	 * 笔记id为空
	 */
	int NOTEID_IS_NULL = 24212;

	/**
	 * 删除笔记时删除类型为空
	 */
	int DELETE_USERNOTE_TYPE_IS_NULL = 24213;

	/**
	 * 内容id为空
	 */
	int CONTENTID_IS_NULL = 24215;

	/**
	 * 内容id非整形
	 */
	int CONTENTID_IS_NOT_LONG = 24216;

	/**
	 * 引文开始位置不为整数
	 */
	int STARTPOSITION_IS_NOT_INT = 24217;

	/**
	 * 引文结束位置不为整数
	 */
	int ENDPOSITION_IS_NOT_INT = 24221;

	/**
	 * 客户端版本类型不合法
	 */
	int CLIENTVERTYPE_IS_INVAL = 24222;

	/**
	 * 笔记id为非整形
	 */
	int NOTEID_IS_NOT_LONG = 24218;

	/**
	 * 添加笔记失败
	 */
	int ADD_USERNOTE_FAILURE = 24219;

	/* ******读书笔记相关***end************* */
	// modify by kf56385 at 2011-10-9 for cmr09-req-748 end

	// modify by kf56385 at 2011-12-3 for REQ-895 begin
	/* ******主播图书信息相关***start************* */
	/**
	 * 主播id为空
	 */
	int READERID_IS_NULL = 24220;

	/**
	 * 已经对该主播关注
	 */
	int READER_IS_ATTENTION = 24227;

	/**
	 * 已经取消主播关注
	 */
	int READERID_IS_NOT_ATTENTION = 24228;

	/**
	 * 该用户不存在此类型的关注信息
	 */
	int NOT_EXIST_LISTENBOOK = 24229;

	/**
	 * 超出用户定制最大值
	 */
	int USER_CUSTOMIZED_REACH_MAXCOUNT = 24230;

	/* ******主播图书信息相关***end************* */
	// modify by kf56385 at 2011-12-3 for REQ-895 end

	/* ******关联查询相关***start************* */

	/**
	 * 没有与该书关联的内容
	 */
	int BOOK_HAVE_NO_ASSOCIATE_CONTENT = 24300;

	/**
	 * 没有同类型的书
	 */
	int NO_SAME_TYE_BOOK = 24301;

	/* ******关联查询相关***end************* */

	/* ******客户端升级相关***start************* */
	/**
	 * 客户端不需更新
	 */
	int CLIENT_NOT_UPDATE = 24400;

	/**
	 * 更新客户端下载渠道推广信息失败
	 */
	int UPDATE_CLIENT_CHANNEL_POPULARIZE_FAILURE = 24401;

	/* ******客户端升级相关***end************* */

	/* ******内容鉴权相关***start************* */

	/**
	 * 报纸品牌包月鉴权失败
	 */
	int NEWSPAPER_AUTHENTICATE_FAIL = 24499;

	/**
	 * 内容鉴权失败
	 */
	int CONTENT_AUTHENTICATE_FAIL = 24500;

	/**
	 * 批量分册鉴权异常
	 */
	int BATCH_FASCICULE_AUTH_FAIL = 205101;

	/**
	 * 该书籍未在任何专区下上架/下架且不满足包月移除规则
	 */
	int NODE_AND_CONTENT_IS_NULL = 24550;

	/* ******内容鉴权相关***end************* */

	/**
	 * 漫画用户看图方式适配失败
	 */
	int CARTOON_ADAPT_FAIL = 24501;

	/* ******内容信息查询服务***start************* */

	/**
	 * 此作家没有相关书项
	 */
	int AUTHOR_HAVE_NO_BOOK = 24600;

	/**
	 * 目录没有子目录
	 */
	int CATALOG_HAVE_NO_SUBCATALOG = 24601;

	/**
	 * 目录下没有内容
	 */
	int CATALOG_HAVE_NO_CONTENT = 24602;

	/**
	 * 此标识的目录不存在
	 */
	int ID_HAVE_NO_CATALOG = 24603;

	/**
	 * 此标识的书项不存在
	 */
	int ID_HAVE_NO_BOOK = 24604;

	/**
	 * 书项没有卷信息
	 */
	int BOOK_HAVE_NO_VOLUMN_INFO = 24605;

	/**
	 * 书项没有章节信息
	 */
	int BOOK_HAVE_NO_CHAPTER_INFO = 24606;

	/**
	 * 此标识的章节信息不存在
	 */
	int ID_HAVE_NO_CHAPTER_INFO = 24607;

	/**
	 * 查询的内容不存在
	 */
	int SEARCH_HAVE_NO_CONTENT = 24608;

	/**
	 * 最新章节获取异常
	 */
	int NEWCHAPTER_OBTAIN_EXCEPTION = 24609;

	/**
	 * 该书项已经不存在（被封存）
	 */
	int BOOK_UNAVAILABLE = 24610;

	/**
	 * 没有连载最新书
	 */
	int NOT_LAST_BOOK = 24611;

	/**
	 * 没有大章节拆分
	 */
	int CHAPTER_FILE_IS_NULL = 24612;

	/**
	 * 日期解析错误
	 */
	int DATE_PARSE_ERROR = 24613;

	/**
	 * 状态不存在
	 */
	int GET_BOOK_LIST_STATUS_IS_NULL = 24614;

	/**
	 * 是否完本的状态不存在
	 */
	int GET_BOOK_LIST_IS_FINISHED_IS_NULL = 24615;

	/**
	 * 用户订购的章节+免费的章节+小于1000个字的章节,不存在
	 */
	int USER_HAVE_NO_ENABLE_CHAPTER_INFO = 24616;

	/* ******内容信息查询服务***end************* */

	/* ******收藏相关***start************* */
	/**
	 * 收藏已达到最大值
	 */
	int FAVORITE_MAX = 24700;

	/**
	 * 书的收藏已经存在
	 */
	int FAVORITE_HAVE_EXIST = 24701;

	/**
	 * 收藏信息列表无记录
	 */
	int FAVORITELIST_HAVE_NO_RECORD = 24702;

	/**
	 * 用户未收藏这本书
	 */
	int USER_UNFAVORITE_THIS_BOOK = 24703;

	/**
	 * 用户未收藏任何书
	 */
	int USER_UNFAVORITE_ANY_BOOK = 24704;

	/* ******收藏相关***end************* */

	/* ******产品相关***start************* */
	/**
	 * 没有产品信息
	 */
	int NO_PRODUCTINFO = 24800;

	/**
	 * 产品信息列表为空
	 */
	int PRODUCTLIST_IS_NULL = 24801;

	/**
	 * 产品标识与内容标识和内容类型两者不能同时为空
	 */
	int PRODUCTID_OR_CONID_AND_CONTYPE_IS_SAME_NULL = 24802;

	/**
	 * 获取促销产品列表时，读入的cityID和通过手机号码取得的城市ID不一致，需要确认
	 */
	int CITYID_DIFFERENT_FROM_MSISDN = 24083;

	/**
	 * 订购促销包时，无法获取该促销包的产品信息
	 */
	int NO_PROMOTE_PRODUCTINFO = 24084;

	/**
	 * 订购促销包时，促销活动已过期
	 */
	int PROMOTIONACTIVITY_INVALID = 24085;

	/**
	 * 订购促销包时，产品类型不为促销包
	 */
	int PRODUCTTYPE_IS_NOT_PROMOTION = 24086;

	/**
	 * 促销包鉴权失败
	 */
	int PROMOTION_CHECK_FAILURE = 24087;

	/* ******产品相关***end************* */

	/* ******按次订购***start************* */
	/**
	 * 已按次订购
	 */
	int HAVE_PURCHASE = 24900;

	/**
	 * 免费的图书/章节不允许订购
	 */
	int FREE_BOOK_CHAPTER_CAN_NOT_PURCHASE = 24903;

	/**
	 * 章节和图书不对应
	 */
	int CHAPTER_NOT_BELONG_BOOK = 24904;

	/**
	 * 订购内容类型和产品订购类型不一致
	 */
	int PRODUCT_MODE_AND_CHARGEMODE_NOT_EQUAL = 24905;

	/**
	 * 订购内容类型非法
	 */
	int CHARGEMODE_INVALID = 24906;

	/**
	 * 支付类型非法
	 */
	int PAYMODE_INVALID = 24907;

	/**
	 * 按次订购失败
	 */
	int PURCHASE_FAILED = 24908;

	/**
	 * 代订购失败
	 */
	int AGENT_PURCHASE_FAILED = 24909;

	/**
	 * 微阅读id为空
	 */
	int VID_IS_NULL = 24910;

	/* ******按次订购***end************* */

	/* ******排行***start************* */

	/**
	 * 排行列表为空
	 */
	int RANKLIST_IS_NULL = 25000;

	/**
	 * 非法参数
	 */
	int ILLEGAL_MESSAGE_PARAMETERS = 5000;

	/**
	 * 超时
	 */
	int OVER_TIME = 5002;

	/**
	 * 密钥校验失败
	 */
	int INVALID_SECRET_KEY = 5001;

	/**
	 * CP不在同步列表中
	 */
	int CP_NOT_EXIST_LIST = 5004;

	/**
	 * 排行类型为空
	 */
	int RANKTYPE_IS_NULL = 25001;

	/**
	 * 无效排行时间类型（需要查那个排行的：日，月，总）
	 */
	int INVAL_RANKDATETYPE = 25002;

	/**
	 * 无效排行类型(排行依据值)
	 */
	int INVAL_RANKDATE = 25003;

	/**
	 * 赠送事务记录列表为空
	 */
	int GET_TRANSLIST_IS_NULL = 340079;

	/* ******排行***end************* */

	/* ******内容推荐***start************* */
	/**
	 * 推荐类型不合法
	 */
	int RECOMMEND_TYPE_ILLEGAL = 25100;

	/**
	 * 内容推荐记录不存在
	 */
	int RECOMMEND_RECORD_UNFUND = 25101;

	/**
	 * 用户当日推荐好友次数已超过最大推荐次数
	 */
	int OUT_OF_MAX_RECOMMENDED_TIMES = 25102;

	/**
	 * 同类型书排行类型应为整形
	 */
	int SAME_TYPE_BOOK_RANDATETYPE_IS_INT = 25103;

	/**
	 * 同类型书排行依据类型应为整形
	 */
	int SAME_TYPE_BOOK_RANKTYPE_IS_INT = 25104;

	/**
	 * 同类型书排行类型不合法
	 */
	int SAME_TYPE_BOOK_RANDATETYPE_IS_ILLEGAL = 25105;

	/**
	 * 用户推荐发送信息失败
	 */
	int USER_RECOMMEND_SEND_MSG_IS_FAIL = 25106;

	/**
	 * 用户推荐本站给同一个用户，达到最大次数
	 */
	int USER_REC_STAGE_MSG_ONE_DATE_TO_ONE = 25107;

	/**
	 * 用户推荐本站达到一天的最大次数
	 */
	int USER_REC_STAGE_MSG_ONE_DATE_TO_MAX_COUNT = 25108;

	/**
	 * 用户发送消息失败
	 */
	int USER_SEND_MSG_IS_FAIL = 25109;

	/**
	 * 用户推荐同一本书给同一好友达到一天的最大次数
	 */
	int USER_REC_SAMEBOOK_ONE_DATE_TO_ONE = 25110;

	/**
	 * 用户推荐专区给同一好友达到一天的最大次数
	 */
	int USER_REC_CATALOG_TO_SAMEUSER_MSG_ONE_DATE_TO_ONE = 25111;

	/**
	 * 用户推荐某专区给同一个好友达到一天的最大次数
	 */
	int USER_REC_SAME_CATALOG_TO_SAMEUSER_MSG_ONE_DATE_TO_ONE = 25112;

	/**
	 * 用户推荐专区达到一天的最大值
	 */
	int USER_REC_CATALOG_MSG_ONE_DATE_TO_ONE = 25113;

	/**
	 * 用户推荐某专区达到一天的最大值
	 */
	int USER_REC_SAME_CATALOG_MSG_ONE_DATE_TO_ONE = 25114;

	/**
	 * 提示用户下载同一客户端的达到一天的最大值
	 */
	int USER_REC_SAME_CLIENT_DOWNLOAD_MSG_ONE_DATE_TO_ONE = 25115;

	/**
	 * 提示用户下载同一客户端的达到一天的最大值
	 */
	int USER_REC_CLIENT_DOWNLOAD_MSG_ONE_DATE_TO_MAX_COUNT = 25116;

	/* ******内容推荐***end************* */

	/* ******用户鉴权***start************* */
	/**
	 * 用户未注册
	 */
	int USER_UNREGISTERED = 25200;

	/**
	 * 无该wapIp
	 */
	int WAPIP_NOT_EXIST = 25201;

	/**
	 * 用户已注销
	 */
	int USER_WROTEOFF = 25202;

	/**
	 * DRM用户鉴权用户唯一标识非法或用户手机号码与用户唯一标识不匹配
	 */
	int USER_INFONOTMATCH = 401;

	/* ******用户鉴权***end************* */

	/* ******用户信息***start************* */

	/**
	 * 按本订购-没有数据
	 */
	int NO_TRAIN_DATA = 350000;

	/**
	 * WAP首页切换没有数据
	 */
	int NO_HOMEPAGE_DATA = 350001;

	/**
	 * 没有BI推荐分类信息
	 */
	int NO_RECOMMENDCLASS_DATA = 350002;

	/**
	 * 没有BI推荐图书信息
	 */
	int NO_RECOMMEDNDBOOK_DATA = 350003;

	/**
	 * 请求BI推荐类型非法
	 */
	int REC_TYPE_IS_INVALID = 350004;

	/**
	 * 类型为6或者为7时，推荐分类字段为空
	 */
	int REC_TYPE_IS_NULL_RECOMMEND_TYPE = 263304;

	/**
	 * 当类型为6或者为7时，推荐分类非法
	 */
	int REC_TYPE_IS_RECOMMEND_TYPE = 263305;

	/**
	 * 类型为7时，图书id字段为空
	 */
	int REC_TYPE_IS_BOOKID_NULL = 263306;

	/**
	 * 类型为7时，图书id字段非法
	 */
	int REC_TYPE_IS_BOOKID_ERROR = 263307;

	/**
	 * 无用户个人信息
	 */
	int NO_USERINFO = 25300;

	/**
	 * 修改密码失败
	 */
	int UPDATE_PASSWORD_FAIL = 25301;

	/**
	 * 用户不存在
	 */
	int USER_UN_EXIST = 25302;

	/**
	 * 测试用户没有
	 */
	int TEST_USER_IS_NOT = 25303;

	/**
	 * 重置密码失败
	 */
	int RESET_PASSWORD_FAIL = 25304;

	/**
	 * 用户名或密码不存在
	 */
	int USERNAME_OR_PASSWORD_EXIST = 25305;

	/**
	 * 用户扩展信息添加失败
	 */
	int USER_EXTEND_INFO_ADD_IS_FAIL = 25306;

	/**
	 * 黑名单用户投票
	 */
	int USER_BLACK_MOBILE_FOR_VOTE = 25307;

	/**
	 * 黑名单用户收藏
	 */
	int USER_BLACK_MOBILE_FOR_FAVORITE = 25308;

	/**
	 * 邮箱已被绑定且状态正常，不用绑定
	 */
	int EMAIL_IS_ALREADY_BIND = 25340;

	/**
	 * 发送邮件失败
	 */
	int SEND_EMAIL_FAILED = 25341;

	/**
	 * 邮箱状态不是待激活，不能激活
	 */
	int EMAIL_STATUS_IS_NOT_UNACTIVE = 25342;

	/**
	 * 激活邮箱时间已过期，不能激活
	 */
	int ACTIVE_EMAIL_TIME_IS_OVER = 25343;

	/**
	 * 激活邮箱token或重置密码token非法
	 */
	int EMAIL_TOKEN_IS_INVALID = 25344;

	/**
	 * 邮箱状态未激活
	 */
	int EMAIL_STATUS_IS_NOT_ACTIVE = 25345;

	/**
	 * 用户没有绑定邮箱
	 */
	int USER_HAS_NOT_BIND_EMAIL = 25346;

	/**
	 * 通过邮件重置密码时间已过期，不能重置密码
	 */
	int RESET_PWD_TIME_IS_OVER = 25347;

	/**
	 * 重置密码token已被使用
	 */
	int RESET_PWD_TOKEN_IS_USED = 25348;

	/**
	 * ip地址非法
	 */
	int IP_ADDRESS_IS_ILLEGAL = 25349;

	/* ******用户信息***end************* */

	/* ******互动平台***start************* */
	/**
	 * 手机和昵称只能有一个有效
	 */
	int MSISDN_NICK_ONLY_ONE_VALID = 25309;

	/**
	 * 没有作者信息
	 */
	int NO_AUTHOR_INFO = 25310;

	/**
	 * 没有分类信息
	 */
	int NO_CALSSIFY_INFO = 25311;

	/**
	 * 没有职业列表信息
	 */
	int NO_JOB_INFO = 25312;

	/**
	 * 没有省份信息
	 */
	int NO_PROVINCE_INFO = 25313;

	/**
	 * 没有城市信息
	 */
	int NO_CITY_INFO = 25314;

	/**
	 * 没有城市信息
	 */
	int DENOMINATION_EMPTY = 25316;

	/**
	 * 面额应该是数字
	 */
	int DENOMINATION_SHOULD_NUMBER = 25317;

	/**
	 * 积分应该是数字
	 */
	int COST_INTEGRAL_SHOUDE_NUMBER = 500333;

	/**
	 * 剩余积分应该是数字
	 */
	int REMAIN_INTEGRAL_SHOUDE_NUMBER = 500334;

	/**
	 * 没有书券信息
	 */
	int NO_BOOK_COUPONS_INFO = 25318;

	/**
	 * 内容类型为空
	 */
	int CONTENT_TYPE_EMPTY = 25319;

	/**
	 * 内容类型应该是整型
	 */
	int CONTENT_TYPE_SHOULD_INT = 25320;

	/**
	 * 状态类型为空
	 */
	int STATUS_TYPE_EMPTY = 25321;

	/**
	 * 状态类型应该是整型
	 */
	int STATUS_TYPE_SHOULD_INT = 25322;

	/**
	 * 列表为空
	 */
	int LIST_EMPTY = 25323;

	/**
	 * 不支持的类型
	 */
	int UNSUPORT_TYPE = 25324;

	/**
	 * 不支持手机号和昵称同时查询用户信息
	 */
	int MOBILE_NICKNAME_CONFLICT = 25328;

	/**
	 * 查询条数不能为空或 非int
	 */
	int USERINFO_SNS_COUNT_IS_INVALID = 25327;

	/**
	 * 不支持的状态
	 */
	int UNSUPORT_STATE = 25325;

	/**
	 * 言论id为空
	 */
	int SAYINGS_ID_EMPTY = 25326;

	/**
	 * 记录id应该是整型
	 */
	int RECORD_ID_SHOULD_INT = 25329;

	/**
	 * 一次最多允许查询10个记录id的信息(防止超过sql语句中in的限制)
	 */
	int RECORDID_MAX_CNT = 25330;

	/**
	 * 积分兑换书券失败
	 */
	int SCORES_CHANGE_COUPONS_FAILED = 25331;

	/**
	 * 删除言论失败
	 */
	int DEL_SAYINGS_FAILED = 25332;

	/**
	 * 超出一次允许兑换书券面额的最大值，
	 */
	int CHANGE_COUPONS_DENOMINATION_LIMIT = 25333;

	/**
	 * 言论已被删除
	 */
	int SAYING_HAS_DELETE = 25334;

	/**
	 * 偶像id的数目超出限制
	 */
	int IDOL_ID_TOO_MUCH = 25335;

	/**
	 * 阅读爱好id的数目超出限制
	 */
	int INTERESTREAD_ID_TOO_MUCH = 25336;

	/**
	 * 性别只能为：1:男;2:女;-1:保密
	 */
	int SEX_ZERO_ONE = 25337;

	/**
	 * 类别id和分页数据只能一个有效
	 */
	int CLASSID_PAGE_ERROR = 25338;

	/* ******互动平台***end************* */

	/* ******用户预定购信息***start************* */
	/**
	 * 用户已预订购
	 */
	int USER_HAVE_PRESUBSCRIPE = 25400;

	/**
	 * 用户预定信息为空
	 */
	int USER_PRE_SUBLIST_IS_NULL = 25401;

	/**
	 * 用户预定图书已达最大值
	 */
	int USER_PRE_SUBSCRIBE_MAX = 25402;

	/**
	 * 用户未预定购这本书
	 */
	int USER_UNPRESUBSCRIPE_THIS_BOOK = 25403;

	/**
	 * 用户已预订购杂志系列
	 */
	int USER_HAVE_PRESUBSCRIPE_SERIES = 25404;

	/**
	 * 用户预定杂志系列已达最大值
	 */
	int USER_PRE_SUBSCRIBE_SERIES_MAX = 25405;

	/**
	 * 查询不到杂志系列ID
	 */
	int SERIESID_NOT_FOUND_BY_BOOKID = 25406;

	/**
	 * 用户未预定购这个杂志系列
	 */
	int USER_UNPRESUBSCRIPE_THIS_SERIES = 25407;

	/**
	 * 用户预定杂志系列为空
	 */
	int USER_SERIES_PRE_SUB_LIST_IS_NULL = 25408;

	/**
	 * 杂志系列ID为空
	 */
	int MAGAZINE_SERIES_IS_NULL = 25409;

	/**
	 * 处理方法为空
	 */
	int MAGAZINE_ACCESS_METHOD_IS_NULL = 25410;

	/**
	 * 查询不到杂志系列
	 */
	int NO_MAGAZINE_SERIES_FOUND = 25411;

	/**
	 * 扩展信息不存在
	 */
	int NO_BOOKEXT_FOUND = 25412;

	/**
	 * 用户已预订更新品牌
	 */
	int USER_HAVE_PRESUBSCRIPE_BREED = 25413;

	/**
	 * 用户未预定购这个品牌
	 */
	int USER_UNPRESUBSCRIPE_THIS_BREED = 25414;

	/**
	 * 用户预定品牌已达最大值
	 */
	int USER_PRESUB_BREED_MAX = 25415;

	/* ******用户预定购信息***end************* */

	/* ******投票***start************* */
	/**
	 * 用户已经投过票
	 */
	int USER_HAVE_VOTED = 25500;

	/**
	 * 投票统计信息不存在
	 */
	int NO_VOTESTAT_ENTITY = 25501;

	/**
	 * 用户每天对同一本书投票达到最大值
	 */
	int USER_VOTED_MAX = 25502;

	/**
	 * 用户每天投票达到最大值
	 */
	int USER_ALL_VOTED_MAX = 25503;

	/* ******投票***end************* */

	/* ******用户注册***start************* */

	/**
	 * 用户已注册存在
	 */
	int USER_ALEADY_EXIST = 25600;

	/**
	 * 该呢称已被注册使用过
	 */
	int NICKNAME_ALEADY_EXIST = 25601;

	/**
	 * 用户不在合法的号码段
	 */
	int MOBILENO_OUT_OF_RANK = 25602;

	/**
	 * 插入用户信息错误
	 */
	int USER_INSERT_ERROR = 25603;

	/**
	 * 用户扩展信息更新失败
	 */
	int USER_EXTEND_INFO_UPDATE_FAIL = 25604;

	/* ******用户注册***end************* */

	/* ******用户好友管理***start************* */
	/**
	 * 好友已经存在
	 */
	int USER_FRIEND_HAVE_EXIST = 25800;

	/**
	 * 没有这个好友
	 */
	int USER_FRIEND_HAVE_NOT_EXIST = 25801;

	/* ******用户好友管理***end************* */

	/* ******专区包月***start************* */
	/**
	 * 无包月订购记录
	 */
	int NO_SUBSCRIBE_RECORDS = 25900;

	/**
	 * 已包月
	 */
	int HAVE_SUBSCRIBE = 25901;

	/**
	 * 包月订购失败
	 */
	int SUBSCRIBE_FAIL = 25902;

	/**
	 * 包月订购失败
	 */
	int SUBSCIBE_IS_FAIL = 25902;

	/**
	 * 取消包月订购失败
	 */
	int UNSUBSCRIBE_FAIL = 25903;

	/**
	 * 包月预缴方式下包月订购退订失败
	 */
	int PREPAY_UNSUBSCRIBE_FAIL = 25928;

	/**
	 * 包月预缴方式下包月暂停失败
	 */
	int PREPAY_SUBSCRIBEPAUSE_FAIL = 25929;

	/**
	 * 包月已退订
	 */
	int HAVE_UNSUBSCRIBE = 25904;

	/**
	 * 包月已生效，当月无法续订（退订操作后当月的状态）
	 */
	int EFFECTIVE_SUBSCRIBE_THIS_MONTH = 25905;

	/**
	 * 设置当前月可用状态出错
	 */
	int SET_CURRENTMONTHSTATUS_ERROR = 25906;

	/**
	 * 该号码不允许订购包月业务
	 */
	int SUBSCRIBE_CLOSED = 25907;

	/**
	 * 专区包月正处理中，不允许再包月
	 */
	int FORBID_SUBS_IN_SUBSCRIBING = 25908;

	/**
	 * 专区包月正处理中，不允许取消包月
	 */
	int FORBID_UNSUBS_IN_SUBSCRIBING = 25909;

	/**
	 * 没有找到未订购的章节列表
	 */
	int NOT_FIND_UNSUBCHAPTER_LIST = 25910;

	/**
	 * 专区包月退订正处理中，不允许再包月
	 */
	int FORBID_SUBS_IN_CANCELING = 25911;

	/**
	 * status为退订中时，不允许门户发起订购
	 */
	int SUBSCRIBE_FAIL_UNSUBSCRIBEING = 25911;

	/**
	 * 专区包月退订正处理中，不允许取消包月
	 */
	int FORBID_UNSUBS_IN_CANCELING = 25912;

	/**
	 * 包月已暂停,不允许退订
	 */
	int FORBID_SUB_IN_PAUSE = 25913;

	/**
	 * 包月订购（或退订）请求VGOP/MISC，VGOP/MISC逻辑错误或无响应
	 */
	int VGOP_LOGIC_ERROR = 25914;

	/**
	 * 包月订购失败，不须退订
	 */
	int SUBSCRIBE_FAIL_NO_COUNTERMAND = 25915;

	/**
	 * 包月订购中，不允许强制退订
	 */
	int COERCESUBSCRIBE_FAIL_ISSUBSCRIBEING = 25916;

	/**
	 * 副业务代码产品不允许门户发起订购
	 */
	int SALVE_PRODUCT_ID_NOT_ALLOW_SUBSCRIBE = 25942;

	/**
	 * 平台包月产品已经过期
	 */
	int SUBSCRIBE_FAIL_EXPIRED = 25925;

	/**
	 * Boss包月无法赠送
	 */
	int BOSS_SUBSCRIBE_PRESENT_FORBIDDEN = 25926;

	/**
	 * BOSS包月产品暂时不允许订购和退订
	 */
	int SUBSCRIBE_FAIL_ISNOTALLOWED = 25961;

	/**
	 * 该包月产品尚未对您开放
	 */
	int SUBSCRIBE_NOT_SUPPORT = 21702;

	/**
	 * 包月预缴订购未适配到包月预缴促销活动
	 */
	int PREPAY_NONE_FIT_PROMOTION = 340099;

	/* ******专区包月***end************* */

	/* ******书讯管理***start************* */
	/**
	 * 没有书讯列表信息
	 */
	int NO_BOOKNEWSLISTINFO = 26000;

	/**
	 * 没有书讯信息
	 */
	int NO_BOOKNEWSINFO = 26001;

	/**
	 * 没有书讯关联的书列表
	 */
	int NO_BOOKNEWS_ACC_BOOKLIST = 26002;

	/**
	 * 没有书讯关联的书讯列表
	 */
	int NO_BOOKNEWS_ACC_BOOKNEWSLIST = 26003;

	/**
	 * 没有书讯书讯上下篇信息
	 */
	int NO_BOOKNEWS_TRANSLATE_INFO = 26004;

	/* ******书讯管理***end************* */

	/* ******热词管理***start************* */
	/**
	 * 没有热词信息
	 */
	int NO_HOTWORDINFO = 26100;

	/* ******热词管理***end************* */

	/* **************轮询内容信息**** start************ */
	/**
	 * 没有轮询内容信息
	 */
	int NO_POLL_CONTENTINFO = 26200;

	/**
	 * 没有内容信息
	 */
	int NO_CONTENTINFO = 26201;

	/* ***************轮询内容信息*****end********** */

	/* **************终端相关**** start************ */
	/**
	 * 没有终端适配信息
	 */
	int NO_TERMINAL_ADA_INFO = 26300;

	/**
	 * 没有终端信息
	 */
	int NO_TERMINAL_INFO = 26301;

	/**
	 * 没有终端厂商信息
	 */
	int NO_TERMINAL_VENDOR_INFO = 26302;

	/**
	 * 没有终端软件信息
	 */
	int NO_TERMINAL_SOFT_INFO = 26303;

	/**
	 * 没有终端软件版本信息
	 */
	int NO_TERMINAL_SOFT_VERSION_INFO = 26304;

	/**
	 * 通过DDr查询，没有终端适配信息
	 */
	int NO_TERMINAL_ADA_INFO_BY_DDR = 26305;

	/**
	 * 手机厂商为空
	 */
	int MOBILE_VENDOR_IS_NULL = 26306;

	/**
	 * 获取版本型号列表为空
	 */
	int VENDOR_MODEL_LIST_IS_NULL = 26307;

	/* ***************终端相关*****end********** */

	/* ****************统计相关******start************ */
	/**
	 * 书没有被收藏
	 */
	int CON_FAV_COUNT_IS_NOT = 26400;

	/* ****************统计相关********end********** */

	/* ****************评论相关******start************ */
	/**
	 * 内容评论失败
	 */
	int CON_COMMENT_IS_FAIL = 26500;

	/**
	 * 用户评论失败
	 */
	int USER_COMMENT_IS_FAIL = 26501;

	/**
	 * 用户评论类型为空
	 */
	int USER_COMMENT_TYPE_IS_NULL = 26502;

	/* ****************评论相关********end********** */

	/* ****************短信(或push等)相关******start************ */
	/**
	 * 没有相应的点播码
	 */
	int NO_SMS_SUBSCRIBE_CODE = 26601;

	/**
	 * 短信发送失败
	 */
	int SMS_SEND_FAIL = 26602;

	/**
	 * push信息发送失败
	 */
	int PUSH_SEND_FAIL = 26603;

	/**
	 * SMS移动短信开关已关闭
	 */
	int SMS_SWITCH_CLOSED = 26604;

	/**
	 * SMS联通短信开关已关闭
	 */
	int SMS_CUCC_SWITCH_CLOSED = 26608;

	/**
	 * SMS电信短信开关已关闭
	 */
	int SMS_CTCC_SWITCH_CLOSED = 26609;

	/**
	 * push开关已关闭
	 */
	int PUSH_SWITCH_CLOSED = 26605;

	/**
	 * 接入码为空
	 */
	int CONNECTCODE_IS_NULL = 26606;

	/**
	 * 点播码为空
	 */
	int CODE_IS_NULL = 26607;

	/* ****************短信(或push等)相关******end************ */

	/* ****************手持相关********start********** */

	/**
	 * 区块类型不是整形
	 */
	int HANSET_BLOCK_TYPE_NOT_NUM = 267001;

	/**
	 * 区块类型无效
	 */
	int HANSET_BLOCK_TYPE_INVAL = 267002;

	/**
	 * 没有手持区块信息
	 */
	int HANSET_BLOCK_INFO_IS_NOT = 267003;

	/**
	 * 没有手持目录信息
	 */
	int HANSET_CATALOG_INFO_IS_ONT = 267004;

	/**
	 * 没有手持目录列表信息
	 */
	int HANSET_SUBCATALOG_LIST_IS_ONT = 267004;

	/**
	 * 没有手持名家名作列表信息
	 */
	int HANSET_AUTHORBOOK_LIST_IS_ONT = 267005;

	/**
	 * 没有手持区块信息列表
	 */
	int HANSET_BLOCK_INFO_LIST_IS_NOT = 267006;

	/**
	 * 获取手持绑定验证码失败
	 */
	int HANSET_SMSVERIFYCODE_FAILED = 267007;

	/**
	 * 错误的门户类型
	 */
	int HANDSET_ILLEGAL_USERAGENT = 267008;

	/**
	 * 非法的手持终端版本
	 */
	int HANDSET_ILLEGAL_CLIENTVERION = 267009;

	/**
	 * 没有手持终端版本号
	 */
	int HANDSET_NO_CLIENTVERION = 267010;

	/**
	 * 没有手持终端门户类型
	 */
	int HANDSET_NO_USERAGENT = 267011;

	/**
	 * 没有手持终端类型名称
	 */
	int HANDSET_NO_MODEL_TYPE = 267012;

	/**
	 * radius查询无效查询类型
	 */
	int HANDSET_RADIUS_PARAMETER_MSTYPE_INVALID = 267013;

	/**
	 * radius查询无效MSID类型
	 */
	int HANDSET_RADIUS_PARAMETER_MSID_INVALID = 267014;

	/**
	 * radius查询失败
	 */
	int HANDSET_RADIUS_QUERY_FAIL = 267015;

	/**
	 * radius查询IP非法
	 */
	int HANDSET_RADIUS_QUERY_IP_INVALID = 267016;

	/**
	 * 没有手持绑定信息
	 */
	int HANSET_BIND_INFO_IS_ONT = 267017;

	/**
	 * 无效的日志时间
	 */
	int HANDSET_UPLOADCLIENTLOG_LOGTIME_IS_NOT = 267018;

	/**
	 * 手持配置类型为空
	 */
	int HANDSET_CONFIGTYPE_IS_NULL = 267019;

	/**
	 * 手持配置名称为空
	 */
	int HANDSET_CONFIGNAME_IS_NULL = 267020;

	/**
	 * 没有手持配置信息
	 */
	int HANDSET_NO_CONFIGENTITY = 267021;

	/**
	 * 消息验证鉴权失败
	 */
	int HANDSET_CLIENTHASH_CHECK_FAILURE = 267022;

	/**
	 * 手机绑定验证码无效
	 */
	int HANDSET_MSISDN_VERIFYCODE_INVALIDATE = 267023;

	/**
	 * 手机绑定关系保存失败
	 */
	int HANDSET_ASSOCIATE_SAVE_RELATION_FAILURE = 267024;

	/**
	 * 手持绑定更新设备内置卡号码失败
	 */
	int HANDSET_UPDATE_DEVICEUACARD_FAILURE = 267025;

	/**
	 * 解绑状态不存在
	 */
	int HANDSET_UNBIND_STATUS_INEXISTENCE = 267026;

	/**
	 * 解绑时间不存在
	 */
	int HANDSET_UNBIND_UNBRANDTIME_INEXISTENCE = 267027;

	/**
	 * 解绑类型不存在
	 */
	int HANDSET_UNBIND_UNBRANDTYPE_INEXISTENCE = 267028;

	/**
	 * 解绑失败
	 */
	int HANDSET_UNBIND_FAIL = 267029;

	/**
	 * 该手机号不在绑定状态
	 */
	int HANDSET_MSISDN_NOT_BIND_STATUS = 267030;

	/**
	 * 手持绑定关系已经存在(用内卡判断)
	 */
	int HANDSET_INNERMSISDN_BIND_RELATIONSHIP_EXIST = 267031;

	/**
	 * 手持绑定关系已经存在(用被绑号码)
	 */
	int HANDSET_MSISDN_BIND_RELATIONSHIP_EXIST = 267032;

	/**
	 * 手持绑定关系不存在（一一匹配）
	 */
	int HANDSET_BIND_TWO_RELATIONSHIPS_EXIST = 267033;

	/**
	 * 手持绑定关系已经存在（一一匹配）
	 */
	int HANDSET_BIND_RELATIONSHIP_EXIST = 267034;

	/**
	 * 手持获取验证码 消息鉴权 失败
	 */
	int HANDSET_VERIFY_MSG_PRIVILEGE_FAILED = 267035;

	/**
	 * 无效的阅读时间
	 */
	int HANDSET_UPLOADREADRECORD_READTIME_IS_NOT = 267036;

	/**
	 * 请求的手机号码和内卡号码没有存在绑定关系（数据库中不存在）
	 */
	int MSISDN_AND_INNERMSISDN_HAVE_NO_BIND = 267037;

	/**
	 * 手持绑定暂停失败
	 */
	int HANDSET_PAUSEBIND_FAIL = 267038;

	/**
	 * 手持批量绑定信息列表为空
	 */
	int HANDSET_BATHBIND_LIST_IS_NULL = 267039;

	/**
	 * 手持批量解绑信息列表为空
	 */
	int HANDSET_BATHUNBIND_LIST_IS_NULL = 267040;

	/**
	 * 手持绑定恢复失败
	 */
	int HANDSET_ACTIVE_FAIL = 267041;

	/**
	 * 手持绑定处理中
	 */
	int HANDSET_BIND_IN_DEAL = 267042;

	/**
	 * 手持解绑处理中
	 */
	int HANDSET_UNBIND_IN_DEAL = 267043;

	/**
	 * 手持批量解绑失败
	 */
	int HANDSET_BATHUNBIND_TO_BOSS_IS_FAIL = 267044;

	/**
	 * 手持批量验证号码失败
	 */
	int HANDSET_BATH_VALI_BIND_NUM_IS_FAIL = 267045;

	/**
	 * 手持绑定解绑重发操作失败
	 */
	int HANDSET_BIND_UNBIND_REPEAT_SEND_FAILURE = 267046;

	/**
	 * 手持批量暂停到计费失败
	 */
	int HANDSET_BATCHPAUSE_TO_CHARGE_FAIL = 267047;

	/**
	 * 手持批量恢复到计费失败
	 */
	int HANDSET_BATCHACTIVE_TO_CHARGE_FAIL = 267048;

	/**
	 * 手持重复操作
	 */
	int HANDSET_REPEAT_OPERATION = 267049;

	/**
	 * 日期字符串格式错误
	 */
	int DATE_STRING_FORMAT_ERROR = 267050;

	/**
	 * 设备信息无效
	 */
	int VALI_DEVICEID_IS_FALI = 267051;

	/**
	 * 批量验证 设备标识号码失败
	 */
	int HANDSET_BATHUNBIND_VALI_DEVICEID = 267052;

	/**
	 * 手持绑定相关信息没有找到
	 */
	int HANDSET_BIND_OR_UNBIND_INFO_NOT_FOUND = 267053;

	/**
	 * 区块类型为空
	 */
	int BLOCK_ID_IS_NULL = 267054;

	/**
	 * 随机信息记录为空
	 */
	int HANSET_RANDOM_INFO_LIST_IS_NOT = 267055;

	/**
	 * 手持查询升级软件版本，手机号为空
	 */
	int HANSET_SOFT_NULL_MSISDN = 267056;

	/* ****************手持相关********end********** */

	/* ****************消息管理********end********** */

	/**
	 * 消息标识不是整形
	 */
	int MESSAGE_ID_IS_NOT_INT = 26801;

	/**
	 * 站内消息没有
	 */
	int STAGE_INNER_MESSAGE_IS_NOT_FOUND = 26802;

	/**
	 * 站内消息体无效
	 */
	int STAGE_INNER_MESSAGE_IS_INVAL = 26803;

	/**
	 * 站内消息类型无效
	 */
	int STAGE_INNER_MESSAGE_TYPE_IS_INVAL = 26804;

	/**
	 * 接受方和发送方手机号码不能同时为空
	 */
	int REC_SEND_MSISDN_IS_NOT_SAME_NULL = 26805;

	/**
	 * 站内消息头无效
	 */
	int STAGE_INNER_TITLE_IS_INVAL = 26806;

	/**
	 * 站内消息添加失败
	 */
	int STAGE_INNER_MESSAGE_ADD_IS_FAIL = 26807;

	/**
	 * 站内消息删除失败,或者数据库中已经没有需要删除的记录了
	 */
	int STAGE_INNER_MESSAGE_DEL_IS_FAIL = 26808;

	/**
	 * 阅读站内信息失败
	 */
	int STAGE_INNER_MESSAGE_READ_IS_FAIL = 26809;

	/**
	 * 无效 ids
	 */
	int IDS_IS_INVALIDATION = 26810;

	/**
	 * 系统消息列表没有找到
	 */
	int STAGE_SYS_MSG_LIST_NOT_FIND = 26811;

	/**
	 * PUSH没有URL
	 */
	int STAGE_SYS_MSG_PUSH_URL_NULL = 26812;

	/**
	 * 内容ID无效
	 */
	int STAGE_INNER_CONTENT_ID_IS_INVAL = 26813;

	/**
	 * 内容类型无效
	 */
	int STAGE_INNER_CONTENT_TYPE_IS_INVAL = 26814;

	/**
	 * 发送push失败
	 */
	int SEND_PUSH_MESSAGE_IS_FAIL = 26815;

	/**
	 * 获取站内信用户标识为空
	 */
	int USER_RECMSISDN_IS_NULL = 26816;

	/**
	 * 获取站内信类型标识为空
	 */
	int STAGE_MSG_TYPE_IS_NULL = 26817;

	/**
	 * 接受方手机号码为空
	 */
	int REC_MSISDN_IS_NULL = 26818;

	/**
	 * 客服包月退订失败获取站内信名称为空或者不存在
	 */
	int CLIENTSER_PAYMONTH_UNSUBCRIBE_MESS_NAME_NOTEXIST = 26819;

	/**
	 * 客服包月退订失败向操作人发送站内信时（插入数据记录）操作失败
	 */
	int CLIENTSER_PAYMONTH_UNSUBCRIBE_APPEND_MESS = 26820;

	/**
	 * 赠书留言祝福添加失败
	 */
	int US_LEAVEWORD_ADD_IS_FAIL = 26821;

	/**
	 * 赠书留言祝福列表不存在
	 */
	int USER_LEAVEWORD_LIST_NOT_FOUND = 26822;

	/**
	 * 支持或反对值无效
	 */
	int ABET_OPPOSE_VALUE_IS_INVAL = 26823;

	/**
	 * 赠书留言祝福不存在
	 */
	int LEAVEWORD_IS_INEXISTENCE = 26824;

	/**
	 * 不能对自己赠书留言祝福进行支持或反对
	 */
	int NOT_SELF_LEAVEWORD_ABET_OPPOSE = 26825;

	/**
	 * 顶驳记录添加失败
	 */
	int US_LEAVEWORD_ABET_OPPOSE_ADD_IS_FAIL = 26826;

	/**
	 * 赠书留言祝福ID为空
	 */
	int LEAVEWORDID_IS_NULL = 26827;

	/**
	 * 赠书留言祝福顶或驳值达最大值
	 */
	int ABET_OPPOSE_VALUE_IS_MAX = 26828;

	/**
	 * 站内信发送者与接受方手机号码都为空
	 */
	int RECMSISDN_SENDMSISDN_IS_NULL = 26829;

	/**
	 * 推送消息发送中
	 */
	int AOI_PUSHMESSAGE_SENDING = 26830;

	/**
	 * 发送方或接收方所在省份不能发送站内信
	 */
	int SENDER_OR_RECEIVER_CAN_NOT_SENDSTAMESSAGE = 26831;

	/* ****************消息管理********end********** */

	/* *****************书评*******start******************** */
	/**
	 * 书评标识无效，为长整型
	 */
	int BOOKREVIEW_ID_INVAL = 26901;

	/**
	 * 书评信息没有
	 */
	int BOOKREVIEW_IS_NOT_FOUND_BY_BOOKREVIEWID = 26902;

	/**
	 * 支持或反对值无效
	 */
	int ABE_OPP_VALUE_IS_INVAL = 26903;

	/**
	 * 支持或反对值达最大值
	 */
	int ABE_OPP_VALUE_IS_MAX = 26904;

	/**
	 * 不对自己，支持或反对
	 */
	int NOT_SELF_ABE_OPP = 26905;

	/**
	 * 添加支持或发对失败
	 */
	int ADD_ABE_OPP_IS_FAIL = 26906;

	/**
	 * 这个书评不存在
	 */
	int BOOKREVIW_IS_INEXISTENCE = 26907;

	/**
	 * 内容标识不是整形
	 */
	int CONTENT_ID_NOT_INT = 26908;

	/**
	 * 内容类型不是整形
	 */
	int CONTENT_TYPE_NOT_INT = 26909;

	/**
	 * 书评列表不存在
	 */
	int BOOKREVIW_LIST_NOT_FOUND = 26910;

	/**
	 * 添加书评失败
	 */
	int ADD_BOOKREVIEW_IS_FAIL = 26911;

	/**
	 * 报纸品牌、资讯、快讯被禁评
	 */
	int NEWSPAPER_COMMENT_FORBIDDEN = 26953;

	/**
	 * 内容标识和内容类型必要同时有数据，即同时有数据，同时没有数据
	 */
	int CONENTID_AND_CONENTTYPE_THE_SAME_HAVE = 26912;

	/**
	 * 删除书评失败
	 */
	int DEL_BOOKREVIEW_IS_FAIL = 26913;

	/**
	 * 是否删除评论学分标识无效（1、是; 0、否）
	 */
	int DELETE_SCORE_FLAG_NOT_INT = 26914;

	/**
	 * 书评标识无效，为长整型
	 */
	int BOOKREVIEW_ID_IS_INVAL = 26915;

	/**
	 * 手机号码非法
	 */
	int MSISDN_IS_INVAL = 26916;

	/**
	 * 行业标识无效，为长整型
	 */
	int INDUSTRYID_IS_INVAL = 26917;

	/**
	 * 书项标识无效，为长整型
	 */
	int BOOK_ID_IS_INVAL = 26918;

	/**
	 * 书评ID不存在，删除失败
	 */
	int DEL_FAIL_BOOKREVIEW_NOT_EXIST = 26919;

	/**
	 * 展示为只显示作家，但图书ID不存在
	 */
	int DISPLAY_AUTHOR_CONTENTID_NOT_EXIST = 26920;

	/* *****************书评*******end******************** */

	/* *****************微博相关************************** */
	/**
	 * weiboUserId长度超过128
	 */
	int WEIBO_USERID_LENGTH_OVERLIMIT = 26921;

	/**
	 * weiboToken长度超过128
	 */
	int WEIBO_TOKEN_LENGTH_OVERLIMIT = 26922;

	/**
	 * oauthToken长度超过128
	 */
	int WEIBO_OAUTHTOKEN_LENGTH_OVERLIMIT = 26923;

	/**
	 * oauthTokenSecret长度超过128
	 */
	int WEIBO_OAUTHTOKENSECRET_LENGTH_OVERLIMIT = 26924;

	/**
	 * 添加微博token失败
	 */
	int ADD_WEIBO_TOKEN_FAILED = 26925;

	/**
	 * 未找到对应的token
	 */
	int WEIBO_TOKEN_NOT_FIND = 26926;

	/**
	 * 绑定微博失败
	 */
	int WEIBO_BIND_IS_FAILURE = 26927;

	/**
	 * 解绑定微博失败
	 */
	int WEIBO_UNBIND_IS_FAILURE = 26928;

	/**
	 * 添加微博token已经被使用
	 */
	int ADD_WEIBO_TOKEN_EXIST = 26929;

	/**
	 * shareWeibo时weiboList为空
	 */
	int WEIBO_LIST_IS_EMPTY = 26930;

	/**
	 * uploadWeibo时weiboInfo为空
	 */
	int WEIBOINFO_IS_EMPTY = 26931;

	/**
	 * weiboUserId为空
	 */
	int WEIBOUSERID_IS_EMPTY = 26932;

	/**
	 * weiboType为空
	 */
	int WEIBOTYPE_IS_EMPTY = 26933;

	/**
	 * 无绑定的手机号码
	 */
	int NO_BANG_MSISDN = 26934;

	/**
	 * 所有参数都为空
	 */
	int PARAM_ALL_NULL = 26935;

	/**
	 * 评论的微博id为空
	 */
	int WEIBOID_IS_EMPTY = 26936;

	/**
	 * 评论的内容为空
	 */
	int WEIBOCOMMENT_IS_EMPTY = 26937;

	/**
	 * token、（手机号码或UID）都为空
	 */
	int TOKEN_MSISDN_ALL_EMPTY = 26938;

	// modify by wKF50567 at Dec 6, 2011 for REQ-826 begin

	/**
	 * refresh Token长度超过128
	 */
	int WEIBO_REFRESHTOKEN_LENGTH_OVERLIMIT = 26939;

	/**
	 * access Token长度超过128
	 */
	int WEIBO_ACCESSTOKEN_LENGTH_OVERLIMIT = 26940;

	/**
	 * access Token不能为空
	 */
	int WEIBO_ACCESSTOKEN_IS_NULL = 26941;

	/**
	 * refresh Token长度超过128
	 */
	int WEIBO_REFRESHTOKEN_IS_NULL = 26942;

	/**
	 * old refresh Token长度超过128
	 */
	int WEIBO_OLDREFRESHTOKEN_IS_NULL = 26943;

	/**
	 * old refresh Token长度超过128
	 */
	int WEIBO_OLDREFRESHTOKEN_LENGTH_OVERLIMIT = 26944;

	/**
	 * 微博类型为空
	 */
	int WEIBO_TYPE_IS_NULL = 26945;

	/**
	 * 微博类型无效
	 */
	int WEIBO_TYPE_IS_INVALID = 26946;

	/**
	 * 刷新微博失败
	 */
	int WEIBO_FRESH_ACCESSTOKEN_IS_FAILURE = 26947;

	/**
	 * refresh Token长度超过128
	 */
	int WEIBO_EXTENDINFO_LENGTH_OVERLIMIT = 26948;

	/**
	 * 修改绑定微博扩展信息失败
	 */
	int MODIFY_BINDWEIBO_EXTENDINFO_FAILURE = 26949;

	/**
	 * 扩展信息为空
	 */
	int EXTENDINFO_IS_NULL = 26950;

	/**
	 * 绑定的微博列表为空
	 */
	int BINDED_WEIBOLIST_IS_EMPTY = 26951;

	/**
	 * SSO 凭证解析失败
	 */
	int SSO_RESOLVEARTIFACT_FAIL = 26952;

	/**
	 * Token过期时间为空
	 */
	int WEIBO_TOKEN_EXPIRETIME_IS_NULL = 26955;

	/**
	 * Token过期时间类型错误
	 */
	int WEIBO_TOKEN_EXPIRETIME_IS_INVALID = 26956;

	/**
	 * 新浪Token过期
	 */
	int SINA_WEIBO_TOKEN_EXPIRE = 26957;

	// modify by wKF50567 at Dec 6, 2011 for REQ-826 end

	/* *****************微博相关 end************************** */

	/* *****************消费记录*******start******************** */
	/**
	 * 开始时间无效
	 */
	int START_NOT_INVAL = 27001;

	/**
	 * 结束时间无效
	 */
	int END_NOT_INVAL = 27002;

	/**
	 * 计费类型无效
	 */
	int CHARGE_TYPE_NOT_INT = 27003;

	/**
	 * 消费类型
	 */
	int CONSUME_TYPE_INVAL = 27004;

	/**
	 * 没有包月消费记录
	 */
	int CONSUME_NOT_SUB = 27005;

	/**
	 * 没有按次消费记录
	 */
	int CONSUME_NOT_PUR = 27006;

	/**
	 * 没有消费记录
	 */
	int CONSUME_IS_NOT = 27007;

	/**
	 * 没有按章消费记录
	 */
	int CONSUME_NOT_CHAPTER = 27008;

	/* ****************推广有关********start********** */

	/**
	 * 没有获得到推荐事务信息
	 */
	int NOT_FIND_TRANSACTION_INFO = 28001;

	/**
	 * 添加推荐信息失败
	 */
	int ADD_TRANSACTION_IS_FAIL = 28002;

	/**
	 * 内容标识不是长整形
	 */
	int CENENTID_IS_NOT_LONG = 28003;

	/**
	 * 内容标识不能为空
	 */
	int CENENTID_IS_NOT_NULL = 28004;

	/**
	 * 推荐类型无效
	 */
	int MARKETTYPE_IS_INVAL = 28005;

	/**
	 * 手机号码或者阅读号非法
	 */
	int MSISDN_IS_ERROR = 28006;

	/**
	 * 事务标识不能为空
	 */
	int TANS_ID_IS_NOT_NULL = 28007;

	/* ****************推广有关********start********** */
	/* ****************好友有关******start********** */

	/**
	 * 添加好友失败
	 */
	int FRIEND_ADD_IS_FAIL = 27200;

	/**
	 * 发送添加好友消息失败
	 */
	int Friend_SEND_ADD_MSG_IS_FAIL = 27201;

	/**
	 * 查询好友信息列表为空
	 */
	int FRIEND_LIST_IS_NULL = 27202;

	/**
	 * 删除好友失败
	 */
	int FRIEND_DELETE_IS_FAIL = 27203;

	/**
	 * 修改好友信息失败
	 */
	int FRIEND_UPDATE_IS_FAIL = 27204;

	/**
	 * 添加好友中修改好友状态失败
	 */
	int FRIEND_ADD_UPDATE_IS_FAIL = 27205;

	/**
	 * 已经是好友了
	 */
	int FRIEND_EXIST = 27206;

	/**
	 * 不是用户的好友
	 */
	int FRIEND_NOT_EXIST = 27207;

	/**
	 * 不能对自己添加为好友
	 */
	int FRIEND_NOT_ADD_ONESELF = 27208;

	/**
	 * 好友状态为空
	 */
	int FRIEND_STATES_IS_NULL = 27209;

	/*********************************************************************************************************
	 * 添加好友条件不能都为空
	 */
	int FRIEND_IS_Null = 27210;

	/*********************************************************************************************************
	 * 用户不存在
	 */
	int FRIEND_IS_NOT_EXIST = 27211;

	/* ****************对 mm平台的 sso鉴权******end********** */
	/**
	 * 用户令牌为空
	 */
	int MM_USERTOKEN_IS_NULL = 27300;

	/**
	 * 对MM平台的SSO鉴权失败,返回消息为空
	 */
	int MM_SSO_IS_FAIL = 27301;

	/**
	 * 对MM平台的SSO鉴权失败,返回码不对
	 */
	int MM_SSO_IS_FAIL_BY_CONDE = 27302;

	// add by ykf13180 2009-08-03 begin
	/**
	 * 终端门户的图书专区没有首页
	 */
	int TERMINAL_NO_HOMEPAGE_IN_BOOKCATALOG = 28008;

	/**
	 * 添加用户访问终端首页信息失败
	 */
	int TERMINAL_ADD_USER_TERMINAL_PAGE_FAIL = 28009;

	/**
	 * 修改用户的wap首页失败
	 */
	int TERMINAL_UPDATE_USER_WAP_PAGE_FAIL = 28010;

	/**
	 * 根据终端pageId修改用户访问信息失败
	 */
	int TERMINAL_UPDATE_USERINFO_BY_PAGEID_FAIL = 28011;

	/**
	 * 添加用户访问wap信息失败
	 */
	int TERMINAL_ADD_USER_WAP_PAGE_FAIL = 28012;

	/**
	 * 根据wapPage修改用户访问信息失败
	 */
	int TERMINAL_UPDATE_USERINFO_BY_WAPPAGE_FAIL = 28013;

	/**
	 * 修改用户的wap首页失败
	 */
	int TERMINAL_UPDATE_USER_TERMINAL_PAGE_FAIL = 28014;

	/**
	 * 终端页面的类型为空
	 */
	int TERMINAL_Page_STATUS_NOT_EXIST = 28015;

	// add by ykf13180 2009-09-01 begin
	/**
	 * 添加用户下载记录失败
	 */
	int TERMINAL_ADD_USER_DOWNLOAD_FAIL = 28016;

	// add by ykf13180 2009-09-01 begin

	/* ****************对 www 平台的 **************** */
	/**
	 * 从数据库中查询www门户的页面参数失败
	 */
	int WWW_PARAMS_GET_FAIL = 29007;

	/**
	 * 好友基本权限页面上传参数"联系方式是否可见"为空
	 */
	int RELATIONPURVIEW_IS_NULL = 29008;

	/**
	 * 好友基本权限页面上传参数"书架访问权限"为空
	 */
	int CASEPURVIEW_IS_NULL = 29009;

	/**
	 * 好友基本权限页面上传参数"首页访问权限"为空
	 */
	int INDEXPURVIEW_IS_NULL = 29010;

	/**
	 * 好友基本权限页面上传参数"好友邀请访问权限设置"为空
	 */
	int INVITEPURVIEW_IS_NULL = 29011;

	/**
	 * 好友基本权限页面上传参数"陌生人访问是否留下脚印"为空
	 */
	int CALLERPURVIEW_IS_NULL = 29012;

	/**
	 * 好友动态权限页面上传参数"更新头像权限"为空
	 */
	int OPEHEAD_IS_NULL = 29013;

	/**
	 * 好友动态权限页面上传参数"添加好友"为空
	 */
	int OPEFRIEND_IS_NULL = 29014;

	/**
	 * 好友动态权限页面上传参数"修改个人资料权限"为空
	 */
	int OPEUSERINFO_IS_NULL = 29015;

	/**
	 * 好友动态权限页面上传参数"发表参数权限"为空
	 */
	int OPEBOOKREVIEW_IS_NULL = 29016;

	/**
	 * 好友动态权限页面上传参数"收藏下家图书权限"为空
	 */
	int OPECASE_IS_NULL = 29017;

	/**
	 * 好友基本权限查找结果为空
	 */
	int QUERY_BASIC_RIGHT_NULL = 29018;

	/**
	 * 好友动态权限查找结果为空
	 */
	int QUERY_DYNAMIC_RIGHT_NULL = 29019;

	/**
	 * 隐私信息字段不是0或1
	 */
	int PRIVACY_INFO_ERROR = 290205;

	/**
	 * 留言者号码为空
	 */
	int MESSMSISDN_IS_NULL = 29020;

	/**
	 * 留言/回复内容为空
	 */
	int CONTENT_IS_NULL = 29021;

	/**
	 * '类型，表示是留言还是回复'为空
	 */
	int CONTENTTYPE_IS_NULL = 29022;

	/**
	 * '是否悄悄话'为空
	 */
	int ISSTEAL_IS_NULL = 29023;

	/**
	 * 留言时间为空
	 */
	int APPEARDATE_IS_NULL = 29024;

	/**
	 * 回复ID为空
	 */
	int REID_IS_NULL = 29025;

	/**
	 * 获取记录条数为空
	 */
	int NUMBER_IS_NULL = 29026;

	/**
	 * 留言与回复ID为空
	 */
	int ID_IS_NULL = 29027;

	/**
	 * 查找该用户留言为空记录条数为空
	 */
	int QUERY_FRIEND_LEAVERWORD_NULL = 29028;

	/**
	 * 好友基本权限页面上传参数"最近阅读访问权限"为空
	 */
	int BROWSEPURVIEW_IS_NULL = 29029;

	/**
	 * 查找该用户的好友回复为空记录条数为空
	 */
	int QUERY_FRIEND_REPLY_NULL = 29030;

	/**
	 * 返回好友
	 */
	int COUNT_IS_NULL = 29031;

	/**
	 * 返回好友最近的书评列表为空
	 */
	int QUERY_FRIEND_BOOKREVIEW_NULL = 29032;

	/**
	 * 返回好友最近的收藏列表为空
	 */
	int QUERY_FRIEND_FAVORITE_NULL = 29033;

	/**
	 * 返回用户页面显示信息列表为空
	 */
	int QUERY_USERS_DISPLAYSTYLE_NULL = 29034;

	/**
	 * 返回系统的配置信息不存在
	 */
	int QUERY_SYSCONFIG_IS_NULL = 29035;

	/**
	 * 返回页面的URL地址不存在
	 */
	int QUERY_LONGURL_IS_NULL = 29036;

	/**
	 * 无条目信息
	 */
	int GET_NO_VENDITION = 29037;

	/**
	 * 条目ID不能为空
	 */
	int VENDITIONID_IS_NULL = 29038;

	/**
	 * 已经偷过本书
	 */
	int HAS_STOLEN = 29080;

	/**
	 * 图书已经订购过过
	 */
	int IS_SUBSCRIBED = 29081;

	/**
	 * 无章节可偷
	 */
	int NO_CHAPTERS_STEAL = 29082;

	/**
	 * 偷书时间间隔超过限制
	 */
	int LESS_INTERVAL = 29083;

	/**
	 * 偷书异常
	 */
	int STEAL_BOOK_ERROR = 29084;

	/**
	 * 参数系列ID为空或不是数字
	 */
	int SERIES_ID_IS_NOT_LONG = 30001;

	/**
	 * 系列信息不存在
	 */
	int SERIES_INFO_IS_NOT_EXIST = 30002;

	/**
	 * 系列内容不存在
	 */
	int SERIES_CONTENT_IS_NOT_EXIST = 30003;

	/**
	 * 分辨率适配信息不存在
	 */
	int SCREEN_ADAPT_INFO_IS_NOT_EXIST = 30004;

	/**
	 * 图书分类信息不存在
	 */
	int BOOK_CLASS_INFO_IS_NOT_EXIST = 30005;

	/**
	 * 图书置顶信息应为整型
	 */
	int ISTOP_SHOULD_INTEGER = 30006;

	/**
	 * Wap页面信息不存在
	 */
	int WAP_PAGE_INFO_IS_NOT_EXIST = 30007;

	/**
	 * 页面类型为空
	 */
	int WAP_PAGE_TYPE_IS_NOT_EXIST = 30008;

	/**
	 * 页面样式名称不存在
	 */
	int WAP_PAGE_STYLE_IS_NOT_EXIST = 30009;

	/** add by 李幸锋 for 图书过滤功能 at 2010-9-21 begin */
	/**
	 * 级联信息应为整形
	 */
	int BOOK_FILTER_RECURSIVE_SHOULD_INTEGER = 30010;

	/**
	 * 计费类型应为整形
	 */
	int BOOK_FILTER_FEE_SHOULD_INTEGER = 30011;

	/**
	 * 排行类型应为整形
	 */
	int BOOK_FILTER_RANK_SHOULD_INTEGER = 30012;

	/**
	 * 用户名已存在
	 */
	int USERNAME_IS_EXIST = 30120;

	/** add by 李幸锋 for 图书过滤功能 at 2010-9-21 end */

	/* ****************对新闻相关 **************** */

	/**
	 * 没有新闻列表
	 */
	int NEWS_LIST_IS_NULL = 310001;

	/**
	 * 新闻ID为空
	 */
	int NEWS_ID_IS_NULL = 310002;

	/**
	 * 章节原价上的折扣参数为空
	 */
	int DISCOUNT_IS_NULL = 320001;

	/** **********计费相关 start ******************* */

	/**
	 * 请求类型为空
	 */
	int REQUEST_TYPE_IS_NULL = 33001;

	/**
	 * 请求类型不合法
	 */
	int REQUEST_TYPE_IS_EXIST = 33002;

	/**
	 * 定购关系不存在，不能暂停
	 */
	int PRODUCT_NOT_EXIST = 33003;

	/**
	 * 产品在非正常状态，不能暂停
	 */
	int PRODUCT_STATUS_NOT_EFFECTIVE = 33004;

	/**
	 * 产品已是生效状态
	 */
	int PRODUCT_STATUS_EFFECTIVE = 33005;

	/**
	 * 产品非暂停状态，不能恢复
	 */
	int PRODUCT_STATUS_NOT_PAUSE = 33006;

	/**
	 * 非绑定成功状态，不能暂停
	 */
	int HANSET_BIND_NOT_SUCCESS = 33007;

	/**
	 * 非暂停状态，不能恢复
	 */
	int HANSET_BIND_NOT_PAUSE = 33008;

	/**
	 * 插入订购记录失败，订购记录已经存在 *
	 */
	int SUB_REC_EXIST = 33009;

	/**
	 * 不存在有效的订购关系
	 */
	int PURCHASE_NOT_EXIST = 33010;

	/** **********订费相关 end********************** */

	/** **********订费相关 end********************** */

	/* ****************对主题相关 **************** */

	/**
	 * 主题标题为空
	 */
	int TOPIC_TITLE_IS_NULL = 330001;

	/**
	 * 所属目录ID为空
	 */
	int TOPIC_CATALOG_ID_IS_NULL = 330002;

	/**
	 * 创建人为空
	 */
	int TOPIC_CREATOR_IS_NULL = 330003;

	/**
	 * 主题未被插入
	 */
	int TOPIC_INFO_INSERT_ERROR = 330004;

	/**
	 * 主题ID为空
	 */
	int TOPIC_ID_IS_NULL = 330005;

	/**
	 * 主题的顶驳为空
	 */
	int TOPIC_UPDOWN_IS_NULL = 330006;

	/**
	 * 主题顶驳未被插入
	 */
	int TOPIC_UPDOWN_INSERT_ERROR = 330007;

	/**
	 * 该主题不存在
	 */
	int TOPIC_INFO_IS_NULL = 330008;

	/**
	 * 主题的所属目录为空*
	 */
	int TOPIC_TYPE_IS_NULL = 330009;

	/**
	 * 超出主题顶驳最大值*
	 */
	int TOPIC_ABE_OPP_VALUE_IS_MAX = 330010;

	/**
	 * 更新主题顶驳数失败*
	 */
	int UPDATE_TOPIC_ABEOPP_VALUE = 330011;

	/**
	 * 无法从号段信息获取省市ID,最大可能是数据库中数据不完整*
	 */
	int PROVINCEID_AND_CITYID_IS_NULL = 330050;

	/**
	 * 适配信息记录为空*
	 */
	int REGIONADAPTERINFO_IS_NULL = 330051;

	/**
	 * 获取批量打折起始章节数量为空*
	 */
	int GET_BATCHCHAPTERCOUNT_IS_NULL = 330060;

	/**
	 * 获取批量打折折扣率为空*
	 */
	int GET_BATCHDISCOUNTVALUE_IS_NULL = 330061;

	/* *****************消费卷相关***begin*************** */

	/**
	 * 不符合 促销卷发放的地域
	 */
	int TICKET_NOT_AREA = 34000;

	/**
	 * 促销卷发放完毕
	 */
	int TICKET_AMOUNT_IS_LACK = 34001;

	/**
	 * 还没有到促销卷发放开始时间
	 */
	int TICKET_OVERRUN_GETBEGINDATE = 34002;

	/**
	 * 已经超过促销卷发放结束时间
	 */
	int TICKET_OVERRUN_GETENDDATE = 34003;

	/**
	 * 获取促销卷在销卷发放开始时间和结束时间之间，但不在每天发放的时间内
	 */
	int TICKET_DRAW_UNDATE = 34004;

	/**
	 * 已经达到用户促销卷总额上限
	 */
	int TICKET_DRAW_TOTALTICKET_IS_MAX = 34005;

	/**
	 * 已经达到用户促销卷单日能获取上限
	 */
	int TICKET_DRAW_TICKET_IS_MAX = 34006;

	/**
	 * 没有促销卷信息
	 */
	int TICKET_INFO_IS_NUll = 34007;

	/**
	 * 没有用户的促销卷信息
	 */
	int TICKET_USER_INFO_IS_NULL = 34008;

	/**
	 * 书卷标识非法
	 */
	int TICKET_ID_NUll = 34009;

	/**
	 * 促销卷领取失败
	 */
	int TICKET_DRAW_IS_FAIL = 34010;

	/**
	 * 更新 用户促销卷信息失败
	 */
	int UPDATE_USER_TICKET_INFO_IS_FAIL = 34011;

	/**
	 * 促销卷以过期
	 */
	int TICKET_INFO_IS_OVERDUE = 34012;

	/**
	 * 白名单号码不能领取书卷
	 */
	int BOSS_NUM_IS_NOT_GET_TICKET = 34013;

	/**
	 * 测试号码不能领取书卷
	 */
	int TEST_NUM_IS_NOT_GET_TICKET = 34014;

	/**
	 * 门户类型参数缺失
	 */
	int PORTALTYPE_NUM_IS_NULL_GET_TICKET = 34015;

	/**
	 * 不符合 书券允许领取的用户范围
	 */
	int TICKET_DRAW_USER_AREA_IS_LIMIT = 34016;

	/**
	 * 不符合 书券允许领取的门户类型
	 */
	int TICKET_DRAW_PORTALTYPE_AREA_IS_LIMIT = 34017;

	/**
	 * 新春书券每天发放数量值为空
	 */
	int TICKET_DAY_NUM_NULL = 34018;

	/**
	 * 新春书券发放已达到每天发放数量
	 */
	int TICKET_DRAW_DAYTICKET_IS_MAX = 34019;

	/**
	 * 新春书券发放已达到每小时发放数量
	 */
	int TICKET_DRAW_HOURTICKET_IS_MAX = 34020;

	/* *****************消费卷相关***end*************** */

	/**
	 * 鉴权、订购产品时，该促销产品不属于用户所在地域
	 */
	int CHECK_PRODUCT_BY_USERAREA = 340050;

	/**
	 * 添加手持下载
	 */
	int ADD_HANDSET_DOWNLOAD_RECORD_ERROR = 340051;

	/**
	 * 试图对非按章订购的图书书订购所有未订购章节
	 */
	int PURCHASE_ALL_UNSUBCHAPTER_CHARGEMODE_ERROR = 340052;

	/**
	 * 试图对未完本的图书订购所有未订购章节时
	 */
	int PURCHASE_ALL_UNSUBCHAPTER_ISFINISH_ERROR = 340053;

	/**
	 * 使用书券消费失败
	 */
	int USE_TICKET_PURCHASE_FAIL = 340054;

	/**
	 * 订购促销包时，用户已按次订购过促销包中的所有图书
	 */
	int ALREADY_PURCHASE_ALLBOOK_OF_PRO = 340055;

	/**
	 * 终端获取广告内容时，没找到对应的wap目录ID
	 */
	int TERMINAL_ADINFO_NOWAPCATALOGID = 340056;

	/**
	 * 投票ID非法
	 */
	int BALLOTED_ID_IS_ERROR = 340057;

	/**
	 * 投票选项ID非法
	 */
	int BALLOTED_OPTION_ID_IS_ERROR = 340058;

	/**
	 * 投票未生效
	 */
	int BALLOTED_NO_EFFECT = 340059;

	/**
	 * 投票未开始
	 */
	int BALLOTED_NO_START = 340060;

	/**
	 * 投票已结束
	 */
	int BALLOTED_IS_END = 340061;

	/**
	 * 用户当时日投票的项数已达上限
	 */
	int BALLOTED_COUNT_MAX = 340062;

	/**
	 * 用户对单个选项的投票次数已达上限
	 */
	int BALLOTED_ITEM_COUNT_MAX = 340063;

	/**
	 * 投票选项不存在
	 */
	int BALLOTED_ITEM_NO_EXISTS = 340064;

	/**
	 * 当天已经对该选项投过票
	 */
	int BALLOTED_ITEM_ALREADY_OPE = 340065;

	/**
	 * 抽奖活动id非法
	 */
	int LOTTERY_ACTIVEID_ERROR = 340066;

	/**
	 * 抽奖活动未生效
	 */
	int LOTTERY_NO_EFFECT = 340067;

	/**
	 * 抽奖活动未开始
	 */
	int LOTTERY_NO_START = 340068;

	/**
	 * 抽奖活动已结束
	 */
	int LOTTERY_END = 340069;

	/**
	 * 用户已经抽过奖
	 */
	int LOTTERY_ALREADY_GET = 340070;

	/**
	 * 用户投票已达每人每天每项限制
	 */
	int BALLOTED_ITEM_COUNT_DAY = 340071;

	/**
	 * 奖票已经领完
	 */
	int LOTTERY_NO_TICKET = 340072;

	/**
	 * 找不到起始计费章节
	 */
	int START_CHARGE_CHAPTER_IS_NULL = 340073;

	/**
	 * 终端版本皮肤列表为空
	 */
	int TERMINAL_SKIN_LIST_IS_NULL = 340074;

	/**
	 * 已订购过分册
	 */
	int FASCICULE_HAVE_PURCHASE = 400000;

	/**
	 * 已订购过本分册中所有收费章节
	 */
	int FASCICULE_PURCHASE_ALL_CHAPTER = 400001;

	/**
	 * 已订购过分册所属图书
	 */
	int FASCICULE_HAVE_PURCHASE_BOOK = 400002;

	/**
	 * 已经订购过该分册所属图书的所属专区
	 */
	int FASCICULE_HAVE_SUBSCRIBE = 400003;

	/**
	 * 分册ID为空
	 */
	int FASCICULE_ID_IS_NULL = 400004;

	/**
	 * 无需订购该分册
	 */
	int FASCICULE_NOT_PURCHASE = 400005;

	/**
	 * 号码非移动号码
	 */
	int MOBILE_NOT_VALIDATE = 500000;

	/**
	 * 每天赠送次数达到最大数
	 */
	int MAX_SENT_NUMBER = 500100;

	/**
	 * 每天赠送同一本书给不同用户达到最大次数
	 */
	int MAX_PRESENT_NUMBER_SAME = 500110;

	/**
	 * 每天赠送图书给同一个用户达到最大次数
	 */
	int MAX_PRESENT_NUMBER_PERSON = 500111;

	/**
	 * 白名单号码不能赠送给其他人
	 */
	int BOSS_NUM_NOT_PRESENT = 500112;

	/**
	 * 测试号码不能赠送给其他人
	 */
	int TEST_NUM_NOT_PRESENT = 500113;

	/**
	 * 免费图书不能赠送
	 */
	int FREEBOOK_CANNOT_SENT = 500200;

	/**
	 * 对方已订购此书，不能赠送
	 */
	int BOOK_HASPURCHASE = 500300;

	/**
	 * 查询运营赠送任务时，无法获取任务消息
	 */
	int COURSE_PRESENT_NOINFO = 500301;

	/**
	 * 运营赠送手机号码文件路径不能为空(文件导入方式)
	 */
	int UPLOAD_DIR_IS_NULL = 500302;

	/**
	 * ftp 实例创建失败
	 */
	int FTP_CONSTRUCT_FAILD = 500500;

	/**
	 * 该手机号码没有订购过促销包
	 */
	int NOT_EXISTS_SUBSCRIBE_PROMOTION = 500400;

	/**
	 * 终端系列为空
	 */
	int SERIES_ID_IS_NULL = 22514;

	/**
	 * 书籍类型标识为空
	 */
	int BOOK_TYPE_IS_NULL = 400400;

	/**
	 * 行业相关响应码范围600000～
	 */
	/* *****************干部行业相关***begin*************** */
	/**
	 * 行业标识不是长整型
	 */
	int INDUSTRYID_IS_NOT_LONG_TYPE = 600000;

	/**
	 * 没有配置精英在线平台地址
	 */
	int ELITE_ONLINE_ADDRESS_INEXISTENCE = 600001;

	/**
	 * 向精英在线平台请求用户学习记录失败
	 */
	int GET_USER_LEARN_RECORD_FAILURE = 600002;

	/**
	 * 查询的行业列表为空
	 */
	int IDUSTRYLIST_IS_EMPTY = 600003;

	/**
	 * 阅读时间未到达防作弊时间，不能换章节阅读
	 */
	int READ_TIME_IS_SHORT = 600004;

	/**
	 * 行业书籍不存在
	 */
	int INDUSTRY_BOOK_IS_NOT_FOUND = 600005;

	/**
	 * 行业书籍扩展信息不存在
	 */
	int INDUSTRY_BOOKEXTINFO_IS_NOT_FOUND = 600006;

	/**
	 * 书籍不属于行业
	 */
	int BOOK_NOT_IN_TRADE = 600007;

	/**
	 * 行业排行榜信息不存在
	 */
	int INDUSTRY_RANKINFO_IS_NULL = 600008;

	/**
	 * 没有行业手持区块信息列表
	 */
	int TRADE_HANSET_BLOCK_INFO_LIST_IS_NOT = 600009;

	/**
	 * 没有行业手持区块信息
	 */
	int TRADE_HANSET_BLOCK_INFO_IS_NOT = 600010;

	/**
	 * 没有行业手持目录信息
	 */
	int TRADE_HANSET_CATALOG_INFO_IS_ONT = 600011;

	/**
	 * 没有行业手持目录列表信息
	 */
	int TRADE_HANSET_SUBCATALOG_LIST_IS_ONT = 600012;

	/**
	 * 行业标识不存在
	 */
	int INDUSTRYID_NOT_EXISTS = 600013;

	/**
	 * 查询行业ID列表为空
	 */
	int QUERY_NO_INDUSTRYID = 600014;

	/**
	 * 查询行业组ID为空
	 */
	int QUERY_NO_INDUSTRY_GROUPID = 600015;

	/**
	 * 行业不存在
	 */
	int INDUSTRYID_IS_NOT_FOUND = 600016;

	/**
	 * 记录不存在
	 */
	int RECORD_NOT_FOUND = 600017;

	/**
	 * 状态参数不合法
	 */
	int STATUS_IS_ILLEGAL = 600018;

	/**
	 * 批量注册用户组信息列表为空
	 */
	int REGISTER_USER_GROUP_LIST_IS_EMPTY = 600019;

	/**
	 * 批量注册用户组操作失败
	 */
	int REGISTER_USER_GROUP_IS_FAIL = 600020;

	/**
	 * 用户获取验证码当天次数达到最大值
	 */
	int GET_VERIFYCODE_IS_OVER_LIMIT = 600021;

	/**
	 * 用户获取验证码操作失败
	 */
	int GET_VERIFYCODE_IS_FAIL = 600022;

	/**
	 * 注销用户组失败
	 */
	int DEL_USER_GROUP_MEM_IS_FAIL = 600023;

	/**
	 * 批量注销用户组用户号码列表为空
	 */
	int BATCH_DEL_USER_GROUP_MEM_LIST_IS_EMPTY = 600024;

	/**
	 * 批量注销用户组失败
	 */
	int BATCH_DEL_USER_GROUP_MEM_IS_FAIL = 600025;

	/**
	 * 验证码失效
	 */
	int VERIFY_CODE_IS_INVAL = 600026;

	/**
	 * 平台验证码和传入验证码不符合
	 */
	int VERIFY_CODE_IS_NOT_CORRECT = 600027;

	/**
	 * 类型不在范围内错误
	 */
	int CHANGE_MSISDN_TYPE_IS_ERROR = 600028;

	/**
	 * 搜索对象类型不在范围内错误
	 */
	int OBJECTTYPE_IS_ERROR = 600029;

	/**
	 * 行业标识为空
	 */
	int INDUSTRYID_IS_NULL = 600030;

	/**
	 * 用户不属于行业
	 */
	int USER_NOT_IN_INDUSTRY = 600031;

	// start add by KF71109 at 2012-7-3 for REQ-1345
	/**
	 * 用户获取验证码次数达到一定时间内可以获取的最大值
	 */
	int GET_VERIFYCODE_IS_OVER_LIMIT_IN_TIME = 600032;

	/**
	 * 验证码已经被使用了
	 */
	int GET_VERIFYCODE_IS_USED = 600033;

	/**
	 * 修改使用状态失败
	 */
	int CHANGE_VERIFYCODE_USED_STAUE = 600034;

	/**
	 * 验证码输入错误
	 */
	int CHANGE_VERIFYCODE_ERROR = 600035;

	// end add by KF71109 at 2012-7-3 for REQ-1345

	/* *****************干部行业相关***end*************** */

	/**
	 * 不存在查询生效状态的登录图片ID,url,描述等信息
	 */
	int NOT_EXISTS_SUP_IMAGEINFOR = 22515;

	/**
	 * 客户端默认登录图片不存在
	 */
	int NOT_EXISTS_DEFAULT_SUP_IMAGEINFO = 23515;

	// modify by LKF52007 at 2011-10-10 for 09Version REQ757 begin

	/**
	 * 被赠送号码达到上限
	 */
	int RECEIVE_MOBILE_OUTOF_LIMIT = 340075;

	// modify by LKF52007 at 2011-10-10 for 09Version REQ757 end

	/**
	 * 赠送图书必须为按本计费
	 */
	int SENT_CHARGEMODE_ISNOT_BOOK = 340076;

	/**
	 * 赠送的产品不存在
	 */
	int SENT_PRODUCT_NOT_EXISTS = 340077;

	/**
	 * 赠送类型
	 */
	int PORTAL_PRESENT_TYPE_IS_NULL = 340078;

	/**
	 * 赠送图书记录列表为空
	 */
	int PORTAL_PRESENTBOOK_LIST_IS_NULL = 340079;

	// ********** IPAD 错误码 begin**************/

	/**
	 * 获取iPad验证码失败
	 */
	int IPAD_SMSVERIFYCODE_FAILED = 340080;

	/**
	 * Ipad获取验证码 消息鉴权 失败
	 */
	int IPAD_VERIFY_MSG_PRIVILEGE_FAILED = 340081;

	/**
	 * 没有ipad终端版本号
	 */
	int IPAD_NO_CLIENTVERION = 340082;

	/**
	 * 发送验证码失败
	 */
	int IPAD_SEND_ERROR = 340083;

	/**
	 * 24小时内请求验证码超过次数
	 */
	int IPAD_GET_VERIFYCODE_IS_OVER_LIMIT = 340084;

	/**
	 * 2次请求验证码间隔时间小于N秒
	 */
	int GET_VERIFYCODE_NEXTTIME_LIMIT = 340085;

	/**
	 * 加密密码为空
	 */
	int USER_PASSWORD_IS_NULL = 340086;

	/**
	 * 验证码为空
	 */
	int USER_VERIFYCODE_IS_NULL = 340087;

	/**
	 * 验证码已过期
	 */
	int IPAD_VERIFY_CODE_IS_INVAL = 340088;

	/**
	 * 验证码错误
	 */
	int IPAD_VERIFY_CODE_IS_NOT_CORRECT = 340089;

	/**
	 * 用户密码不能为中文
	 */
	int IPAD_USER_PASSWORD_IS_ERROR = 340090;

	/**
	 * 用户密码长度异常
	 */
	int IPAD_USER_PASSWORD_LENGTH = 340092;

	/**
	 * 用户协议路径为空
	 */
	int IPAD_FTPURL_IS_NULL = 340091;

	/**
	 * 密码为空
	 */
	int PASSWORD_IS_NULL = 340093;

	/**
	 * 赠送类型无效：有效赠送类型为 1:赠送, 2:被赠送
	 */
	int PORTAL_PRESENT_TYPE_INVALID = 340100;

	/**
	 * 无用户验证码信息记录
	 */
	int IPAD_VERIFY_CODE_NOT_CREATE = 340094;

	/**
	 * 验证码校验失败
	 */
	int IPAD_VERIFY_CODE_CHECK_ERROR = 340095;

	/**
	 * 支付移动手机号码为非移号码
	 */
	int PAYMSISDN_IS_NOT_CMCC = 39006;

	/**
	 * 用户登录上下文匹配失败(用户类型/客户端版本不匹配)
	 */
	int AUTHENTICATE_CONTEXT_FAIL = 39004;

	// ********** IPAD 错误码 begin**************/

	/**
	 * 包月产品不能走按次定购
	 */
	int IS_NOT_PURCHASE = 340096;

	/**
	 * 非包月产品不能走包月定购
	 */
	int IS_NOT_SUBSCRIBE = 340097;

	/**
	 * 获取域名白名单内容为空
	 */
	int URLWHITELIST_IS_NULL = 340098;

	// ********** 品牌 错误码 begin**************/

	/**
	 * 用户预定图书信息和专区信息均为空
	 */
	int US_BOOK_CATALOG_REMIND_IS_NULL = 358078;

	/**
	 * 品牌包月专区标识和书项标识均为空
	 */
	int CATALOGID_BOOKID_IS_NULL = 358080;

	/**
	 * 用户未预订该专区
	 */
	int CATALOG_IS_NOT_REMIND = 358081;

	/**
	 * 用户已预订专区
	 */
	int CATALOG_HAVE_REMINDED = 358082;

	/**
	 * 预订类型应为整数
	 */
	int SCHEDULE_TYPE_IS_NOT_LONG = 358084;

	/**
	 * 用户预定专区信息为空
	 */
	int US_CATALOG_REMIND_IS_NULL = 358085;

	/**
	 * 用户预订专区已达最大值
	 */
	int CATALOG_REMIND_MAX = 358093;

	/**
	 * 品牌ID不存在
	 */
	int BREEDID_IS_NOT_EXIT = 358086;

	/**
	 * 品牌请求参数非法
	 */
	int BREEDID_IS_NOT_LEGITIMACY = 358087;

	/**
	 * 品牌分类ID不存在
	 */
	int BREEDID_TYPE_IS_NOT_EXIT = 358088;

	/**
	 * 品牌ID为空
	 */
	int BRANDID_IS_NULL = 358089;

	/**
	 * 根据品牌Id查询不到产品id
	 */
	int CANNOT_FOUND_PRODUCTID_BY_BRANDID = 358090;

	/**
	 * 图片显示条数必须为整数
	 */
	int PICTURE_SHOW_COUNT_IS_NOT_INT = 358091;

	/**
	 * 无效的推荐类型
	 */
	int NEWSPAPER_RECOMMEND_TYPE_INVALID = 358092;

	/**
	 * 缺少关键字
	 */
	int NEWSPAPER_RECOMMEND_ABSENT_KEYWORD = 358094;

	/**
	 * 缺少推荐栏目分类ID或无效
	 */
	int NEWSPAPER_RECOMMEND_ABSENT_RECOMMEND_COLUMNID = 358095;

	/**
	 * 缺少品牌ID或无效
	 */
	int NEWSPAPER_RECOMMEND_ABSENT_ISSNID = 358096;

	/**
	 * 缺少期刊ID或无效
	 */
	int NEWSPAPER_RECOMMEND_ABSENT_PERIODICALID = 358097;

	/**
	 * 缺少期刊栏目分类ID或无效
	 */
	int NEWSPAPER_RECOMMEND_ABSENT_PERIODICAL_COLUMN_ID = 358098;

	/**
	 * 缺少推荐分类参数
	 */
	int NEWSPAPER_RECOMMEND_ABSENT_RECOMMEND_PARAMETER = 358099;

	/**
	 * 品牌未上架或者品牌ID不存在
	 */
	int BREEDID_IS_NOT_EXIT_OR_ONLINE_IS_NULL = 358100;

	/**
	 * 请求新闻类型无效
	 */
	int BREED_NEWSTYPE_IS_NOT_LEGITIMACY = 358101;

	/**
	 * 请求批量鉴权失败：书籍非连载未完本有分册图书
	 */
	int NOT_SERIAL_UNFINISHED_HASFASCICULE_BOOK = 358102;

	/**
	 * 用户预定图书信息、专区信息、品牌均为空
	 */
	int US_BOOK_CATALOG_BREED_IS_NULL = 358103;

	/**
	 * 用户预定品牌为空
	 */
	int US_BREED_IS_NULL = 358104;

	/**
	 * OPRTYPE不合法
	 */
	int OPRTYPE_IS_NOT_LEGITIMACY = 358105;

	// **************************营销ID**********************************//

	/*********************************************************************************************************
	 * 营销id是否存在
	 */
	int CHANNELID_IS_NOT_EXIST = 506000;

	/*********************************************************************************************************
	 * 营销id不合法
	 */
	int CHANNELID_IS_NOT_LEGITIMACY = 506001;

	/*********************************************************************************************************
	 * 营销密码不合法
	 */
	int CHANNELIDPWD_IS_NOT_LEGITIMACY = 506002;

	/*********************************************************************************************************
	 * 营销Id或密码错误
	 */
	int CHANNELID_IS_ERROR = 506003;

	/**
	 * *排行榜实时更新数据为空
	 */
	int RANK_UPDATING_COUNT = 506004;

	/**
	 * *实时更新排行榜类型id不支持*******
	 */
	int RANK_UPDATING_TYPEID = 506005;

	/**
	 * *实时更新排行榜时间类型不支持*******
	 */
	int RANK_UPDATING_TIMETYPE = 506006;

	/**
	 * ***实时排行榜更新时间为空*********
	 */
	int RANK_UPDATINGTIMETYPE = 506007;

	/**
	 * ***实时排行榜更新请求参数二维数组错误*********
	 */
	int RANK_ARRAY_ERROR = 506008;

	/*********************************************************************************************************
	 * 书讯专区ID应为整型
	 */
	int CATEGORGID_IS_NOT_LONG = 507001;

	/**
	 * ***** 根据书讯专区ID得到书讯分组信息为空 ***
	 */
	int BOOKNEWSGROUP_IS_NULL_BY_CATALOGID = 507002;

	/**
	 * ***** 书讯分组ID为空 ****
	 */
	int GROUPID_IS_NULL = 507003;

	/**
	 * ***** 要所书讯分组ID得到书讯信息为空 *****
	 */
	int BOOKNEWS_BY_GROUPID_IS_NULL = 507004;

	/**
	 * * 根据书讯分组ID书讯分组详细信息为空 *
	 */
	int BOOKNEWSGROUP_IS_NULL = 507005;

	/**
	 * 根据书讯目录ID查询没有分组的书讯信息为空
	 */
	int GETBOOKNEWSBYGROUPISNULL_IS_NULL = 507006;

	/* ******实体卡相关***start************* */

	/**
	 * *实体卡订购成功***
	 */
	int BOSSCARD_DRAW_SUCCESS = 700000;

	/**
	 * *业务类型代码错误***
	 */
	int BOSSCARD_BIZTYPE_ERROR = 700001;

	/**
	 * *生效时间错误***
	 */
	int BOSSCARD_REQEFFTIME_ERROR = 700002;

	/**
	 * *操作代码错误***
	 */
	int BOSSCARD_OPRCODE_ERROR = 700016;

	/**
	 * *实体卡不存在，不能订购***
	 */
	int BOSSCARD_IS_LACK = 700017;

	/**
	 * *未到订购开始时间***
	 */
	int BOSSCARD_OVERRUN_GETBEGINDATE = 700018;

	/**
	 * *超过订购结束时间***
	 */
	int BOSSCARD_OVERRUN_GETENDDATE = 700019;

	/**
	 * *实体卡暂停状态，不能订购***
	 */
	int BOSSCARD_STATUS_IS_PAUSE = 700020;

	/**
	 * *参数非法***
	 */
	int BOSSCARD_PARAMETER_IS_ERROR = 700021;

	/**
	 * *实体卡订购请求报文为空***
	 */
	int BOSSCARD_SUBSCRIBE_INFO_IS_NULL = 700022;

	/**
	 * *订购业务信息列表为空***
	 */
	int BOSSCARD_BIZINFOLST_IS_EMPTY = 700023;

	/**
	 * 实体卡卡号错误
	 */
	int PHYSICAL_CARD_IS_ERROR = 700024;

	/**
	 * 活动已结束
	 */
	int NINGBO_ZHIBOHUI_ACTIVITY_END = 700025;

	/**
	 * 活动未开始
	 */
	int NINGBO_ZHIBOHUI_ACTIVITY_NOTBEGIN = 700028;

	/**
	 * 用户已领取过实体卡
	 */
	int USER_HAS_GOT_TICKET = 700026;

	/**
	 * 内置密码为空
	 */
	int CLIENT_PWD_NULL = 711126;

	/**
	 * 实体卡已被领取
	 */
	int CARD_HAS_BEEN_GOT = 700027;

	/**
	 * 实体卡已经到达单日领取限制
	 */
	int CARD_TO_DAY_LIMIT = 28017;

	/**
	 * 实体卡到达总领取数限制
	 */
	int CARD_TO_TOTAL_LIMIT = 28018;

	/**
	 * 领取失败
	 */
	int CARD_GET_FAILED = 700029;

	/* ******实体卡相关***end************* */
	/** ************************* 非cmwap需求新增begin ********************** */
	/**
	 * 用户未注册
	 */
	int REG_USERSTATE_NOT_REGISTER = 800000;

	/**
	 * 用户隐性注册状态
	 */
	int REG_USERSTATE_RECESSIVE_REGISTER = 800001;

	/**
	 * 用户待激活状态
	 */
	int REG_USERSTATE_WAIT_ACTIVATE = 800002;

	/**
	 * 用户正常使用中状态
	 */
	int REG_USERSTATE_USE_OK = 800003;

	/**
	 * 用户状态异常
	 */
	int REG_USERSTATE_USER_ERROR = 800004;

	/**
	 * 找回密码注册找回密码事务插入异常
	 */
	int REG_TRANSACTION_NOT_ADD = 900000;

	/**
	 * 找回密码输入的验证码有误
	 */
	int REG_PWDBACK_VCODE = 900001;

	/**
	 * 找回密码输入的手机号不是移动号码
	 */
	int REG_PWDBACK_PHONE_ERROR = 900002;

	/**
	 * 找回密码次数过多
	 */
	int REG_PWDBACK_TRYTIMES = 900003;

	/**
	 * 发送找回密码push消息异常
	 */
	int REG_PWDBACK_MSG_SEND_ERROR = 900004;

	/**
	 * 发送激活短信超过次数
	 */
	int REG_USERSTATE_USER_SENDMSG_OUT = 800011;

	/**
	 * 用户注册失败
	 */
	int REG_USER_RECESSIVE_REGISTER_FAIL = 800005;

	/**
	 * 用户操作类型错误
	 */
	int REG_USER_ACTIONTYPE_ISNULL = 800006;

	/**
	 * 注册类型不是长整型
	 */
	int REG_USERREGISTTYPE_NOT_INTEGER = 800007;

	/**
	 * 用户激活成功
	 */
	int REG_USERSTATE_USER_ACTIVE_SUCESS = 800010;

	/**
	 * 用户激活失败
	 */
	int REG_USERSTATE_USER_ACTIVE_FAIL = 800008;

	/**
	 * 验证码失效
	 */
	int REG_USERSTATE_USER_ACTIVE_SMSCODE_FAIL = 800015;

	/**
	 * 注册成功发送的pushurl为空
	 */
	int REG_REGIST_SUCCESS_SENDPUSHURL_ISNULL = 800020;

	/**
	 * 用户已经处于激活状态
	 */
	int REG_USERSTATE_USER_ACTIVED = 800009;

	/**
	 * 修改密码时未获得手机号
	 */
	int REG_PWDMDF_WITHOUT_MSISDN = 805001;

	/**
	 * 修改密码时旧密码不正确
	 */
	int REG_PWDMDF_OLDPWD_INCORRECT = 805002;

	/**
	 * 修改密码时修改密码成功
	 */
	int REG_PWDMDF_MODIFY_SUCCESS = 805003;

	/**
	 * 修改密码时系统异常
	 */
	int REG_PWDMDF_MODIFY_ERROR = 805004;

	/**
	 * 修改密码时修改失败
	 */
	int REG_PWDMDF_MODIFY_FAILURE = 805005;

	/**
	 * 重设密码事务不存在或已过期
	 */
	int REG_PWDMDF_RESET_FAILURE = 805006;

	/**
	 * 重设密码成功
	 */
	int REG_PWDMDF_RESET_SUCCESS = 805007;

	/**
	 * 事务不存在或已过期
	 */
	int REG_TRANSACTION_IS_DEAD = 900005;

	/**
	 * 用户注册次数超过允许的最大次数
	 */
	int REG_MAXTIEM_OVERFLOW = 800012;

	/**
	 * backUrl长度超过最大限制
	 */
	int REG_BACKURL_IS_TOO_LONG = 800013;

	/**
	 * 获取不到短信内容
	 */
	int GETPWDBACK_MESSAGE_IS_EMPTY = 800014;

	/** *************************非cmwap需求新增end********************** */

	/**
	 * 用户超过限制
	 */
	int OVER_FEE_LIMITED = 800124;

	/**
	 * 用户超过当日限制
	 */
	int OVER_DAY_FEE_LIMITED = 1888124;

	/**
	 * 用户超过当月限制
	 */
	int OVER_MONTH_FEE_LIMITED = 1888125;

	/**
	 * 用户未受限
	 */
	int US_FEE_UNLIMITED = 800125;

	/**
	 * 用户不纳入消费限额保护
	 */
	int US_FEE_NOT_IN_LIMITED = 800260;

	/**
	 * 消费限制事务ID为空
	 */
	int TXID_IS_NULL = 800126;

	/**
	 * 无效消费限制事务ID
	 */
	int INVALIDATION_TXID = 800127;

	/**
	 * 分值输入错误，只能输入1~5的分值
	 */
	int MARK_IS_NOT_NUMBER = 800258;

	/**
	 * 用户已经打过分，不能再打分
	 */
	int MARK_IS_EXIST = 800259;

	/** ***************** 验证码 ************** */

	/**
	 * 验证码更新失败
	 */
	int VERIFYCODE_INSERT_FAILURE_UPDATE = 800222;

	/**
	 * 验证码添加失败
	 */
	int VERIFYCODE_INSERT_FAILURE = 800200;

	/**
	 * 验证码次数超出预定次数
	 */
	int VERIFYCODE_INVALIDATION_OR_OVERTOPTIME = 800201;

	/**
	 * 验证码验证已失效
	 */
	int PASSWORD_CHECK_FAILUR = 800207;

	/**
	 * 验证码为空
	 */
	int VERIFYCODE_IS_NUll = 800202;

	/**
	 * 无用户验证码信息记录
	 */
	int VERIFYCODE_NOTHING_INFO = 800203;

	/**
	 * 验证码效验失败
	 */
	int VERIFYCODE_CHECKOUT_FAILURE = 800204;

	/**
	 * 新增密码重置失败
	 */
	int PASSWORD_INSERT_RESET_FAILUR = 800205;

	/**
	 * 密码重置超过限制次数
	 */
	int PASSWORD_RESET_FAILUR = 800206;

	/**
	 * 短信解锁成功
	 */
	int REG_USER_UNLOCK_SUCCESS = 800500;

	/**
	 * 短信解锁失败
	 */
	int REG_USER_UNLOCK_FAILURE = 800501;

	/**
	 * 短信注册成功
	 */
	int REG_USER_REGIST_SUCCESS = 800600;

	/**
	 * 短信注册失败
	 */
	int REG_USER_REGIST_FAILURE = 800601;

	/**
	 * 用户密码锁定，下发短信 ，短信类容为空
	 */
	int SERVER_USER_ISLOCK_SENDSMSMESSAGE_IS_NULL = 800502;

	/**
	 * 手持wifi接入用户锁定
	 */
	int HANDSET_USER_LOCKED = 800550;

	/* ******包月用户借阅 20110411 start************* */

	/* ******包月用户借阅 20110411 start************* */

	/**
	 * 图书借阅--手机号非移动号
	 */
	int BORROW_BOOK_MSISDN_ERROR = 800301;

	/**
	 * 图书借阅--借阅者不是包月用户
	 */
	int BORROW_BOOK_NOT_MONTH_USER = 800302;

	/**
	 * 图书借阅--借阅者按本计费的每月总借阅次数超过限制
	 */
	int BORROW_BOOK_MORE_TOTAL_LIMIT = 800303;

	/**
	 * 图书借阅--借阅者在规定借阅期限内重复借阅相同书给用户
	 */
	int BORROW_BOOK_SAMEUSER_LIMITTIME = 800304;

	/**
	 * 图书借阅--被借阅者已经订购了该书
	 */
	int BORROW_BOOK_FRIEND_HAVE_ORDERED = 800306;

	/**
	 * 图书借阅--被借阅者已经被借阅了该书
	 */
	int BORROW_BOOK_FRIEND_HAVE_BORROWED = 800307;

	/**
	 * 图书借阅--其他异常信息(如插入借阅信息错误)
	 */
	int BORROW_BOOK_HAVE_OTHER_ERROR = 800308;

	/**
	 * 图书借阅--借阅类型为空
	 */
	int BORROW_TYPE_IS_NULL = 800309;

	/**
	 * 图书借阅 --借阅列表为空
	 */
	int BORROW_BOOK_LIST_IS_NULL = 800310;

	/* ******包月用户借阅 20110411 end************* */

	/* ******营销适配规则相关***start************* */

	/**
	 * *营销适配规则标识为空***
	 */
	int RULE_ID_IS_NULL = 22523;

	/**
	 * *查询已停用的适配规则返回码***
	 */
	int RULE_NOT_INUSE = 22524;

	/**
	 * *查询不存在的适配规则返回码***
	 */
	int RULE_NOT_EXIST = 22525;

	/**
	 * *营销适配规则维度Method map为空***
	 */
	int DIMENSION_METHODMAP_IS_NULL = 22526;

	/**
	 * 行业图书防作弊-- 删除最近阅读记录并插入新访问记录事务失败
	 */
	int DEL_LATEST_INSERT_NEW_RECORD_FAIL = 800400;

	/**
	 * *拼接营销适配规则维度错误***
	 */
	int FORMAT_DIMENSION_ERROR = 22527;

	/* ******营销适配规则相关***end************* */

	/**
	 * 短信激活-不是待激活状态
	 */
	int REG_USER_SMS_NOTACTIVE_STATE = 800622;

	/* ******秒杀活动相关***start************* */

	/**
	 * 秒杀订购成功
	 */
	String SECONDSUBSCRIBE_SUCCESS = "0";

	/**
	 * 秒杀订购失败
	 */
	String SECONDSUBSCRIBE_FAIL = "1";

	/**
	 * 秒杀数量已告罄
	 */
	String SECONDSUBSCRIBE_OVER = "2";

	/**
	 * *秒杀活动ID为空***
	 */
	int SECONDACTIVITY_ID_IS_NULL = 22528;

	/**
	 * *秒杀活动图书ID为空***
	 */
	int SECONDBOOK_ID_IS_NULL = 22529;

	/**
	 * *秒杀订购时间为空***
	 */
	int SECONDSUBSCRIBETIME_IS_NULL = 22530;

	/**
	 * *秒杀图书鉴权，未订购且未包月***
	 */
	int SECONDBOOKAUTHENTICATE_FAIL = 22531;

	/**
	 * *页面ID不为整数***
	 */
	int PAGEID_IS_IS_NOT_INT_TYPE = 23025;

	/**
	 * *秒杀图书活动状态为空***
	 */
	int SECONDBOOK_STATUS_IS_NULL = 22532;

	/**
	 * *秒杀图书活动不存在***
	 */
	int SECONDBOOK_IS_NOT_EXIST = 22533;

	/**
	 * *秒杀图书活动已失效***
	 */
	int SECOND_ACTIVITY_STATUS_INVALID = 22534;

	/**
	 * *测试用户或白名单用户***
	 */
	int SECOND_ACTIVITY_USER_INVALID = 22535;

	/**
	 * *非按本计费图书***
	 */
	int SECONDBOOK_CHARGEMODE_ISNOT_BOOK = 22536;

	/**
	 * *秒杀图书状态不存在***
	 */
	int SECONDBOOK_STATUS_IS_NOT_EXIST = 22537;

	/**
	 * *非上架图书不允许秒杀***
	 */
	int SECONDBOOK_STATUS_IS_NOT_ON_FIGHT = 22538;

	/**
	 * *已订购或已包月***
	 */
	int SECONDBOOK_IS_SUBSCRIBED = 22539;

	/**
	 * *已秒杀***
	 */
	int SECONDBOOK_IS_SECONDSUBSCRIBED = 22540;

	/**
	 * *秒杀图书不在秒杀活动中***
	 */
	int SECONDBOOK_IS_NOT_IN_SECONDACTIVITY = 22541;

	/**
	 * *秒杀活动不存在***
	 */
	int SECONDACTIVITY_IS_NOT_EXIST = 22542;

	/**
	 * 获取AccessToken失败
	 */
	int GET_ACCESSTOKEN_FAIL = 21038;

	/**
	 * 获取ticket失败
	 */
	int GET_WEIXINT_TICKET_FAIL = 21039;

	/**
	 * *根据产品ID查出来的图书ID与传上来的图书ID不一致***
	 */
	int SECONDBOOKID_IS_NOT_EQUAL = 22543;

	/**
	 * 秒杀时费用超限制
	 */
	int SECOND_FEE_LIMIT = 22544;

	/**
	 * 秒杀时营销活动规则不适配
	 */
	int SECOND_SALES_RULE_MISMATCH = 22545;

	/**
	 * 获取当前秒杀名次失败 ***
	 */
	int QUERY_CURRENTNUM_FAILE = 22550;

	/* ******第三方充值书券相关***start************* */
	/**
	 * 金额不可合法***
	 */
	int MONEY_IS_NOT_INT_TYPE = 22544;

	/**
	 * 实际金额不可合法***
	 */
	int ACTUALMONEY_IS_NOT_INT_TYPE = 22545;

	/**
	 * 实际金额大于折扣金额***
	 */
	int ACTUALMONEY_IS_GREAT_MONEY = 22546;

	/**
	 * 订单编号不能为空*
	 */
	int ORDER_ID_NOT_EMPTY = 22548;

	/**
	 * 查无内容*
	 */
	int NOT_ORDER_HISTORY_INFO = 22549;

	/**
	 * merid为空*
	 */
	int MERID_IS_NULL = 22550;

	/**
	 * merDate为空*
	 */
	int MERDATE_IS_NULL = 22551;

	/**
	 * 金额大于上限*
	 */
	int ACTUALMONEY_GREAT_MAX = 22552;

	/**
	 * 金额小于下限*
	 */
	int ACTUALMONEY_LESS_MIN = 22553;

	/**
	 * 该订单不允许重复提交
	 */
	int ORDER_NO_SUBMIT_AGAIN = 22554;

	/**
	 * GetPageSizeAdapter.java中用到的查询Start不能为空
	 */
	int START_IS_NULL = 22601;

	/**
	 * GetPageSizeAdapter.java中用到的查询Start不能为空
	 */
	int END_IS_NULL = 22602;

	/**
	 * GetPageSizeAdapter.java中用到的查询ID不能为空
	 */
	int ID2_IS_NULL = 22603;

	/**
	 * ProtalParamsImpl.java 中新增的pagesize
	 */
	int PAGESIZE_IS_INVALID = 22604;

	// modify by ckf46428 at 2011-10-18 for REQ-775 begin
	/**
	 * 作家不存在
	 */
	int AUTHOR_NOT_FOUND = 25310;

	/**
	 * 分类不存在
	 */
	int CLASS_NOT_FOUND = 25311;

	/**
	 * 职业不存在
	 */
	int CAREER_NOT_FOUND = 25312;

	/**
	 * 省份不存在
	 */
	int PROVINCE_NOT_FOUND = 25313;

	/**
	 * 省份ID是空
	 */
	int PROVINCE_IS_NULL = 25314;

	/**
	 * 城市没找到
	 */
	int CITY_NOT_FOUND = 25315;

	// modify by ckf46428 at 2011-10-18 for REQ-775 end

	/**
	 * GetPageSizeAdapter.java中用到的查询start不是整型
	 */
	int START_IS_INVALIDE = 26005;

	/**
	 * GetPageSizeAdapter.java中用到的查询end不能为空
	 */
	int END_IS_INVALIDE = 26006;

	/**
	 * GetPageSizeAdapter.java中getPageSizeAdapter方法id转换异常
	 */
	int EDITIONID_IS_INVALIDE = 26007;

	/**
	 * 输入的id 查不到对应的结果
	 */
	int RESULT_IS_NULL = 26008;

	/**
	 * pageSize不是int 型
	 */
	int PAGESIZE_IS_NOT_INT = 26009;

	/**
	 * add by lzc kf 52631 08版 R032 showcase 后新增的接口 根据通过页面宽度id获取终端机型中得 宽度id为空异常
	 */
	int PAGE_GROUP_ID_IS_NULL = 26010;

	/**
	 * add by lzc kf 52631 08版 R032 showcase 后新增的接口 根据通过页面宽度id获取终端机型中得
	 * 宽度id不能转化成int型
	 */
	int PAGE_GROUP_ID_IS_INVALIDE = 26011;

	// modify by KF52631 廖正超 at 2011-9-14 for IRD-19580 begin
	/**
	 * 当输入的start大于end是抛此数据逻辑异常
	 */
	int PAGE_START_END_INVALIDE = 26012;

	// modify by KF52631 廖正超 at 2011-9-14 for IRD-19580 end

	/**
	 * CMR09版本用户评分非法异常
	 */
	int US_BOOK_MARK_INVALID = 26013;

	/**
	 * CMR09版本用户评分转化成int异常
	 */
	int BOOKID_SHOULD_BE_INT = 26014;

	/**
	 * CMR09版本用户评分不能再次打分
	 */
	int CAN_NOT_MARK_AGAIN = 26015;

	/**
	 * CMR09版本用户评分用户的等级没达到要求
	 */
	int LEVEL_NOT_ACHIEVED = 26016;

	/* ******第三方充值书券相关***end************* */

	/* ******秒杀活动相关***end************* */

	/**
	 * 企业阅读 -- 企业编码不能为空
	 */
	int ENTERPRISE_ECCODE_IS_NULL = 800410;

	/**
	 * 企业阅读 -- 106端口号不能为空
	 */
	int ENTERPRISE_ACCESSNO_IS_NULL = 800401;

	/**
	 * 企业阅读 -- 时间戳不能为空
	 */
	int ENTERPRISE_TS_IS_NULL = 800402;

	/**
	 * 企业阅读 -- 企业HASH不能为空
	 */
	int ENTERPRISE_HASH_IS_NOT_EXIST = 800403;

	/**
	 * 企业阅读 -- 企业信息不存在
	 */
	int ENTERPRISE_ECCODE_IS_NOT_EXIST = 800404;

	/**
	 * 企业阅读 -- 接口密匙校验失败
	 */
	int ENTERPRISE_ECCODE_IS_KEY_HASH = 800405;

	/**
	 * 企业阅读 -- 赠送记录超过限定日期
	 */
	int BOOKPRESENT_SELECT_DATE_IS_ERROR = 800406;

	/**
	 * 企业阅读 --赠送总价格不合法(单位：分)*****
	 */
	int CONSUME_MONEY_IS_ERROR = 800407;

	/**
	 * 企业阅读 --新增企业付费号码失败*****
	 */
	int MSISDN_ECCODE_INSERT_IS_ERROR = 800408;

	/**
	 * 企业阅读 --企业付费号码校验失败*****
	 */
	int MSISDN_ECCODE_ISMISDNVALIDATION_IS_ERROR = 800409;

	/**
	 * 企业阅读 -- 赠送记录超过开始日期大于结束日期*****
	 */
	int BOOKPRESENT_SELECT_DATE_IS_AFTER = 800411;

	/**
	 * 企业阅读 --白名单用户*****
	 */
	int USER_IS_ROLE_BOSS = 800412;

	/**
	 * 企业阅读 --测试用户*****
	 */
	int USER_IS_ROLE_TEST = 800413;

	/**
	 * 短信直连 token不存在
	 */
	int TOKEN_NOT_FOUND = 2009001;

	/**
	 * 短信直连 token不匹配
	 */
	int STOKEN_NOT_MATCHES = 2009002;

	/**
	 * 短信直连 token过期
	 */
	int TOKEN_TIME_OUT = 2009003;

	/**
	 * 短信直连rand随机数为空
	 */
	int RAND_IS_NULL = 2009004;

	/**
	 * 短信直连SIMSI随机数为空
	 */
	int SIMSI_IS_NULL = 2009005;

	/**
	 * 短信直连counter随机数为空
	 */
	int COUNTER_IS_NULL = 2009006;

	/**
	 * 短信直连 客户端内置密码未找到
	 */
	int CLIENT_PASSCODE_NOT_FOUND = 2009007;

	/**
	 * 消费规则 根据cityId获取消费规则为空
	 */
	int CONSUME_RULE_IS_NOT_FOUND_BY_CITYID = 401001;

	/**
	 * 消费规则 消费规则列表获取为空
	 */
	int CONSUME_RULE_IS_NOT_FOUND = 401002;

	/**
	 * 消费规则 获取Boss订购的产品ID列表为空
	 */
	int BOSS_PRODUCT_ID_NOT_FOUND = 401003;

	/**
	 * 消费规则 时间为空
	 */
	int TIME_IS_NULL = 401004;

	/**
	 * 消费规则 根据产品ID获取订购信息为空
	 */
	int SUBSCRIBE_NOT_FOUND_BY_PRODUCTID = 401005;

	/**
	 * 消费规则 消费规则已过期
	 */
	int CONSUME_RULE_IS_OVER_TIME = 401006;

	/**
	 * 非汉字评论 12小时内不能发布相同评论、留言
	 */
	int CANNOT_COMMENT = 900101;

	/* ******0元包月状态同步***start************* */
	/**
	 * 参数检查失败
	 */
	int BOSS_STATUS_SYN_PARAM_CHK_FAIL = 25917;

	/**
	 * 订购0元包月失败
	 */
	int BOSS_STATUS_SYN_SUB_FAIL = 25918;

	/**
	 * 更新0元包月状态失败
	 */
	int BOSS_STATUS_SYN_UPDATE_STATUS_FAIL = 25919;

	/**
	 * 用户处于暂停状态已经持续N小时，并且书券不足以支付订购费用时返回的错误码
	 */
	int BOSS_STATUS_SYN_FAIL_PAUSE = 25920;

	/**
	 * 用户处于销户状态已经持续N小时，并且书券不足以支付订购费用时返回的错误码
	 */
	int BOSS_STATUS_SYN_FAIL_UNSUB = 25921;

	/**
	 * 用户处于同步中状态已经持续N小时，并且书券不足以支付订购费用时返回的错误码
	 */
	int BOSS_STATUS_SYN_FAIL_SYNING = 25922;

	/**
	 * 用户处于同步失败状态已经持续N小时，并且书券不足以支付订购费用时返回的错误码
	 */
	int BOSS_STATUS_SYN_FAIL_SYNFAIL = 25923;

	/**
	 * 其他错误
	 */
	int BOSS_STATUS_SYN_FAIL_UNKNOWN_ERR = 25924;

	/* ******0元包月状态同步***end************* */
	/**
	 * 插入数据失败
	 */
	int USER_INSERT_LOSE = 28717;

	/**
	 * 中奖查询错误码 begin* 开始时间为空
	 */
	int BEGINTIME_IS_NULL = 910001;

	/**
	 * 查询结果为空
	 */
	int PRIZEINFO_LIST_IS_NULL = 910002;

	/**
	 * 中奖活动id为空
	 */
	int ACTIVITYID_IS_NULL = 910003;

	/**
	 * 结束时间为空
	 */
	int ENDTIME_IS_NULL = 910004;

	/** 中奖查询错误码 end* */

	// modify by zKF42393 at 2011-10-14 for REQ_201 begin

	/**
	 * 活动不存在
	 */
	int COMMONACTIVITY_NOT_EXIST = 6501000;

	/**
	 * 活动未开始
	 */
	int COMMONACTIVITY_NOT_START = 6501001;

	/**
	 * 活动结束
	 */
	int COMMONACTIVITY_END = 6501002;

	/**
	 * 用户已参加活动
	 */
	int USER_JOIN_COMMONACTIVITY = 6501003;

	/**
	 * 用户未参加活动
	 */
	int USER_NOT_JOIN_COMMONACTIVITY = 6501004;

	/**
	 * 活动id为空
	 */
	int COMMONACTIVITY_ID_NULL = 6501005;

	/**
	 * 用户已退出活动
	 */
	int USER_EXIT_COMMONACTIVITY = 6501006;

	/**
	 * 活动人数已满
	 */
	int COMMONACTIVITY_FULL = 6501007;

	/**
	 * 活动id不为长整形
	 */
	int COMMONACTIVITY_ID_NOT_LONG = 6501008;

	// modify by zKF42393 at 2011-11-1 for IRD-20491 begin
	/**
	 * 团购重复手机号码
	 */
	int GROUPON_DUMP_MSISDN = 6501009;

	// modify by zKF42393 at 2011-11-1 for IRD-20491 end

	// modify by zKF42393 at 2011-10-14 for REQ_201 end

	// modify by zKF42393 at 2011-11-22 for IRD-21074 begin
	/**
	 * 在线人数统计节点为空
	 */
	int ONLINE_NUM_KEY_NULL = 6601000;

	// modify by zKF42393 at 2011-11-22 for IRD-21074 end

	/**
	 * 无缓存组的配置
	 */
	int NOT_CACHED_GROUP = 39854;

	/**
	 * Ipad验证码类型错误
	 */
	int VERIFYCODETYPE_NOT_A_NUM = 340101;

	/**
	 * 信息输入错误
	 */
	int INSERT_INFO_ERROR = 28718;

	/**
	 * sql内容为空
	 */
	int QUERY_SQL_CONTENT_EMPTY = 711000;

	/**
	 * 请求动态查询接口时非查询语句异常
	 */
	int NOT_QUERY_SQL = 711001;

	/**
	 * sql语句为空
	 */
	int SQL_IS_EMPTY = 711002;

	/**
	 * 非查询操作时语句为查询语句异常
	 */
	int EXCUTE_UPDATE_OPERATION_BUT_SQL_IS_QUERY_SQL = 711003;

	/**
	 * sql语句参数名字不能为空
	 */
	int SQL_DATA_NAME_IS_EMPTY = 711004;

	/**
	 * sql语句执行失败
	 */
	int SQL_OPERTAION_FAILED = 711005;

	/**
	 * 插入数据表同步139说客(移动微薄)失败
	 */
	int ADD_CMT_SYN_BLOG_FAILURE = 900200;

	/**
	 * 发表139说客评论失败失败
	 */
	int ADD_CMT_SYN_BLOG_ITALK_SEND_FAILURE = 900201;

	/**
	 * 获取139说客好友列表失败
	 */
	int GET_BLOG_FRIEDSLIST_FAILURE = 900202;

	/**
	 * 发送139说客站内信发送者号码id为空
	 */
	int BLOG_SEND_UID_IS_NULL = 900203;

	/**
	 * 发送139说客站内信接收者号码id为空
	 */
	int BLOG_SEND_TARGETUID_IS_NULL = 900204;

	/**
	 * 发送139说客站内信书id为空
	 */
	int BLOG_SEND_CONTENTID_IS_NULL = 900205;

	/**
	 * 发表139说客站内信失败失败
	 */
	int BLOG_SEND_CONTENTID_IS_FAILURE = 900206;

	/**
	 * 微博类型为空
	 */
	int BLOG_TYPE_IS_NULL = 900207;

	/**
	 * 微博类型无效
	 */
	int BLOG_TYPE_INVALID = 900208;

	/**
	 * 活动编号为空
	 */
	int CONSUMPTION_ACTIVITYID_IS_NULL = 900209;

	/**
	 * 评论移动微薄失败
	 */
	int COMENT_BLOG_FAILURE = 900210;

	/**
	 * 查询微薄失败
	 */
	int QRY_BLOG_FAILURE = 900211;

	/**
	 * 该图书的类型不是杂志 09版 REQ-711需求 增加杂志目录接口 add by skf54878 宋卫奇 at 2011-10.12
	 */

	int MAGAZINE_NO_TYPE = 22701;

	// modify by KF52631 廖正超 at 2011-10-20 for 09版SMU-01 req775 begin
	/**
	 * 昵称不能空
	 */
	int NICK_NAME_IS_NULL = 22702;

	/**
	 * 生日不能空
	 */
	int BIRTHDAY_IS_NULL = 22703;

	/**
	 * 性别不能空
	 */
	int SEX_IS_NULL = 22704;

	/**
	 * 昵称id不能空
	 */
	int HEADID_IS_NULL = 22705;

	/**
	 * 用户< userLoveList>我的偶像</ userLoveList >不能空
	 */
	int LOVE_LIST_IS_NULL = 22706;

	/**
	 * < readLikeList>我的偏好</readLikeList>不能空
	 */
	int REAL_LIKE_LIST_IS_NULL = 22707;

	/**
	 * 无此用户信息
	 */
	int NO_USER_INFO_SNS = 22708;

	/**
	 * 省ID 错误
	 */
	int PROVINCE_ID_IS_INVAL = 22709;

	/**
	 * CITY ID 错误
	 */
	int CITY_ID_IS_INVAL = 22710;

	/**
	 * JOB ID 错误
	 */
	int JOB_ID_IS_INVAL = 22711;

	/**
	 * 数据库错误
	 */
	int DB_ERROR = 22712;

	/**
	 * 昵称 冲突
	 */
	int NICK_NAME_CONFLICT = 22713;

	// modify by KF52631 廖正超 at 2011-10-20 for 09版SMU-01 req775 end

	/**
	 * 省份和城市不匹配
	 */
	int CITYID_PROVINCE_isNO = 22714;

	/**
	 * 日期格式错误
	 */
	int DATE_FORMATE_ERROR = 22715;

	// modify by 00130406 at 2011-12-3 for REQ-846 begin
	/**
	 * 能力缺少
	 */
	int TERMINALCAPABILITY_EMPTY = 22611;

	/**
	 * 品牌缺少
	 */
	int BRAND_EMPTY = 22612;

	/**
	 * 机型缺少
	 */
	int TERMINALMODELS_EMPTY = 22613;

	/**
	 * 屏宽缺少
	 */
	int SCREENWIDTH_EMPTY = 22614;

	/**
	 * 屏高缺少
	 */
	int SCREENHIGHT_EMPTY = 22615;

	/**
	 * ua缺少
	 */
	int UA_EMPTY = 22616;

	/**
	 * 分辨率缺少
	 */
	int RESOLUTION_EMPTY = 22617;

	/**
	 * 终端平台系统版本号缺少
	 */
	int SYSVERSION_EMPTY = 22618;

	/**
	 * IMSI缺少
	 */
	int IMSI_EMPTY = 22619;

	/**
	 * MIDP缺少
	 */
	int MIDP_EMPTY = 22620;

	/**
	 * CLDC缺少
	 */
	int CLDC_EMPTY = 22621;

	/**
	 * RMS缺少
	 */
	int RMS_EMPTY = 22622;

	/**
	 * HeapSize缺少
	 */
	int HEAPSIZE_EMPTY = 22623;

	/**
	 * 地级市ID不存在或者为空
	 */
	int CITYID_NOT_NULL = 22624;

	/**
	 * 省份ID不存在或者为空
	 */
	int PROVINCEID_NOT_NULL = 22625;

	// modify by 00130406 at 2011-12-3 for REQ-846 end

	// modify by lkf58416 at Nov 24, 2011 for CMR09SP1 begin
	/**
	 * CMR10 REQ-614 2011-11-21 sina微博解除绑定
	 */
	int WEIBO_UNBIND_WITH_SINA = 1008;

	// modify by lkf58416 at Nov 24, 2011 for CMR09SP1 end

	// modify by lkf58416 at Dec 5, 2011 for REQ-829 begin
	/**
	 * 无效的排序类型
	 */
	int INVOLID_SORTTYPE = 22777;

	// modify by lkf58416 at Dec 5, 2011 for REQ-829 end

	/**
	 * 人人refresh token过期
	 */
	int WEIBO_RENREN_REFESH_TOKEN_EXPIRED = 1009;

	/**
	 * 开心refresh token过期
	 */
	int WEIBO_KAIXIN_REFESH_TOKEN_EXPIRED = 1010;

	/**
	 * 页面ID为空 add by 00191583 at 2011-11-29 begin
	 */
	int WAP_PAGE_ID_IS_NULL = 22716;

	/** 页面ID为空 add by 00191583 at 2011-11-29 begin */

	/**
	 * 广告标识应该为整数
	 */
	int ADVERTISEMENT_ID_IS_NOT_INT = 22718;

	/**
	 * 无效包月订购类型
	 */
	int INVALID_MONTHPAYTYPE = 22719;

	/**
	 * 专区id为空
	 */
	int CATALOG_ID_EMPTY = 22720;

	/**
	 * 内容id列表为空
	 */
	int CONTENTID_LIST_EMPTY = 22721;

	/**
	 * iPhone客户端AppStore购买后返回的transaction中的transactionReceipt属性值为空
	 */
	int TRANSACTION_RECEIPT_IS_NULL = 22722;

	/**
	 * 专区id不存在
	 */
	int CATALOG_ID_NOT_EXIST = 22723;

	/**
	 * appStore响应成功码
	 */
	int APPSTORE_SUCCESS_CODE = 0;

	/**
	 * appstore请求失败响应吗
	 */
	int APPSTORE_FAIL_CODE = -1;

	/**
	 * 书券已送不能重复送
	 */
	int APPSTORE_TICKET_NO_REPEAT_CODE = 22724;

	/**
	 * 书券余额不足
	 */
	int TICKET_BALANCE_INSUFFICIENT = 22725;

	/**
	 * 不支持上报的支付方式
	 */
	int SUPPORT_PAY_TYPE_ILLEGEL = 22726;

	/**
	 * 产品编号不能为空
	 */
	int PRODUCT_ID_IS_NULL = 22727;

	/**
	 * 未找到相应的充值书券产品类型
	 */
	int CUCC_PRODUCT_NOT_FOUND = 22728;

	/**
	 * 联通充值书券领取失败，未区分原因
	 */
	int CUCC_GET_TICKET_ERROR = 22729;

	/**
	 * 充值确认失败
	 */
	int PAY_TICKET_FAILURE = 22730;

	/**
	 * 没有对应的充值产品信息
	 */
	int APPSTORE_PRODUCT_NOT_FOUND = 22731;

	/**
	 * 调用支付中心时，产品名称为空
	 */
	int APPSTORE_PRODUCT_NAME_NULL = 2290;

	/**
	 * 联通充值书券领取失败，sequenceId 为空
	 */
	int SEQUENCEID_IS_NULL = 22732;

	/**
	 * 联通充值书券领取失败，非联通手机号
	 */
	int CUCC_NOT_CUCC_NUMBER = 22733;

	/**
	 * 非法操作类型
	 */
	int VOTE_INVALID_OPTYPE = 22746;

	// modify by wKF50567 at Feb 29, 2012 for REQ-1148-s07 begin
	/**
	 * 测试号码不允许投票
	 */
	int VOTE_TEST_NO_FORBIDEN = 22734;

	/**
	 * 黑名单不允许投票
	 */
	int VOTE_BLACK_NO_FORBIDEN = 22735;

	/**
	 * 超过限制次数
	 */
	int VOTE_MAX_TIME = 22736;

	/**
	 * 投票失败
	 */
	int VOTE_FAILED = 22737;

	/**
	 * 无免费月票可用
	 */
	int VOTE_FREE_OUT = 22738;

	/**
	 * 列表数量超过限制
	 */
	int LIST_COUNT_OVERLIMIT = 22739;

	/**
	 * 联通号码不允许购买月票
	 */
	int VOTE_UNICOM_FORBID_BUY = 22740;

	// modify by wKF50567 at Feb 29, 2012 for REQ-1148-s07 end

	// modify by lkf58416 at 2012-2-25 for REQ-1148-Server-S06 begin
	/**
	 * 搜索的类别信息未找到
	 */
	int SEARCH_TYPE_NOT_FOUND = 22743;

	/**
	 * 作家输入的笔名为空
	 */
	int AUTHOR_PENNAME_IS_NULL = 22744;

	/**
	 * 作家类型找不到
	 */
	int AUTHOR_TYPE_IS_UNMATCHED = 22748;

	/**
	 * 作家认证状态为空
	 */
	int AUTHOR_VERIFY_STATUS_IS_NULL = 22741;

	/**
	 * 引擎返回包异常
	 */
	int SEARCH_RETRESULT_ERROR = 22742;

	// modify by lkf58416 at 2012-2-25 for REQ-1148-Server-S06 end

	/**
	 * 非法业务接入方式
	 */
	int INVALID_ACCESS_TYPE = 22745;

	/**
	 * 白名单用户免费月票不足
	 */
	int VOTE_WHITE_FREE_NOTENOUGH = 22747;

	/**
	 * 获取图书统计信息获取类型无效
	 */
	int BOOKSTATTYPE_IS_INVAL = 22748;

	// modify by lkf71455 at 2012-5-2 for 1192
	/**
	 * 站内信类型错误
	 */
	int STAGE_INNER_MESSAGE_TYPE_ERROR = 22749;

	/**
	 * 内容提供类型错误
	 */
	int CONSUPPLY_ERROR = 22800;

	/**
	 * 听书计费相关
	 */
	/**
	 * **************************************听书计费相关
	 * begin***********************************
	 */
	// 听书图书id为空或者非法
	int BOOKID_IS_INVAL = 23100;

	/**
	 * 听书tokenid为空或者非法
	 */
	int TOEKNID_IS_INVAL = 23101;

	/**
	 * 听书token鉴权失败，token不存在
	 */
	int CONTENT_TOKEN_NOT_FOUND = 24901;

	/**
	 * 听书token鉴权失败，token已过期
	 */
	int CONTENT_TOKEN_OVERDUE = 24902;

	/**
	 * **************************************听书计费相关
	 * end***********************************
	 */

	// modify by lkf71455 at 2012-5-24 for IRD-23755

	/**
	 * 接收方列表长度大于1000(数量可配置，具体可查询系统参数表)
	 */
	int SYS_STAGE_RECEIVELIST_SIZE_TOO_LARGE = 22750;

	/**
	 * 接收方列表为空
	 */
	int SYS_STAGE_RECEIVELIST_IS_NULL = 22751;

	/**
	 * 密保问题描述非法
	 */
	int QUESTION_DESCRIPTION_IS_INVALID = 22752;

	/**
	 * 密保问题答案非法
	 */
	int QUESTION_ANSWER_IS_INVALID = 22753;

	/**
	 * 密保问题不存在
	 */
	int QUESTION_NOT_EXIST = 22754;

	/**
	 * 密保设置更新数据库失败
	 */
	int SET_SECURITY_QUESTION_ERROR = 22755;

	/**
	 * 用户没有设置密保问题
	 */
	int USER_DIDNOT_SET_QUESTION_YET = 22756;

	/**
	 * 已没有验证密保的机会，请稍后再试
	 */
	int NO_CHANGE_VALID_QUESTION = 22757;

	/**
	 * 密保验证失败
	 */
	int VALID_SECURITY_QUESTION_FAILED = 22758;

	/**
	 * 用户没有设置密保问题
	 */
	int USER_NO_SECURITY_QUESTION = 22759;

	/**
	 * 更新用户密保信息失败
	 */
	int UPDATE_SECURITY_QUESTION_FAILEDINFO_ERROR = 22760;

	/**
	 * 阅读号和非手机号的用户名都为空
	 */
	int READNUM_AND_USERNAME_ALL_NONE = 22761;

	/**
	 * 非手机号的用户名为空
	 */
	int USERNAME_IS_NULL = 22762;

	/**
	 * 手机号码和飞信编号不能同时为空
	 */
	int BOTH_MSISDN_AND_FEITIONNO_IS_NULL = 22763;

	/**
	 * 亲情网不存在
	 */
	int KINSHIP_NOT_EXIST = 22764;

	/**
	 * 用户不是亲情网成员
	 */
	int MSISDN_NOT_KINSHIP = 22765;

	/**
	 * 亲情网编号为空
	 */
	int KINSHIPID_IS_NULL = 22766;

	/**
	 * 图书编号和专区编号都为空
	 */
	int BOOKID_CATALOGID_IS_NULL = 22767;

	/**
	 * 发送飞信失败
	 */
	int SEND_FETION_FAILED = 22768;

	/**
	 * 获取飞信好友信息失败
	 */
	int GET_FETION_INFO_FAILED = 22770;

	/**
	 * 分享飞信内容过长
	 */
	int SHARE_MESSAGE_TOO_LONG = 22771;

	/**
	 * 分享飞信内容不能为空
	 */
	int SHARE_MESSAGE_IS_NULL = 22772;

	/**
	 * 用户未授权（飞信侧用户鉴权失败，为非法用户）
	 */
	int USER_ILLEGAL_EXCEPTION = 22773;

	/**
	 * 该账号类型不支持书券支付
	 */
	int NO_SUPPORT_TICKET_PAY = 22789;

	/**
	 * 该账号类型不合法
	 */
	int ACCOUNTTYPE_ILLEGAL = 22789;

	/**
	 * 非移动号码不允许注册
	 */
	int NONE_CMCC_USER_CAN_NOT_REGISTER = 30130;

	/**
	 * 手机号码和用户名不能同时为空
	 */
	int REGISTER_NANE_MOBILE_BOTH_EMPTY = 30131;

	/**
	 * 非号码用户注册，用户名不能全部为数字
	 */
	int REGISTER_USER_NAME_ALL_DIGISTS = 30132;

	/**
	 * 非号码用户注册，用户名已经存在
	 */
	int REGISTER_USER_NAME_EXIST = 30133;

	/**
	 * 请求的书券类型不是整数
	 */
	int TICKET_TYPE_IS_NOT_INT = 401000;

	/**
	 * 无交叉推荐
	 */
	int CROSSRECOMMEND_NOT_FOUND = 22801;

	/**
	 * BOSS包月有效期超期
	 */
	int BOSS_MONTHPAY_OVER_MONTHS = 401010;

	/**
	 * 运营频道类型非法
	 */
	int MONTHPAY_SOURCETYPE_INVAL = 25927;

	/**
	 * 赠送日志id为空
	 */
	int PRESENT_MBLOG_ID_ISNULL = 500304;

	/**
	 * 图书id不正确
	 */
	int PRESENT_BOOK_ID_INVALID = 500305;

	/**
	 * 赠送渠道不正确
	 */
	int PRESENT_CHANNEL_ID_INVALID = 500306;

	/**
	 * 赠送产品号为空
	 */
	int PRESENT_PRODUCT_ID_ISNULL = 500310;

	/**
	 * 赠送人数不合法
	 */
	int PRESENT_AMOUNT_ID_INVALID = 500311;

	/**
	 * 查无赠送日志记录
	 */
	int NO_FAMOUS_PRESENT_RECORD = 500308;

	/**
	 * 赠送日志不含该渠道
	 */
	int RECEIVE_CHANNEL_NOT_IN_RECORD = 500309;

	/**
	 * 图书已领完
	 */
	int NO_PRESENT_BOOK_LEFT = 500303;

	/**
	 * 图书不是按本计费
	 */
	int CHARGE_MODE_NOT_BOOK = 500312;

	/* ******139邮箱***start************* */

	/**
	 * 139邮箱用户已开通
	 */
	int EMAIL139_USER_IS_OPEN = 500321;

	/**
	 * 139邮箱用户未开通
	 */
	int EMAIL139_USER_IS_NOT_OPEN = 500322;

	/**
	 * 139邮箱服务器忙
	 */
	int EMAIL139_SERVER_IS_BUSY = 500313;

	/**
	 * 139邮箱连接不到数据库
	 */
	int EMAIL139_CAN_NOT_CONNECT_DB = 500314;

	/**
	 * 139邮箱开户ServiceCode非法
	 */
	int EMAIL139_SERVICECODE_IS_NOT_CORRECT = 500317;

	/**
	 * 139邮箱黑名单用户
	 */
	int EMAIL139_USER_IN_BLACKLIST = 500318;

	/**
	 * 139邮箱访问频率超出上限
	 */
	int EMAIL139_VISIT_OUT_LIMIT = 500319;

	/**
	 * 139邮箱流量超出上限
	 */
	int EMAIL139_FLOW_OUT_LIMIT = 500320;

	/** *********************** 书券包月begin *************************** */
	/**
	 * 该包月产品不支持移动BOSS支付
	 */
	int PRODUCT_NO_SUPPORT_BOSS = 50001;

	/**
	 * 包月订购记录的支付方式非移动BOSS支付
	 */
	int SUBSCRIBE_NO_SUPPORT_BOSS = 50002;

	/**
	 * 未适配到包月支付方式
	 */
	int NONE_PAYMENT = 50003;

	/**
	 * 支付方式不是从请求而来，但是适配到了appstore支付或ESOP支付
	 */
	int UNEXPECTED_PAYTYPE = 209706;

	/**
	 * 不能给白名单用户赠送预缴包月
	 */
	int PRESENT_WHITE_FAIL = 209707;

	/** *********************** 书券包月end *************************** */

	/**
	 * APPKEY 为空
	 */
	int APPKEY_IS_NULL = 41000;

	/**
	 * 应用信息不存咋
	 */
	int APP_INFO_IS_NOT_EXISTS = 41001;

	/**
	 * IP格式错误
	 */
	int IP_FORMAT_ERROR = 41002;

	/**
	 * 授权码无效
	 */
	int SSO_CODE_INVALID = 41003;

	/**
	 * 随机码为空
	 */
	int RANDOM_CODE_IS_NULL = 41004;

	/**
	 * 随机码无效
	 */
	int RANDOM_CODE_INVALID = 41005;

	/**
	 * 参数(是否直接查询数据库)错误
	 */
	int DIRECTQRYDB_PARAM_INVALID = 22802;

	/** *********************** 手机报纸begin *************************** */

	/**
	 * 隐藏属性参数非法
	 */
	int ISHIDDEN_PARAM_INVALID = 315001;

	/**
	 * 没有更新数据
	 */
	int NO_RECORD_UPDATED = 315002;

	/**
	 * 存在非法的显示顺序参数
	 */
	int DISPLAYORDER_PARAM_INVALID = 315003;

	/**
	 * 地域ID参数为空
	 */
	int LOCALID_PARAM_ISNULL = 315004;

	/**
	 * 是否查询订购参数非法
	 */
	int ISSUBSCRIBE_PARAM_INVALID = 315005;

	/**
	 * 手机报纸订购参数不合法
	 */
	int NEWSPAPER_SUB_PARAM_INVALID = 25930;

	/**
	 * 手机报纸平台订购返回失败
	 */
	int NEWSPAPER_SUB_FAIL = 25931;

	/**
	 * 手机报纸退订参数不合法
	 */
	int NEWSPAPER_UNSUB_PARAM_INVALID = 25932;

	/**
	 * 手机报纸平台退订返回失败
	 */
	int NEWSPAPER_UNSUB_FAIL = 25933;

	/**
	 * 非订购中，无法确认订购
	 */
	int NOT_TOEFFECTIVE_CANNOT_CFMSUB = 25934;

	/**
	 * 非退订中，无法确认退订
	 */
	int NOT_TOCANCELE_CANNOT_CFMUNSUB = 25935;

	/**
	 * 主业务代码无关联，所以无法发起主业务代码退订
	 */
	int NO_PRIMARY_SERVID_CANNOT_UNSUB = 25936;

	/**
	 * 副业务代码无关联，所以无法发起副业务代码退订
	 */
	int NO_SLAVE_SERVID_CANNOT_UNSUB = 25937;

	/**
	 * 订购失败，不允许退订
	 */
	int FAILER_CANNOT_UNSUB = 25938;

	/**
	 * 暂时不支持查询外国的地域信息
	 */
	int DOT_SUPPORT_FORIGN_COUNTRY = 26666;

	/** *********************** 手机报纸end *************************** */

	/* ******用户订阅信息***start************* */
	/**
	 * 用户已预订购
	 */
	int USER_HAVE_SUBSCRIBE = 38000;

	/**
	 * 更新订阅关系失败
	 */
	int USER_UPDATE_SUBSCRIBE = 38001;

	/**
	 * 新增订阅关系失败
	 */
	int USER_ADD_SUBSCRIBE = 38002;

	/**
	 * 品牌ID不存在
	 */
	int NEWSPAPER_NOT_EXIST = 38003;

	/**
	 * 删除用户订阅关系不存在 39000
	 * 
	 */
	int DELETE_SUBSCRIBE_RELATIONSHIP_NOTEXIST = 39000;

	/**
	 * 删除用户订阅关系状态无效
	 */
	int DELETE_SUBSCRIBE_RELATIONSHIP_INVALIDSTATE = 39001;

	/**
	 * 删除订购关系失败
	 */
	int DELETE_SUBSCRIBE_BUY_RELATIONSHIP_FAILURE = 39002;

	/**
	 * 更新订阅关系失败
	 */
	int DELETE_SUBSCRIBE_RELATIONSHIP_FAILURE = 39003;

	/**
	 * appstore包月订购确认失败
	 */
	int CONFIRM_APPSTORE_SUBSCRIBE_FAILURE = 39005;

	/* ******用户订阅信息***end************* */

	/**
	 * 用户已经绑定了支付移动号码
	 */
	int USER_HAD_BINDED_TELENUMBER = 59000;

	/**************** RDO start ***********************/
	/**
	 * RDO MCP编码为空
	 */
	int RDO_MCP_ID_ISNULL = 188801;

	/**
	 * RDO计费代码为空
	 */
	int RDO_FEECODE_ISNULL = 188802;

	/**
	 * RDO订单号为空
	 */
	int RDO_ORDERNO_ISNULL = 188803;

	/**
	 * RDO订单请求时间为空
	 */
	int RDO_REQTIME_ISNULL = 188804;

	/**
	 * RDO摘要为空
	 */
	int RDO_SUMMARY_ISNULL = 188805;

	/**
	 * 无RDO信息或RDO计费代码信息
	 */
	int NO_RDO_FEECODE_INFO_FOUND = 188806;

	/**
	 * RDO订单请求时间过期
	 */
	int RDO_REQTIME_EXPRIRED = 188807;

	/**
	 * RDO订单已支付，鉴权失败
	 */
	int RDO_ORDER_HASPAY = 188808;

	/**
	 * RDO摘要不匹配
	 */
	int RDO_SUMMARY_NOTMATCH = 188809;

	/**
	 * RDO计费代码未审核
	 */
	int RDO_FEECODE_UNAUDIT = 188810;

	/**
	 * RDO计费代码未上线
	 */
	int RDO_FEECODE_DOWNLINE = 188811;

	/**
	 * RDO验证码为空
	 */
	int RDO_VERIFYCODE_ISNULL = 188812;

	/**
	 * RDO验证码已过期
	 */
	int RDO_VERIFYCODE_EXPRIERED = 188813;

	/**
	 * RDO验证码错误
	 */
	int RDO_VERIFYCODE_ERROR = 188814;

	/**
	 * RDO手机号已被锁定
	 */
	int RDO_VERIFYCODE_NUMLOCKED = 188815;

	/**
	 * 没有RDO订单信息
	 */
	int NO_RDO_ORDER_INFO = 188816;

	/**
	 * RDO支付失败
	 */
	int RDO_PAY_ERROR = 188817;

	/**
	 * RDO设置类型不正确
	 */
	int RDO_SETTYPE_ERROR = 188818;

	/**
	 * RDO验证类型不正确
	 */
	int RDO_VERIFYTYPE_ERROR = 188819;

	/**************** RDO end ***********************/

	/**************** RDO end ***********************/

	/**
	 * 用户没有绑定支付移动号码
	 */
	int USER_HAD_NOT_BIND_TELENUMBER = 59001;

	/**
	 * 移动用户不能绑定支付移动手机号
	 */
	int CMCC_CAN_NOT_BIND_CMCC = 59002;

	/**
	 * 用户忽略类型为空
	 */
	int USER_IGNORE_TYPE = 59003;

	/**
	 * 没有找到该事务和短信验证码详细信息
	 */
	int TXID_SMSCODE_ISNOTEXIST = 59004;

	/**
	 * 验证码或事务已过期或已使用
	 */
	int SMSCODE_EXPIRETIME = 59005;

	/**
	 * 点播类型为空
	 */
	int MESSAGETYPE_NULL = 59006;

	/**
	 * 计费类型不合法
	 */
	int CHARGE_MODE_INVALID = 21701;

	/**
	 * 验证码类型为空
	 */
	int VERFIY_CODE_IS_NULL = 59009;

	/**
	 * 验证码或事务id为空
	 */
	int VERFIY_CODE_TXID = 59010;

	/**
	 * 更新事务id失败
	 */
	int UPDATE_TXID_FAIL = 59011;

	/**
	 * 短信提示语为空
	 */
	int REG_USER_MESSAGE_VALUE_NULL = 59012;

	/**
	 * 第三方账户类型为空
	 */
	int THIRD_PARTY_TYPE_VALUE_NULL = 59013;

	/**
	 * 章节ID格式不合法
	 */
	int CHAPTER_ID_FORMAT_ERROR = 22043;

	/**
	 * 图书ID格式不合法
	 */
	int BOOKID_ID_FORMAT_ERROR = 22044;

	/**
	 * 借阅月数为空
	 */
	int BORROWMONTHS_IS_NULL = 22634;

	/**
	 * 请求消息发布实体的域名为空
	 */
	int ASDOMAIN_IS_NULL = 22635;

	/**
	 * 目标业务平台标识issuer为空
	 */
	int DESTISSUER_IS_NULL = 22636;

	/**
	 * 需要解析的凭证值为空
	 */
	int ARTIFACT_IS_NULL = 22637;

	/**
	 * 短地址为空
	 */
	int SHORT_URL_NULL = 61000;

	/**
	 * 短地址格式错误
	 */
	int SHORT_URL_FORMAT_ERROR = 61001;

	/**
	 * 标签ID为空或为非数字
	 */
	int TAGID_IS_NULL = 59050;

	/**
	 * 保存用户和TOKEN对应关系入库失败
	 */
	int SAVE_MSISDN_TOKEN_FAIL = 59014;

	/**
	 * TOKEN为空
	 */
	int TOKEN_IS_NULL = 59015;

	/**
	 * 更新推荐消息状态失败
	 */
	int SAVE_RECOMMEND_MSG_STATUS = 59016;

	/**
	 * 推荐消息ID不存在
	 */
	int RECOMMEND_MSG_ID_IS_NOT_EXISTS = 59017;

	/**
	 * 帐号已锁定
	 */
	int ACCOUNT_LOCKED = 59018;

	/**
	 * 帐号锁定失败
	 */
	int LOCK_ACCOUNT_FAILURE = 59019;

	/**
	 * 没有查询到指定图书的用户投月票信息
	 */
	int MONTICKETDETAIL_LIST_IS_NULL = 201301;

	/**
	 * 查询投月票关联图书列表,该用户没有对其他书投过月票
	 */
	int MONTICASSOCIATEBOOK_LIST_IS_NULL = 201302;

	/**
	 * 未查询到指定用户投票记录
	 */
	int TICKETDETAILBYMSISDN_LIST_IS_NULL = 201303;

	/**
	 * 活动结束
	 */
	int ACTIVITY_END = 59020;

	/**
	 * 活动未开始
	 */
	int ACTIVITY_NOT_START = 59021;

	/**
	 * 抽奖频率过高
	 */
	int LOTTERY_RATE_HIGH = 286100;

	/**
	 * 系统异常
	 */
	int SYSTEM_ANOMALY = 59022;

	/**
	 * 口令验证无效
	 */
	int INVALID_PASSWORD = 59023;

	/**
	 * 非CM
	 */
	int NOT_CM = 59024;

	/**
	 * 参数不合法
	 */
	int PARAMETER_NOT_VALID = 59025;

	/**
	 * IP匹配失败
	 */
	int IP_MATCH_FAILURE = 59026;

	/**
	 * 奖品ID为空
	 */
	int AWARDID_IS_NULL = 59060;

	/**
	 * 业务线中奖记录ID为空
	 */
	int SITEMARK_IS_NULL = 59061;

	/**
	 * 业务线ID为空
	 */
	int SITEID_IS_NULL = 59062;

	/**
	 * 从飞信侧获取不到返回码
	 */
	int RESULTCODE_IS_NULL = 59063;

	/**
	 * 用户学分不够
	 */
	int USERSCORE_NOT_ENOUGH = 59064;

	/**
	 * 业务线中奖记录为空
	 */
	int AWARD_TIME_IS_NULL = 59065;

	/**
	 * token鉴权失败
	 */
	int TOKENAUTHENTICATE_FAILED = 24515;

	/**
	 * token校验失败
	 */
	int TOKEN_VALIDATE_FAILD = 22911;

	/**
	 * 企业赠送借阅的借阅时间必须大于零
	 */
	int BUSNIESSBORROW_BORROWTIME_INVALID = 59065;

	/**
	 * 企业赠送借阅borrowTimeType、borrowTime参数必须同时为空或同时不为空
	 */
	int BUSNIESSBORROW_PARAM_INVALID = 59066;

	/**
	 * 内容类型和bookIdList均为空
	 */
	int BOOKBATCH_IS_NULL = 188820;

	/**
	 * 用户找所有人代付所有图书次数超过限制
	 */
	int ALL_PAY_BOOKS_COUNT = 228601;

	/**
	 * 找某一人代付次数超过限制
	 */
	int ONE_PEOPLE_PAY_COUNT = 228602;

	/**
	 * 找不同人代付某一本书次数超过限制
	 */
	int DEFERENT_PEOPLE_PAY_BOOK_COUNT = 228603;

	/**
	 * 同一个用户接收到代付请求次数超过限制
	 */
	int SAME_USER_APPLY_BOOK_COUNT = 228604;

	/**
	 * 本书鉴权成功，不需要请求他人代付
	 */
	int N0_PAY = 228605;

	/**
	 * 代付人不接受代付
	 */
	int PAY_IS_NOT_ACCEPT = 228606;

	/**
	 * 代付时间已过期
	 */
	int PAY_TIME_OVERDUE = 228607;

	/**
	 * 已有人代付
	 */
	int HAVE_PAY = 228608;

	/**
	 * 根据流水号与代付人在表中查询无此记录
	 */
	int NO_RECORDS = 228609;

	/**
	 * 图书信息不存在
	 */
	int BOOK_UN_EXIST = 228610;

	/**
	 * 图书内容鉴权异常
	 */
	int BOOK_AUTHORITY_ERROR = 228611;

	/**
	 * 代付拒绝成功
	 */
	int PAYMENT_REFUSE_SUCCESS = 228613;

	/**
	 * 代付重复拒绝
	 */
	int PAYMENT_REPEAT_REFUSE = 228614;

	/**
	 * 代付后拒绝
	 */
	int AFTER_PAYMENT_REFUSE = 228615;

	/**
	 * 代付失效
	 */
	int PAYMENT_VALID_REFUSE = 228616;

	/**
	 * 提交/代付失败
	 */
	int PAYMENT_IS_FAIL = 228612;

	/**
	 * 请求人不能找自己代付
	 */
	int NO_PAY_FOR_SELF = 228617;

	/**
	 * 留言字数不能超过1024
	 */
	int leaveWord_EXCEEDS_LIMIT = 228618;

	/**
	 * 请求人已为黑名单用户，不能找他人代付了
	 */
	int BLACK_NUM_NOT_APPLY = 228619;

	/**
	 * 代付人是否接受参数不合法
	 */
	int PAY_ACCEPT_PARAMETER_NOT_VALID = 228620;

	/**
	 * 代付人接受/拒绝参数不能为空
	 */
	int PAY_ACCEPT_PARAMETER_IS_NULL = 228621;

	/**
	 * 流水号不能为空
	 */
	int SEQNO_ACCEPT_PARAMETER_IS_NULL = 228622;

	/**
	 * 代付人手机号不能为空
	 */
	int PAY_MSISDN_PARAMETER_IS_NULL = 228623;

	/**
	 * 门户参数不能为空
	 */
	int PORTAL_TYPE_PARAMETER_IS_NULL = 228624;

	/**
	 * 登陆方式不能为空
	 */
	int LOGIN_MODE_IS_NULL = 228625;

	/**
	 * 支付平台不能为空
	 */
	int PAYMENT_PLATFORM_IS_NULL = 50000;

	/**
	 * 支付流水号不能为空
	 */
	int PAY_SERIALID_IS_NULL = 50102;

	/**
	 * 根据发起方查询不到请求记录
	 */
	int APPLY_LIST_IS_NULL = 228626;

	/**
	 * 根据代付方查询不到代付记录
	 */
	int PAY_LIST_IS_NULL = 228627;

	/**
	 * 请求人手机号不能为空
	 */
	int APPLY_MSISDN_PARAMETER_IS_NULL = 228628;

	/**
	 * 插入促销包事务失败
	 */
	int INSERT_PROM_BAG_TRANS_FAIL = 225600;

	/**
	 * 促销包事务ID为空
	 */
	int TRANSID_IS_NULL = 225601;

	/**
	 * 促销包事务查询为空
	 */
	int QUERY_TRANS_INFO_NULL = 225602;

	/**
	 * 促销包事务更新失败
	 */
	int UPDATE_TRANS_STATUS_FAIL = 225603;

	/**
	 * 用户支持列表不支付
	 */
	int USERPAYTYPE_NOT_SUPPOTT = 262266;

	/**
	 * 按本计费书籍不能够一键订购
	 */
	int CHARGE_MODE_BOOK_NOT_SUPPORT_ALLPURCHASE = 262267;

	/**
	 * stoken和tpAuthToken必须有一个不为空
	 */
	int STOKEN_TPTOKEN_BOTH_EMPTY = 26958;

	/**
	 * tpAuthToken鉴权失败
	 */
	int TPTOKEN_AUTH_FAIL = 26960;

	/**
	 * 客户端内置密码未找到
	 */
	int PASSCODE_NOT_FOUND = 26961;

	/**
	 * token不匹配
	 */
	int TOKEN_NOT_MATCHED = 26962;

	/**
	 * stoken鉴权失败
	 */
	int STOKEN_AUTH_FAIL = 26963;

	/**
	 * 猜你喜欢BI推荐 获取图书作家类型不合法
	 */
	int RECOMMENDTYPE_NOT_SUPPOTT = 263301;

	/**
	 * 猜你喜欢BI推荐删除 参数图书ID为空
	 */
	int RECOMMEND_BOOKID_NULL = 263300;

	/**
	 * 该书没有推荐给该用户或系统中没有该书
	 */
	int RECOMMEND_HAS_NOBOOK_ERROR = 263302;

	/**
	 * 小于最小推荐个数无法删除
	 */
	int RECOMMEND_DEL_LESSTH_MIN = 263303;

	/**
	 * 订单ID为空
	 */
	int ORDER_ID_ISNULL = 22231;

	/**
	 * 无效的订单id
	 */
	int ORDER_ID_IS_INVALID = 24232;

	/**
	 * 姓名为空
	 */
	int NAME_IS_NULL = 22232;

	/**
	 * 地址为空
	 */
	int ADDRESS_IS_NULL = 22233;

	/**
	 * 联系电话为空
	 */
	int CONTACT_IS_NULL = 22234;

	/**
	 * 营销参数为空
	 */
	int PARAMETERID_IS_NULL = 20101;

	/**
	 * 没有与营销参数对应的渠道id
	 */
	int NO_CHANNELID = 20102;

	/**
	 * 图书借阅排行榜周期类型不正确
	 */
	int RANK_BORROW_RANKDATETYPE_NOT_RIGHT = 12002;

	/**
	 * 图书借阅排行榜查询书籍类型不正确
	 */
	int RANK_BORROW_BOOKTYPE_NOT_TIGHT = 12003;

	/**
	 * 即时抽奖活动ID为空
	 */
	int INSTANT_LOTTERY_ACTIVITY_ID_NULL = 27100;

	/**
	 * 通用变更接口TYPE为空
	 */
	int COMMONCHANGE_TYPE_NULL = 27000;

	/**
	 * 通用变更接口KEY为空
	 */
	int COMMONCHANGE_KEY_NULL = 27050;

	/**
	 * 开通或取消借阅提醒类型为空
	 */
	int OPENORCLOSE_TYPE_IS_NULL = 201609;

	/**
	 * 产品不支持ESOP支付
	 */
	int PRODUCT_NO_SUPPORT_ESOP = 50004;

	/**
	 * 非行业赠送不允许指定ESOP支付
	 */
	int NO_SUPPORT_ESOP = 50005;

	/**
	 * 续订时，状态不是已订购
	 */
	int SUB_RENEW_STATUS_NOT_EFFECT = 209700;

	/**
	 * 续订时，subscribeenddate 或 startchargedate 为空
	 */
	int SUB_RENEW_DATE_NULL = 209701;

	/**
	 * 续订时，不是最后一个月
	 */
	int SUB_RENEW_NOT_LAST_MONTH = 209702;

	/**
	 * 续订时，包月类型不支持
	 */
	int SUB_RENEW_SUBTYPE_NOT_SUPPORT = 209703;

	/**
	 * 续订失败
	 */
	int SUB_RENEW_FAIL = 209704;

	/**
	 * 赠阅时，计费号码和使用号码必须不相同
	 */
	int PRESENT_MOBILE_MUST_NOT_EQUALS = 21112;

	/**
	 * 赠阅时，赠阅月数不合法，必须大于等于1且小于等于最大赠阅月数
	 */
	int PRESENT_MONTHS_IS_WRONG = 21113;

	/**
	 * 赠阅时，赠阅留言字数必须小于等于60
	 */
	int PRESENT_MESSAGE_IS_WRONG = 21114;

	/**
	 * 赠阅时，赠阅到期时间超过了包月产品到期时间
	 */
	int PRESENT_UNEFFTIME_AFTER_PRODUCTTIME = 21115;

	/**
	 * 赠阅时，赠阅产品为手机报产品时，使用号码必须为移动号码
	 */
	int PRESENT_USERMOBILE_IS_WRONG = 21116;

	/**
	 * 接口名为空，或传入了不支持的接口名
	 */
	int PAY_ORDER_METHODNAME_ILLEAGL = 242950;

	/**
	 * 传入的支付金额不合法
	 */
	int PAY_ORDER_PAYMONEY_ILLEAGL = 242951;

	/**
	 * 临时订单保存失败
	 */
	int PAY_ORDER_SAVE_FAILED = 242952;

	/**
	 * 请求中的订购请求不正确
	 */
	int PAY_ORDER_REQUEST_ERROR = 242953;

	/**
	 * 发送请求过快，超过系统设置的最低时间
	 */
	int PAY_ORDER_TOO_FAST = 242954;

	/**
	 * 充值临时订单已经不存在，或已处理
	 */
	int PAY_ORDER_NOT_EXIST = 242955;

	/**
	 * 此接入方式不支付ESOP支付方式
	 */
	int PORTAL_NOT_SUPPORT = 270000;

	/**
	 * 非移动号码书券余额不足
	 */
	int NOT_CMCC_NO_TICKET = 270001;

	/**
	 * 在线还是下载为空
	 */
	int ONLINEORDOWNLOAD_IS_NULL = 270002;

	/**
	 * 借阅不成功原因：内容鉴权通过
	 */
	int BORROW_FAILED_CAUSE_AUTHENTICATEPASS = 201600;

	/**
	 * 非图书(图书类型不为图书)
	 */
	int BOOKTYPE_IS_NOT_BOOK = 201601;

	/**
	 * 活动ID为空
	 */
	int ACTIVITY_ID_IS_NULL = 262269;

	/**
	 * 活动规则不适配
	 */
	int NOT_ACTIVEADAPTATION = 262270;

	/**
	 * 门户类型不是UESWAP门户
	 */
	int PORTALTYPE_IS_NOT_UESWAP = 262271;

	/**
	 * 互动积分异常
	 */
	int INTEGRAL_EXCEPTION = 262272;

	/**
	 * 超出单用户抽奖上限
	 */
	int EXCEED_DRAWNUMBER_COUNT = 262273;

	/**
	 * 超出日抽奖上限
	 */
	int EXCEED_DRAWNUMBER_DAYCOUNT = 262274;

	/**
	 * 超出月抽奖上限
	 */
	int EXCEED_DRAWNUMBER_MONTHCOUNT = 262275;

	/**
	 * 超出总抽奖上限
	 */
	int EXCEED_DRAWNUMBER_TOTALCOUNT = 262276;

	/**
	 * 不在活动期间内
	 */
	int NOT_DRAWACTIVITY_DATE = 59020;

	/**
	 * 用户积分不够
	 */
	int NO_CONSUMESCORE = 262277;

	/**
	 * 没有获取到活动信息
	 */
	int NOT_FINDACTIVITYINFO = 262278;

	/**
	 * 有无分册输入不合法
	 */
	int ISFASCICLE_ISERROR = 262279;

	/**
	 * 在线/下载非法输入
	 */
	int ONLINEORDOWNLOAD_ISERROR = 262280;

	/**
	 * 偏移量非法
	 */
	int POSITION_IS_ERROR = 262281;

	/**
	 * 是否完成非法
	 */
	int ISFINISH_IS_ERROR = 262282;

	/**
	 * 超出书签最大数或者传入想通过bookid
	 */
	int CHECK_IS_ERROR = 233501;

	/**
	 * appId为空
	 */
	int APPID_IS_NULL = 239800;

	/**
	 * uid为空
	 */
	int UID_IS_NULL = 239801;

	/**
	 * token为空
	 */
	int THIRD_TOKEN_IS_NULL = 239802;

	/**
	 * accessToken为空
	 */
	int THIRD_ACCESSTOKEN_IS_NULL = 239803;

	/**
	 * 无效的访问令牌
	 */
	int THIRD_ACCESSTOKEN_IS_INVALID = 239804;

	/**
	 * 访问令牌已过期
	 */
	int THIRD_ACCESSTOKEN_IS_OVERDUE = 239805;

	/**
	 * 同步订单：第三方购买时间参数为空
	 */
	int THIRD_SUBSCRIBETIME_IS_NULL = 239806;

	/**
	 * 同步订单：订购类别只支持订购
	 */
	int THIRD_PAYTYPE_IS_NULL = 239807;

	/**
	 * 同步订单：总价参数不合法
	 */
	int THIRD_FEE_IS_NULL = 239808;

	/**
	 * 同步订单：图书类型不合法
	 */
	int THIRD_ITEMTYPE_INVALID = 239809;

	/**
	 * 同步订单：图书id不在渠道书单中
	 */
	int THIRD_BOOK_NOTOPEN = 239810;

	/**
	 * 同步订单：话费支付时不允许批量订购
	 */
	int MOBILE_NUMBER_PAYMENT_INVALID = 239811;

	/**
	 * 图书为免费图书
	 */
	int BOOK_FREE = 239812;

	/**
	 * 不符合代订购条件,超出N分钟
	 */
	int AGENTPURCHASE_TIMEOUT = 239813;

	/**
	 * 不符合代订购条件,超出M次
	 */
	int AGENTPURCHASE_EXCEEDED_NUMBER = 239814;

	/**
	 * 代订购：阅读号为空
	 */
	int AGENTPURCHASE_MSISDN_IS_NULL = 239815;

	/**
	 * appkey与支付方式不匹配
	 */
	int APPKEY_AND_SUPPORTPAYTYPES_MISMATCH = 239816;

	/**
	 * 没有appkey对应的数据或appkey对应的数据不匹配
	 */
	int APPKEY_NO_DATA_OR_MISMATCH = 239817;

	/**
	 * 日期类型必须为YYYYMMDDHHMMSS格式
	 */
	int DATA_NOT_YYYYMMDDHHMMSS = 239818;

	/**
	 * 用户登陆方式非法
	 */
	int LOGINTYPE_INVALID = 239819;

	/**
	 * 网络接入类型非法
	 */
	int BEARTYPE_INVALID = 239820;

	/**
	 * 访问类型 非法
	 */
	int VISITTYPE_INVALID = 239821;

	/**
	 * 门户类型非法
	 */
	int PORTALTYPE_INVALID = 239822;

	/**
	 * 运营频道类型 非法
	 */
	int SOURCETYPE_INVALID = 239823;

	/**
	 * 代订购执行失败
	 */
	int AGENTPURCHASE_FAILED = 239824;

	/**
	 * 计费模式对应的图书不一致
	 */
	int CHARMODE_BOOK_NOT_MATCH = 239825;

	/**
	 * 开始时间不能大于结束时间
	 */
	int BEGINTIME_NOT_AFTER_ENDTIME = 239826;

	/**
	 * 用户可用借阅券的总数和最早的到期时间为空
	 */
	int COUNT_AND_EARLISTTIME_ISNULL = 239827;

	/**
	 * accessType类型错误
	 */
	int ACCESS_TOKEN_TYPE_ERROR = 239828;

	/**
	 * 道具书券不能为收费类型（书券配置不正确）"
	 */
	int TICKET_INVALID = 239829;

	/**
	 * 获取作家福利明细：请求参数不合法
	 */
	int BENEFITTYPE_ISERROR = 239831;

	/**
	 * useType不合法
	 */
	int INVALID_USETYPE = 264138;

	/**
	 * 默认支付方式不合法
	 */
	int RECHARWAY_NOT_VALID = 233502;

	/**
	 * 投票字段不是1到100的整数
	 */
	int MONTH_TICKET_NOT_VALID = 20016;

	/**
	 * 单次话费打赏超上限
	 */
	int REWARD_BOOK_BY_FEE_SINGLE_CEIL = 36001;

	/**
	 * 单日话费打赏超上限
	 */
	int REWARD_BOOK_BY_FEE_DAY_CEIL = 36002;

	/**
	 * 图书现金打赏时金额超限
	 */
	int REWARD_BOOK_BY_MONEY_OVER_LIMIT = 36003;

	/**
	 * 打赏图书id不存在
	 */
	int REWARD_BOOK_BOOK_ID = 36004;

	/**
	 * 图书无打赏记录
	 */
	int BOOK_NO_REWARD_RECORD = 36008;

	/**
	 * 订单对应手机号与当前用户手机号不一致
	 */
	int MSISDN_NOT_MATCH = 26964;

	/**
	 * 订单号为空
	 */
	int ORDERID_IS_NULL = 26966;

	/**
	 * 支付方式是联通类型支付手机号不是联通的
	 */
	int PAYMSISDN_IS_CUCC_BUT_RECHARGEWAY_IS_CTCC = 36005;

	/**
	 * 充值金额对应的计费信息不存在
	 */
	int NOT_FIND_FREECODE = 36006;

	/**
	 * 移动支付订购支付号码为空
	 */
	int PAYMSISDN_IS_NULL = 242902;

	/**
	 * 移动支付订购支付金额不合法
	 */
	int CHARGE_AMOUNT_INVALID = 242903;

	/**
	 * 移动充值实际金额不合法
	 */
	int ACTUAL_MONEY_INVALID = 242904;

	/**
	 * 移动充值订购验证码为空
	 */
	int VERICODE_IS_NULL = 242905;

	/**
	 * 移动充值订购失败
	 */
	int RECHARGE_FAIL = 242906;

	/**
	 * 移动充值验证码不合法
	 */
	int VERICODE_INVALID = 242907;

	/**
	 * 验证码类型不正确
	 */
	int VERICODE_TYPE_INVALID = 242909;

	/**
	 * 打赏请求类型不合法
	 */
	int REWARD_TYPE_INVALID = 36010;

	/**
	 * 书单表中没有该图书
	 */
	int BOOK_NOTEXIST_BOOKLIST = 242908;

	/**
	 * 已绑定且token有效时间有效
	 */
	int TOKEN_IS_VALID = 242900;

	/**
	 * 淘宝产品ID为空
	 */
	int TAO_BAO_PRODUCT_ID_IS_NULL = 20698;

	/**
	 * 屏蔽图书不能打赏
	 */
	int SHIELD_BOOK_COULD_NOT_REWARD = 36033;

	/**
	 * 网络连接错误
	 */
	int NETWORK_ERROR = 38701;

	/**
	 * 沃平台返回错误
	 */
	int WO_ERROR = 38999;

	/**
	 * 作家查询参数不合法
	 */
	int AUTHOR_PARAM_INVALID = 28019;

	/**
	 * 查询类型不合法
	 */
	int SERCH_TYPE_INVALID = 239001;

	/**
	 * 图书id为空
	 */
	int BOOK_ID_IS_NULL = 239002;

	/**
	 * 关联id类型为空
	 */
	int REL_TYPE_IS_NULL = 239003;

	/**
	 * 手机号已被绑定且状态正常，不用绑定
	 */
	int IS_BINDED = 239008;

	/**
	 * 行业批量注册登陆类型错误
	 */
	int INDUSTRY_LOGIN_TYPE_IS_WRONG = 800050;

	/**
	 * 抽奖id不合法
	 */
	int LOTTERYID_INVALID = 270100;

	/**
	 * 查询类型不能为空
	 */
	int QUERY_TYPE_IS_NULL = 239009;

	/**
	 * 查询类型非法
	 */
	int QUERY_TYPE_INVALID = 239010;

	/**
	 * 行业批量注册保存用户信息失败
	 */
	int INDUSTRY_BATCH_UPDATE_USERINFOMATION_FAIL = 800051;

	/**
	 * 旧属性值错误
	 */
	int OLD_VALUE_INVALID = 239055;

	/**
	 * 新属性值错误
	 */
	int NEW_VALUE_INVALID = 239056;

	/**
	 * 新属性与旧属性值相同
	 */
	int THE_NEW_VALUE_IS_SAME_OLD = 239057;

	/**
	 * 打赏榜的日榜不存在
	 */
	int RANK_PARAM_TYPE_DAY_INVALID = 251102;

	/**
	 * 用户已存在领取记录
	 */
	int USER_HAS_RECIVED_RECORD = 500001;

	/**
	 * 流量包类型不正确
	 */
	int TRAFFICPARCKET_NOT_VALID = 500002;

	/**
	 * 号码非指定区域指定运营商动号码
	 */
	int MOBILE_NOT_VALID = 500003;

	/**
	 * 用户非包月用户或者包月权益已失效
	 */
	int USER_MONTH_PAY_NOT_VALID = 500004;

	/**
	 * 手机号码和事务ID不能同时为空
	 */
	int MSISDN_AND_TSID_IS_NULL = 700021;

	/**
	 * 超过最大领取次数
	 */
	int IS_MAX_RECIVE_NUM = 500005;

	/**
	 * 作家列表为空
	 */
	int AUTHOR_LIST_EMPTY = 28020;

	/**
	 * 接入IP非法
	 */
	int IP_INVALID = 262282;

	/**
	 * 非法接入方，无效的appId
	 */
	int APPID_INVALID = 262283;

	/**
	 * 摘要验证错误
	 */
	int DIGESTSTR_INVALID = 262284;

	/**
	 * 已达到每秒发送用户数上限
	 */
	int OVERSTEP_SECOND_COUNT = 262285;

	/**
	 * 已达到每日发送用户数上限
	 */
	int OVERSTEP_DAY_COUNT = 262286;

	/**
	 * VGOP通行证查询操作类型不是0
	 */
	int OPER_TYPE_IS_WRONG = 500006;

	/**
	 * VGOP通行证查询用户名为空
	 */
	int USER_ACCOUNT_IS_NULL = 500007;

	/**
	 * VGOP通行证用户名类型为空
	 */
	int ACCOUNT_TYPE_IS_NULL = 500008;

	/**
	 * 操作人为空
	 */
	int ACTION_USER_IN_NULL = 248501;

	/**
	 * 退订包月失败
	 */
	int UNSUBSCRIBE_IS_FAIL = 248502;

	/**
	 * 存在无法退订的包月
	 */
	int UNSUBSCRIBE_IS_NOT_NULL = 248503;

	/**
	 * 删除预定更新/删除用户信息失败
	 */
	int DEL_SCHEDULEUPDATE_OR_USERINFO_IS_FAIL = 248504;

	/**
	 * 获取用户流量失败
	 */
	int QUERY_FLOW_FAIL = 242450;

	/**
	 * 账户状态不正确
	 */
	int ACCOUNT_STATUS_IS_FAIL = 248505;

	/**
	 * mobile类型非法
	 */
	int MOBILE_IS_FAIL = 248506;

	/**
	 * 业务接入方式请求非法
	 */
	int ACCESSTYPE_IS_FAIL = 248507;

	/**
	 * 非通行证账户不允许绑定
	 */
	int IS_NOT_IDM_ACCOUNT = 245810;

	/**
	 * 无法进行融合打包销售
	 */
	int NO_FUSION_PACKAGED_FOR_SALE = 248512;

	/**
	 * 无可推荐的图书
	 */
	int NO_RECOMMENDED_BOOKS = 248513;

	/**
	 * 图书鉴权错误
	 */
	int CONTENT_AUTHENTICATE_ERROR = 248514;

	/**
	 * 用户解绑的号码不是用户当前绑定的移动手机号
	 */
	int MSISDN_IS_NOT_MATCH_PAYMSISDN = 248508;

	/**
	 * VGOP开关已关闭
	 */
	int VGOP_SWITCH_IS_CLOSED = 245820;

	/**
	 * 绑定号码数量超限
	 */
	int BIND_NUM_OUT = 226666;

	/**
	 * 使用号码与支付号码相同
	 */
	int MSISDN_PAYMSISDN_SAME = 226667;

	/**
	 * 活动信息不存在
	 */
	int NO_ACTIVITY_INFO = 860001;

	/**
	 * 无有效的推荐图书
	 */
	int NO_RECOMMEND_BOOK = 860002;

	/**
	 * 图书列表中包含不能打包的图书
	 */
	int CONTAIN_INVALID_BOOK = 860003;

	/**
	 * 没有下一页了
	 */
	int NO_NEXT_BOOK = 860004;

	/**
	 * 已选择的图书达到上限
	 */
	int REACHED_BOOK_LIMIT = 860005;

	/**
	 * 订购失败
	 */
	int PURCHASE_FAIL = 860006;

	/**
	 * 其他异常
	 */
	int OTHER_EXCEPTION = 860008;

	/**
	 * 推荐人非法
	 */
	int RECOM_PERSON_FAIL = 860010;

	/**
	 * 书券余额不足
	 */
	int USER_TICKET_NOT_ENOUGH = 22725;

	/**
	 * 用户余额不足
	 */
	int USER_BALANCE_NOT_ENOUGH = 25939;

	/**
	 * 获取accesstoken失败
	 */
	int QUERY_ACCESS_TOKEN_FAIL = 25940;

	/**
	 * 获取用户余额失败
	 */
	int QUERY_USERBALANCE_FAIL = 25941;

	/**
	 * 该条数据已存在
	 */
	int DATA_ALREADY_EXISTS = 275601;

	/**
	 * 该条数据不存在
	 */
	int DATA_NOT_EXISTS = 275602;

	/**
	 * 收藏超过最大条数
	 */
	int COLLECTION_MORE_MAXNUM = 275603;

	/**
	 * 您尚未收藏该品牌(包)
	 */
	int NOT_COLLECTION_MAGAZINE = 275604;

	/**
	 * 事务已失效
	 */
	int TRANSACTION_INVALID = 28021;

	/**
	 * 事务已过期
	 */
	int TRANSACTION_OVERDUE = 28022;

	/**
	 * 事务已回访
	 */
	int TRANSACTION_CALL = 28023;

	/**
	 * 事务已触发
	 */
	int TRANSACTION_TRIGGER = 28024;

	/**
	 * 无效的流量类型
	 */
	int INVALID_FLOWTYPE = 28025;

	/**
	 * 鉴权通过原因:整本定购过
	 */
	int AUTHENTICATE_BOOK_SUBSCRIBED = 1;

	/**
	 * 短信下发流控
	 */
	int SMS_FLOW_LIMIT = 28026;

	/**
	 * 鉴权失败
	 */
	int AUTHENTICATE_FAIL = -1;

	/**
	 * 鉴权成功，好友借阅过
	 */
	int AUTH_SUCCESS_BOOK_FRIEND_BORROW = 4;

	/**
	 * source是空
	 */
	int SOURCE_IS_NULL = 300001;

	/**
	 * borrowtimes是空
	 */
	int BORROWTIMES_IS_NULL = 300002;

	/**
	 * effectiveTime是空
	 */
	int EFFECTIVETIME_IS_NULL = 300003;

	/**
	 * expireTime是空
	 */
	int EXPIRETIME_IS_NULL = 300004;

	/**
	 * BorrowTicket新增错误
	 */
	int BORROWTICKET_ADD_ERROR = 300005;

	/**
	 * 通讯录好友为空
	 */
	int ADDRESS_FRIENDS_IS_NULL = 274001;

	/**
	 * 支付中心的异常码
	 * 
	 * @author xWX213066
	 * @version 重构穿刺 2014-8-5
	 * @since 重构穿刺
	 */
	public interface PaymentResultCode
	{
		/**
		 * 成功
		 */
		String SUCCESS = "00000000";

		/**
		 * 书券余额不足
		 */
		String USER_TICKET_NOT_ENOUGH = "9206";

		/**
		 * 用户余额不足
		 */
		String USER_BALANCE_NOT_ENOUGH = "3101";

		/**
		 * 余额不足
		 */
		String BALANCE_NOT_ENOUGH = "11002503";

		/**
		 * 单日话费打赏超上限
		 */
		String REWARD_BOOK_BY_FEE_DAY_CEIL = "11002513";
	}

	/**
	 * batchSendTickets(系统主动推送书券)接口，参数错误
	 */
	int PARAMETER_ERROR = 8001;

	/**
	 * batchSendTickets(系统主动推送书券)接口，其他错误
	 */
	int OTHER_ERROR = 8999;

	/**
	 * batchSendTickets(系统主动推送书券)数据库错误
	 */
	int TICKETS_DB_ERROR = 8091;

	/**
	 * 规避SERVER重构版本和门户重构版本不配套
	 */
	int ACTIVITY_AND_USER_PAYTYPES_NO_INTERSECTION = 22650;

	/**
	 * 变更渠道不存在
	 */
	int EXCHANGE_CHANNEL_NOEXIST = 28200;

	/**
	 * 变更失败
	 */
	int EXCHANGE_FAIIL = 28301;

	/**
	 * 变更类型错误
	 */
	int EXCHANGE_TYPE_INVALID = 28300;

	/**
	 * 产品状态异常
	 */
	int GUESSPRODUCT_STATUS_INVAL = 22646;

	/**
	 * 专区下不存在产品
	 */
	int CATALOG_NOT_PRODUCT = 21121;

	/**
	 * 商品列表数量超出最大值
	 */
	int GUESSPRODUCT_LIST_GREAT_MAX = 22645;

	/**
	 * 订购虚拟商品频率超过时间限制
	 */
	int GUESSPRODUCT_SUBSCRIBE_TIME_GREAT_LIMIT = 22652;

	/**
	 * 兑换的时间超过渠道发放截止日期
	 */
	int OVER_DATE_EXCHANGE = 28100;

	/**
	 * 兑换的金额超过渠道发放的总金额
	 */
	int OVER_AMOUNT_EXCHANGE = 28000;

	/**
	 * 用户兑换金额超过配置的最大兑换金额
	 */
	int OVER_MAXAMOUNT = 28302;

	/**
	 * 订购时间超过商品有效期
	 */
	int SUBSCRIBE_TIME_INVAL = 22647;

	/**
	 * 测试号码不能订购
	 */
	int TEST_MSSIDN_NOTSUBSCRBE = 22643;

	/**
	 * 绑定的支付号为测试号码时，不能订购
	 */
	int TESTUSERORBOSSROLL_PAYMSISDN_NOTSUBSCRBE = 22651;

	/**
	 * 用户累计订购数量超过单用户最大购买数量
	 */
	int USER_TOTAL_SUSCRIBE_AMOUNT_GREAT_MAX = 22649;

	/**
	 * 和阅读业务暂停
	 */
	int READBOOK_STOP = 25718;

	/**
	 * 无号码地域信息
	 */
	int NO_SEGMENTINFO = 25301;

	/**
	 * ACCOUNTNAME为空
	 */
	int ACCOUNTNAME_IS_NULL = 239802;

	/**
	 * ACCOUNTTYPE为空
	 */
	int ACCOUNTTYPE_IS_NULL = 239803;

	/**
	 * IDENTITYID为空
	 */
	int IDENTITYID_IS_NULL = 239805;

	/**
	 * 获取用户中心的用户名是否重复返回信息为空
	 */
	int GET_USER_INFOMATION_EXISE_IS_NULL = 600001;

	/**
	 * 到支付中心绑定用户账号失败
	 */
	int GET_PAYMENT_ACCOUNT_BIND_INFO_IS_NULL = 600004;

	/**
	 * 加密密码失败
	 */
	int ENCRYPT_PASSWORD_IS_WRONG = 600005;

	/**
	 * 绑定账号已经存在(用户中心)
	 */
	int ADD_WEIBO_TOKEN_EXIST_USER_PROFRE = 23013001;

	/**
	 * 批量插入系统书签失败
	 */
	int BATCH_ADD_SYS_BOOKMARK_FAIL = 600008;

	/**
	 * 书项没有卷信息
	 */
	int BOOK_VOLUMES_IS_NULL = 24605;

	/**
	 * 从公共组件中心获取批量插入书签响应为空
	 */
	int GET_ADD_SYSMARK_RESPONSE_IS_NULL = 600007;

	/**
	 * 不在合约有效期内
	 */
	int NOT_INT_CONTRACT_VALID_DATE = 20231;

	/**
	 * 非移账号未绑定支付号时不允许抽奖
	 */
	int NO_CMCC_AND_BINDPAYMSISDN = 281500;

	/**
	 * 获取分册信息响应为空
	 */
	int GET_FASCICULE_CHAPTERS_RESPONSE_IS_NULL = 600009;

	/**
	 * 获取subscribe中心的合约信息为空
	 */
	int GET_SUBSCIBE_CONTRACT_CONTENT_IS_NULL = 600000;

	/**
	 * 获取content中心的内容信息为空
	 */
	int GET_CONTENT_CONTRACT_CONTENT_IS_NULL = 700000;

	/**
	 * 到支付中心绑定用户支付账号失败
	 */
	int GET_BIND_PAYMSISDN_INFO_IS_NULL = 600010;

	/**
	 * 支付渠道不是Integer型
	 */
	int PAY_CHANNEL_NOT_INTEGER = 600016;

	/**
	 * 支付总额不是LONG型
	 */
	int FEE_NOT_LONG = 600017;

	/**
	 * 不是Integer型
	 */
	int PAY_TYPE_NOT_INTEGER = 600018;

	/**
	 * 支付金额不是Integer型
	 */
	int REAL_FEE_NOT_INTEGER = 600019;

	/**
	 * 支付单价不是Long型
	 */
	int UNIT_PRICE_NOT_LONG = 600020;

	/**
	 * 创建订单错误
	 */
	int RESPONSE_FROM_ORDER_IS_ERROR = 900000;

	/**
	 * 支付中心同步账号发生异常
	 */
	int PAYMENT_ERROR = 25605;

	/**
	 * TXID不存在
	 */
	int TXID_NOT_EXIST = 59004;

	/**
	 * 验证码不存在
	 */
	int VERFIY_CODE_NOT_EXIST = 600035;

	/**
	 * 书券余额不足
	 */
	int TICKET_NOT_ENOUGH = 22725;

	/**
	 * 闪电注册，重置密码失败
	 */
	int REG_RESETPASSWORD_FAILED = 600013;

	/**
	 * 更新用户信息失败
	 */
	int REG_INCREMENTALUPDATEUSERINFO_FAILED = 600014;

	/**
	 * 闪电注册，发送短信失败
	 */
	int REG_SEND_MESSAGE_FAILED = 600015;

	/**
	 * 获取章节信息失败
	 */
	int GET_CHAPTERINFOS_FAILED = 600013;

	/**
	 * 获取激活链接失败
	 */
	int GET_ACTIVEURL_FAIL = 25302;

	/**
	 * *参数非法***
	 */
	int PARAMETER_IS_ERROR = 700021;

	/**
	 * 获取章节批量鉴权响应为空
	 */
	int GET_BATH_AUTH_RESPONSE_IS_NULL = 600011;

	/**
	 * 规则适配失败
	 */
	int ADAPTATION_FAILURE = 11001;

	/**
	 * 规则适配失败原因：规则不存在或无效
	 */
	int FAIL_REASON_STATUS = 11000;

	/**
	 * 创建账号相关会话失败
	 */
	int CREATE_ACCOUNT_REL_SESSION_FAILED = 600011;

	/**
	 * 待加密内容为空（供测试使用）
	 */
	int ENCRYPT_CONTENT_IS_NULL = 9527250;

	/**
	 * 加密内容失败（供测试使用）
	 */
	int ENCRYPT_CONTENT_FAIL = 9527251;

	/**
	 * 规则适配失败原因：用户组不匹配
	 */
	int FAIL_REASON_GROUP = 40000;

	/**
	 * 规则适配失败原因：内置用户组不匹配
	 */
	int FAIL_REASON_BUILDINGROUP = 40001;

	/**
	 * 规则适配失败原因：包月规则不匹配
	 */
	int FAIL_REASON_MONTHRULE = 80004;

	/**
	 * 规则适配失败原因：门户类型不匹配
	 */
	int FAIL_REASON_PORTAL = 60000;

	/**
	 * 获取计费中心免费资源为空
	 */
	int GET_CHARGE_FREE_RESOURCE_IS_NULL = 600007;

	/**
	 * 获取用户中心的内容信息为空
	 */
	int GET_USER_CONTRACT_CONTENT_IS_NULL = 800000;

	/**
	 * 修改密码时密码错误
	 */
	int MODIFY_PASSWORD_FAIL = 23010916;

	/**
	 * 一次性订购周期数不能超过订购的最大周期数
	 */
	int NOT_MORE_THAN_MAX_CYCLE = 20232;

	/**
	 * 成功
	 */
	int OK_USER_PROFRE = 0;

	/**
	 * 重置密码超限
	 */
	int REACHED_MAX_TIMES = 800206;

	/**
	 * 获取私人定制图书列表开关关闭
	 */
	int CUSTOMIZATION_SWITCH_CLOSED = 239012;

	/**
	 * 获取私人定制图书列表,传入的类型参数不合法
	 */
	int PRRSON_QUERY_TYPE_ERROR = 239011;

	/**
	 * 
	 * 用户中心的异常码
	 * 
	 * @author lWX180672
	 * @version 重构穿刺 2014-7-9
	 * @since 重构穿刺
	 */
	public interface UpResultCode
	{
		/**
		 * 密码错误
		 */
		String PASSWORD_IS_ERROR = "23010916";

		/**
		 * token鉴权失败
		 */
		String TOKEN_AUTHENTICATE_FAILED = "23913016";

		/**
		 * token不存在
		 */
		String TOKEN_AUTHENTICATE_NON_EXISTENT = "2009001";

		/**
		 * token过期
		 */
		String TOKEN_AUTHENTICATE_EXPIRE = "2009003";

		/**
		 * 连续密码错误次数达到最大限制，账号将被锁定
		 */
		String PASSWORD_IS_ERROR_USER_ISLOCKED = "23013012";

		/**
		 * 用户待激活状态
		 */
		String REG_USERSTATE_WAIT_ACTIVATE = "23013014";

		/**
		 * 帐号已锁定
		 */
		String VGOP_ACCOUNT_LOCKED = "23013013";

		/**
		 * 用户不存在
		 */
		String PASSPORTID_NOT_EXIST = "23011001";

		/**
		 * 用户已存在
		 */
		String USER_IS_EXISTS = "23010901";

		/**
		 * 账号已存在
		 */
		String ACCOUNT_IS_EXISTS = "23013001";

		/**
		 * 昵称已存在
		 */
		String NICKNAME_IS_EXISTS = "23913021";

		/**
		 * 验证码校验失败
		 */
		String VERIFICATIONCODE_AUTHENTICATE_FAILED = "23013005";
	}

	/**
	 * 
	 * 能力中心(内容中心)异常码
	 * 
	 * @author wWX190303
	 * @version C10 2014-7-22
	 * @since SDP V300R003C10
	 */
	public interface ContentResultCode
	{
		/**
		 * 内容中心专区id不存在
		 */
		String CATEGORYID_NOT_FOUND = "1050030001";
	}

	/**
	 * 
	 * 能力中心(公共能力中心)异常码
	 * 
	 * @author wWX237647
	 * @version C10 2015-3-18
	 * @since SDP V100R001C01LCM101
	 */
	public interface CommonResultCode
	{
		/**
		 * 非法参数
		 */
		String INVALID_PARAM = "1080000000";

		/**
		 * 超出用户定制最大值
		 */
		String USER_CUSTOMIZED_REACH_MAXCOUNT = "1080001004";
	}

	/**
	 * 
	 * 与DSF交互的错误码
	 * 
	 * @author sWX149481
	 * @version CMR23 2014-6-3
	 * @since V100R001C01LCM024
	 */
	public interface SystemCode
	{
		/**
		 * 获取DSF上下文为空 ContractService
		 */
		int APPLICATION_CONTEXT_CODE_IS_NULL = 400000;

		/**
		 * 获取subscribe中心的合约信息服务为空
		 */
		int GET_SUBSCRIBE_CONTRACT_SERVICE_IS_NULL = 400001;

		/**
		 * 获取用户中心IUserService服务为空
		 */
		int GET_USER_INFOMATION_SERVICE_IS_NULL = 400002;

		/**
		 * 获取用户中心ISessionService服务为空
		 */
		int GET_USER_SESSION_SERVICE_IS_NULL = 400003;

		/**
		 * 获取content中心的信息服务为空
		 */
		int GET_CONTENT_CONTRACT_SERVICE_IS_NULL = 500001;

		/**
		 * 获取payment能力中心PaymentServices服务为空
		 */
		int GET_PAYMENT_SERVICE_IS_NULL = 400003;

		/**
		 * 获取公共组件中心SysBookmarkService服务为空
		 */
		int GET_SYS_COMMOM_SERVICE_IS_NULL = 400004;

		/**
		 * 获取charge中心的FreeResourceManagerService服务为空
		 */
		int GET_CHARGE_FREE_RESOURCE_MANAGER_SERVICE_IS_NULL = 400005;

		/**
		 * 获取order中心的OrderManagementService服务为空
		 */
		int GET_ORDERMANAGEMENT_SERVICE_IS_NULL = 400006;

		/**
		 * 获取iserver的服务为空
		 */
		int GET_SERVICE_FROM_ISERVER_IS_NULL = 400007;

		/**
		 * 获取user中心ITokenService服务为空
		 */
		int GET_ITOKEN_SERVICE_IS_NULL = 40008;

		/**
		 * 获取iSessionService的服务为空
		 */
		int GET_ISESSIONSERVICE_FROM_UP_IS_NULL = 400008;

		/**
		 * 从公共能力组件获取service为空
		 */
		int GET_SERVICE_FROM_COMMONSERVICE_IS_NULL = 400009;

		/**
		 * 从公共能力组件站内信获取没有删除的数据
		 */
		String COMMON_MSG_NOT_EXIST = "1080003001";

	}

	/**
	 * 
	 * sig返回码
	 * 
	 * @author zWX238004
	 * @version C10 2014年9月16日
	 * @since SDP V300R003C10
	 */
	public interface SigResultCode
	{
		/**
		 * 成功返回码
		 */
		int CODE_SUCCESS = 0;

		/**
		 * 失败返回码
		 */
		int CODE_FAILURE = 1;

		/**
		 * 请求非法
		 */

		int REQUEST_ILLEGAL = 10001;

		/**
		 * 重复订购
		 */
		int REPEAT_ORDER_CONTENT = 10005;

		/**
		 * 重复收藏
		 */
		int REPEAT_FAVORITE_CONTENT = 10006;

		/**
		 * Timestamp格式错
		 */
		int MESSAGE_TIMESTAMP_ERROR = 1009;

		/**
		 * 发送请求消息携带的token在数据库中不存在
		 */
		int MESSAGE_ACCESSTOKEN_ERROR = 2221;

		/**
		 * 参数无效
		 */
		int PARAMETER_INVALIED_CODE = 10002;

		/**
		 * 操作标识错误
		 */
		int OPERATION_INDENTIFY_TYPE_ERROR = 10007;

		/**
		 * 无效的手机号码
		 */
		int INVALIED_MOBILE_NUMBER = 10003;

		/**
		 * 无效的标识
		 */
		int INVALIED_CONTENT_INDENTIFY = 10004;

		/**
		 * Token无效
		 */
		int TOKEN_INVILAID_ERROR = 2005;

		/**
		 * 无对应的ToKen
		 */
		int MESSAGE_NO_TOKEN_ERROR = 2221;

		/**
		 * token异常
		 */
		int ACCESSTOKEN_EXCEPTION_CODE = 2213;

		/**
		 * 获取目标平台或者网关token格式不匹配
		 */
		int PID_ACCESSTOKEN_FORMAT_ERROR = 1018;

		/**
		 * token格式不匹配
		 */
		int ACCESSTOKEN_FORMAT_ERROR = 1012;

		/**
		 * 执行成功，可以获取数据
		 */
		int FETION_SUCCESS = 200;

		/**
		 * 请求不合法（心情短语超长-超过70个字，请求字段输入错误）
		 */
		int REQUEST_ILLEGAL_ERROR = 400;

		/**
		 * 用户未授权
		 */
		int USER_ILLEGAL_ERROR = 401;

		/**
		 * 用户不存在
		 */
		int USER_NOT_EXIST_ERROR = 404;

		/**
		 * 服务器内部错误
		 */
		int SERVER_ERROR = 500;

		/**
		 * 其他错误
		 */
		int OTHER_ERROR = 900;

	}

	/**
	 * 计费代码类型不正确
	 */
	int RDO_NO_FEECODETYPE = 288003;

	/**
	 * 计费代码无对应的密钥
	 */
	int RDO_NO_FEECODEKEY = 288002;

	/**
	 * RDO不支持短代
	 */
	int RDO_NO_SMSAGENT = 288001;

	/**
	 * 参数不为空，或者超过限制范围
	 */
	int PARAM_CHECKED_ERROR = 29085;

	/**
	 * 用户已经注册
	 */
	int USER_HAD_REGISTER = 25600;

	/**
	 * 用户鉴权密码错误次数达到临界值，账号被锁定
	 */
	int USER_HAD_LOCKED_IN_TOP = 288569;

	/**
	 * 提交订单失败
	 */
	int PAY_ORDER_FAILE = 1030030005;

	/**
	 * 
	 * 用户收藏错误码
	 * 
	 * @author d00216865
	 * @version C10 2015-2-2
	 * @since SDP V300R003C10
	 */
	public interface FavoriteErrorCode
	{
		/**
		 * up错误码：用户收藏数目超过最大收藏数目限制
		 */
		String FAVORITE_IS_MAXCOUNT = "23024049";

		/**
		 * up错误码：用户已经收藏此目标
		 */
		String FAVORITE_IS_EXIST = "23024050";

		/**
		 * catagoryId为空
		 */
		int CATEGORYID_IS_NULL = 25051;

		/**
		 * radioId为空
		 */
		int RADIOID_IS_NULL = 25055;

		/**
		 * radioName为空
		 */
		int RADIONAME_IS_NULL = 25057;

		/**
		 * categoryName为空
		 */
		int CATEGORYNAME_IS_NULL = 25058;

		/**
		 * 用户收藏数目超过最大收藏数
		 */
		int FAVORITE_IS_MAX = 25059;

		/**
		 * 用户已经收藏此目标
		 */
		int FAVORITE_EXIST = 25060;

		/**
		 * 星期几,一周中的第几天异常（数据为空或者不是1-7之间的数字）
		 */
		int DAYOFWEEK_IS_NULL = 25061;

		/**
		 * 搜索关键字为空
		 */
		int SEARCH_KEYWORDS_IS_NULL = 26055;

		/**
		 * 电台节目类型为空
		 */
		int RADIO_PROGERAM_TYPE_IS_NULL = 25056;

	}

	/**************** Migu begin ***********************/
	/**
	 * 账号名为空
	 */
	int ACCOUNT_NAME_IS_NULL = 22906;

	/**
	 * 用户已经绑定同类型账号
	 */
	int BIND_SAME_TYPE_ACCOUNT = 22907;

	/**
	 * 需要升级为咪咕账号
	 */
	int NEED_UPGDATE_TO_MIGU = 22908;

	/**
	 * 咪咕无法换绑为非移动手机号
	 */
	int MIGU_CANT_SWITCHTO_NOTCMCC = 22909;

	/**
	 * 用户至少要保留一个绑定的账号
	 */
	int USER_NEED_BIND_ACCOUNT = 22910;

	/**
	 * migu鉴权失败
	 */
	int MIGU_AUTHENTICATE_ERROR = 22914;

	/**
	 * 统一认证token为空
	 */
	int MIGU_TOKEN_IS_NULL = 22901;

	/**
	 * 账号类型非法
	 */
	int INVALID_ACCOUNT_TYPE = 22922;

	/**
	 * 统一认证会话ID为空
	 */
	int MIGU_USESSIONID_IS_NULL = 22952;

	/**
	 * reviewId为空
	 */
	int REVIEWID_IS_NULL = 22929;

	/**
	 * 咪咕开关已关闭
	 */
	int MIGU_CLOSED = 22927;

	/**
	 * 统一认证开关关闭，不支持邮箱验证业务
	 */
	int MIGU_CLOSED_NOT＿SUPPORT_EMAIL = 22926;

	/**
	 * 请求邮箱验证码失败
	 */
	int GET_EMAIL_VALIDATION_INFO_FAILD = 22912;

	/**
	 * 请求短信验证码失败
	 */
	int GET_SMS_VARIFYCODE_FAILD = 22913;

	/**
	 * 非同一账号，不支持邮箱密码重置
	 */
	int NOT_MIGU_ACCOUNT = 22925;

	/**
	 * MIGU注册失败
	 */
	int MIGU_REGISTER_FAILED = 22919;

	/**
	 * 业务账号升级失败
	 */
	int SERVICE_PASSPORT_UPGRADE_FAILD = 22915;

	/**
	 * 获取咪咕密保问题失败
	 */
	int INQUIRY_SECURITY_LIST_FAILD = 22916;

	/**
	 * 设置咪咕密保问题失败
	 */
	int SET_SECURITY_ANSWER_FAILD = 22917;

	/**
	 * 验证密保问题失败
	 */
	int SECURITYANSWER_VALIDATE_FAILD = 22918;

	/**
	 * 密码强度校验不通过
	 */
	int MIGU_PASSWORD_STRONGTH_CHECK_NOT_THROUGH = 22920;

	/**
	 * 统一认证系统id为空
	 */
	int MIGU_PASSID_IS_NULL = 22951;

	/**
	 * 请求验证业务代码为空
	 */
	int BUSINESSID_IS_NULL = 22903;

	/**
	 * 请求验证业务代码不合法
	 */
	int BUSINESSID_IS_ILLEGAL = 22921;

	/**
	 * 基础URL为空
	 */
	int BASEURL_IS_NULL = 22958;

	/**
	 * 咪咕密保问题为空
	 */
	int MIGU_SECURITY_QUESTION_IS_NULL = 22954;

	/**
	 * 咪咕密保答案为空
	 */
	int MIGU_SECURITY_ANSWER_IS_NULL = 22955;

	/**
	 * 密保问题列表条目数不为3
	 */
	int MIGU_SECURITY_NUMBER_NOT_THREE = 22930;

	/**
	 * sessionid为空
	 */
	int SESSIONID_IS_NULL = 22902;

	/**
	 * mcp传入为空
	 */
	int NO_BOOK_MCPID = 318701;

	/**
	 * 验证类型为空
	 */
	int VALIDTYPE_IS_NULL = 22904;

	/**
	 * 验证码为空
	 */
	int VALIDCODE_IS_NULL = 22905;

	/**
	 * 入参全为空
	 */
	int PARAMTER_IS_NULL = 22924;

	/**
	 * 报活参数校验不通过
	 */
	int ACTIVE_PARAMTER_NOT_VALID = 22923;

	/**************** Migu end ***********************/

	/**
	 * 订购数量应为整数
	 */
	int SUBSCRIBE_NUM_SHOULD_INTEGER = 22644;

	/**
	 * 单次购买单个商品的注数无效（<=0）
	 */
	int GUESSPRODUCT_AMOUNT_INVAL = 22648;

	/**
	 * 查询两个好友之间私信时，需要两个好友的身份
	 */
	int RECMSISDN_OR_SENDMSISDN_IS_NULL = 90020;

	/**
	 * 查询用户好友间站内信类型异常(非数字或者不是1、2)
	 */
	int QUERYTYPE_IS_ERROR = 90021;

	/**
	 * 站内信编号和身份ID都为空
	 */
	int MSGIDS_AND_IDENTITYID_IS_NULL = 90022;

	/**
	 * 计费码省份被屏蔽
	 */
	int RDO_PROVINCEID_BLOCKED_ERROR = 90010;

	/**
	 * 计费码渠道被屏蔽
	 */
	int RDO_CHANNELID_BLOCKED_ERROR = 90011;

	/**
	 * 计费码省份、渠道都被屏蔽
	 */
	int RDO_CHANNELID_AND_PROVINCEID_BLOCKED_ERROR = 90012;

	/**
	 * 推荐人和被推荐人是同一个人
	 */
	int SRCMDN_EQ_DESTMDN = 500101;

}
