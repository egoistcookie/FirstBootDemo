new Vue({
    el: '#app',
    data: {
        username: '',
        password: '',
        error: ''
    },
    methods: {
        login() {
            axios.post('/auth/login', {
                username: this.username,
                password: this.password
            })
            .then(response => {
                if (response.status === 200) {
                    window.location.href = '/dashboard.html'; // 确保跳转到正确的静态资源路径
                }
            })
            .catch(error => {
                this.error = '用户名或密码错误';
            });
        }
    }
});