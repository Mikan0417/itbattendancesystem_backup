class GetMonthAndYear {
    constructor () {
        this.DOM = {}
        this.DOM.monthEls = document.querySelectorAll('.month-table-body-row-data');
        this.DOM.yearEls = document.querySelectorAll('.year-select-option')
        this.DOM.tableTitleEl = document.querySelector('.table_title')
        if ( this.DOM.monthEls !== null && this.DOM.yearEls !== null && this.DOM.tableTitleEl !== null ) {
            this._findSelectedMonth()
            this._findSelectedYear()
            this._makeTableTitle()
        }
    }

    _findSelectedMonth() {
        this.DOM.monthEls.forEach(el => {
            if (el.classList.contains('selected-month')) {
                this.thisMonth = el.innerHTML
            }
        });
    }

    _findSelectedYear() {
        this.DOM.yearEls.forEach( el => {
            if (el.hasAttribute('selected')) this.thisYear = el.innerHTML
        } )
    }

    _makeTableTitle() {
        this.DOM.tableTitleEl.innerHTML = `<h3 class=\"table-title-text\">${this.thisYear}年${this.thisMonth}月の勤怠</h3>`
    }
}