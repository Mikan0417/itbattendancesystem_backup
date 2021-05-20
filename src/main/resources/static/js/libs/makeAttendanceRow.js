class MakeAttendanceRow {
  constructor( tableRowEl ) {
      this.DOM = {};
      this.DOM.tableRowEl = document.querySelector(tableRowEl);
      this.DOM.yearOptionEls = document.querySelectorAll('.year-select-option');
      if ( this.DOM.tableRowEl !== null && this.DOM.yearOptionEls !== null ) {
        this.date = new Date();
        this.thisYear = "";
        this.leapYearFlg = false;
        this._jdgLeapYear();
        this._getThisYear();
        this.thisMonth = (this.date.getMonth() + 1);
        this.maxDay = 31;
        this._getMaxDay();
        this.dayAry = [];
        this._makeDayAry();
        this.record = "";
        this.weekAry = ["日", "月", "火", "水", "木", "金", "土"];
        this._makeRecord();
        this.DOM.tableRowEl.innerHTML = this.record;
      }
  }

  _getThisYear() {
      this.DOM.yearOptionEls.forEach( yearOptionEl => {
          if( yearOptionEl.hasAttribute('selected') ) {
              this.thisYear = yearOptionEl.innerHTML;
          }
      } )
  }

  _jdgLeapYear() {
      if( Number(this.thisYear) % 4 === 0 ) {
          this.leapYearFlg = true;
          if ( Number(this.thisYear) % 100 === 0 && Number(this.thisYear) % 400 !== 0 ) {
              this.leapYearFlg = false;
          }
      }
  }

  _getMaxDay() {

      if ( this.thisMonth === 2 ) {

          if ( this.leapYearFlg ) {
              this.maxDay = 29;
          } else {
              this.maxDay = 28;
          }

      } else if ( this.thisMonth === 4
                  || this.thisMonth === 6
                  || this.thisMonth === 11 ) {
          this.maxDay = 30;
      } else {
          this.maxDay = 31;
      }   
  }

  _makeDayAry() {
      for( var i = 1; i <= this.maxDay; i++ ) {
          this.dayAry.push(i);
      }
  }

  _makeRecord() {
      this.record = this.dayAry.reduce( this._makeRecordCb.bind(this) , "");
  }

  _makeRecordCb(accumulator, currentValue) {
      var dateTmp = new Date(this.thisYear + "/" + this.thisMonth + "/" + currentValue);
      var recordTmp = accumulator
                          + "<tr>\n"
                          + "<td>\n"
                          + `<input type=\"text\" value=\"${this.thisMonth}/${currentValue}\">\n`
                          + "</td>\n"
                          + "<td>\n"
                          + `<input type=\"text\" value=\"${this.weekAry[dateTmp.getDay()]}\">\n`
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "<td>\n"
                          + "<input type=\"text\">\n"
                          + "</td>\n"
                          + "</tr>\n";
      return recordTmp;
  }
}