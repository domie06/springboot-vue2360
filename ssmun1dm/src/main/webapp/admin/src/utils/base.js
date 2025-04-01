const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmun1dm/",
            name: "ssmun1dm",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmun1dm/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "理发店会员管理系统"
        } 
    }
}
export default base
