<md-dialog aria-label="ログイン">
  <form>
  <md-toolbar>
    <div class="md-toolbar-tools">
      <h2>ログイン</h2>
      <span flex></span>
      <md-button class="md-icon-button" ng-click="answer('not applicable')">
        <md-icon md-svg-src="img/icon/ic_clear_white_24px.svg" aria-label="Close dialog"></md-icon>
      </md-button>
    </div>
  </md-toolbar>
  <md-dialog-content style="min-width:400px;min-height:200px; ">
    <div>
      <md-input-container>
        <md-icon md-svg-src="img/icon/ic_email_black_24px.svg"></md-icon>
        <input ng-model="login.email" type="email" placeholder="メールアドレス">
      </md-input-container>
      <md-input-container>
        <md-icon md-svg-src="img/icon/ic_vpn_key_black_24px.svg"></md-icon>
        <input ng-model="login.password" type="password" placeholder="パスワード">
      </md-input-container>
      <div>
        <md-checkbox ng-model="login.isSave">ログイン情報を保持する</md-checkbox>
      </div>
    </div>
  </md-dialog-content>
  <div class="md-actions" layout="row">
    <md-button ng-click="answer('not useful')">
     ログイン
    </md-button>
  </div>
  </form>
</md-dialog>