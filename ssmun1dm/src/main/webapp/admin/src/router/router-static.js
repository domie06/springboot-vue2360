import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussyonghufenxiang from '@/views/modules/discussyonghufenxiang/list'
    import youhuihuodong from '@/views/modules/youhuihuodong/list'
    import meifaxinxi from '@/views/modules/meifaxinxi/list'
    import users from '@/views/modules/users/list'
    import yonghuyuyue from '@/views/modules/yonghuyuyue/list'
    import shangpuxinxi from '@/views/modules/shangpuxinxi/list'
    import discussyouhuihuodong from '@/views/modules/discussyouhuihuodong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import discussshangpuxinxi from '@/views/modules/discussshangpuxinxi/list'
    import discussmeifaxinxi from '@/views/modules/discussmeifaxinxi/list'
    import config from '@/views/modules/config/list'
    import yonghufenxiang from '@/views/modules/yonghufenxiang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '美发资讯',
        component: news
      }
          ,{
	path: '/discussyonghufenxiang',
        name: '用户分享评论',
        component: discussyonghufenxiang
      }
          ,{
	path: '/youhuihuodong',
        name: '优惠活动',
        component: youhuihuodong
      }
          ,{
	path: '/meifaxinxi',
        name: '美发信息',
        component: meifaxinxi
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/yonghuyuyue',
        name: '用户预约',
        component: yonghuyuyue
      }
          ,{
	path: '/shangpuxinxi',
        name: '商铺信息',
        component: shangpuxinxi
      }
          ,{
	path: '/discussyouhuihuodong',
        name: '优惠活动评论',
        component: discussyouhuihuodong
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/discussshangpuxinxi',
        name: '商铺信息评论',
        component: discussshangpuxinxi
      }
          ,{
	path: '/discussmeifaxinxi',
        name: '美发信息评论',
        component: discussmeifaxinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yonghufenxiang',
        name: '用户分享',
        component: yonghufenxiang
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
