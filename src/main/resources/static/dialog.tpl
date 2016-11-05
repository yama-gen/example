<md-dialog>
    <md-toolbar>
      <div class="md-toolbar-tools">
        <h2>タスク登録</h2>
        <span flex></span>
        <md-button class="md-icon-button" ng-click="cancel()">
          <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
        </md-button>
      </div>
    </md-toolbar>
    <md-dialog-content>
      <div class="md-dialog-content">
        <div layout-gt-sm="row">
          <md-input-container class="md-block" flex-gt-sm>
            <label>タスク名</label>
            <input ng-model="task.name">
          </md-input-container>
        </div>
        <div layout-gt-sm="row">
          <md-input-container class="md-block" flex-gt-sm>
            <label>ステータス</label>
            <input ng-model="task.status">
          </md-input-container>
        </div>
        <div layout-gt-sm="row">
          <md-input-container>
            <label>完了期限</label>
            <md-datepicker ng-model="task.deadline"></md-datepicker>
          </md-input-container>
        </div>
        <div layout-gt-sm="row">
          <md-input-container class="md-block">
            <label>詳細</label>
            <textarea ng-model="task.detail" md-maxlength="150" rows="5" md-select-on-focus></textarea>
          </md-input-container>
        </div>
      </div>
    </md-dialog-content>
    <md-dialog-actions layout="row">
      <md-button ng-click="register()">登録する</md-button>
    </md-dialog-actions>
</md-dialog>