const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmw52wu/",
            name: "ssmw52wu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmw52wu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生知识成果展示与交流小程序"
        } 
    }
}
export default base
