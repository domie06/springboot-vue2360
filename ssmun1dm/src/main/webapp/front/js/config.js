
var projectName = '理发店会员管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '商铺信息',
	url: './pages/shangpuxinxi/list.html'
}, 
{
	name: '美发信息',
	url: './pages/meifaxinxi/list.html'
}, 
{
	name: '优惠活动',
	url: './pages/youhuihuodong/list.html'
}, 
{
	name: '用户分享',
	url: './pages/yonghufenxiang/list.html'
}, 

{
	name: '美发资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmun1dm/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"商铺信息","menuJump":"列表","tableName":"shangpuxinxi"}],"menu":"商铺信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"美发信息","menuJump":"列表","tableName":"meifaxinxi"}],"menu":"美发信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"优惠活动","menuJump":"列表","tableName":"youhuihuodong"}],"menu":"优惠活动管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"用户预约","menuJump":"列表","tableName":"yonghuyuyue"}],"menu":"用户预约管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"用户分享","menuJump":"列表","tableName":"yonghufenxiang"}],"menu":"用户分享管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"美发资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"商铺信息列表","menuJump":"列表","tableName":"shangpuxinxi"}],"menu":"商铺信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"美发信息列表","menuJump":"列表","tableName":"meifaxinxi"}],"menu":"美发信息模块"},{"child":[{"buttons":["查看"],"menu":"优惠活动列表","menuJump":"列表","tableName":"youhuihuodong"}],"menu":"优惠活动模块"},{"child":[{"buttons":["查看","修改","新增","删除"],"menu":"用户分享列表","menuJump":"列表","tableName":"yonghufenxiang"}],"menu":"用户分享模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"用户预约","menuJump":"列表","tableName":"yonghuyuyue"}],"menu":"用户预约管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"商铺信息列表","menuJump":"列表","tableName":"shangpuxinxi"}],"menu":"商铺信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"美发信息列表","menuJump":"列表","tableName":"meifaxinxi"}],"menu":"美发信息模块"},{"child":[{"buttons":["查看"],"menu":"优惠活动列表","menuJump":"列表","tableName":"youhuihuodong"}],"menu":"优惠活动模块"},{"child":[{"buttons":["查看","修改","新增","删除"],"menu":"用户分享列表","menuJump":"列表","tableName":"yonghufenxiang"}],"menu":"用户分享模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
