class HiddenLogout {
    constructor(el) {
        this.DOM = {}
        this.DOM.el = document.querySelector(el)
        this._hiddenLogout()
    }

    _hiddenLogout() {
        if ( location.pathname === '/attendance/attendance.main/templates/login/login.html' ) {
            this.DOM.el.classList.add('class-for-hidden')
        }
    }
}