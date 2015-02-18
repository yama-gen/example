'use strict';

var app = angular.module('app', ['ngResource', 'ui.router','ngMaterial']);

app.config(["$stateProvider", "$urlRouterProvider", "$httpProvider", "$mdThemingProvider", 
        function ($stateProvider, $urlRouterProvider, $httpProvider, $mdThemingProvider) {

    // IEのAJAXリクエストキャッシュを無効化
    if (!$httpProvider.defaults.headers.get) {
        $httpProvider.defaults.headers.get = {};
    }

    $httpProvider.defaults.headers.common['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.common['Pragma'] = 'no-cache';
    $httpProvider.defaults.headers.common['Expires'] = 0;

    $mdThemingProvider.theme("default")
        .primaryPalette("indigo")
        .accentPalette("cyan");
  
    // インターセプタをプッシュ
    //$httpProvider.interceptors.push('ResponseErrorInterceptor');
  
    // 初期表示時、すべての郵便物ボックスを一覧表示する。
    //$urlRouterProvider.otherwise("/boxTree");
    // $stateProvider
    //   .state("boxTree", {
    //     url: "/boxTree",
    //     views: {
    //       "leftView": {
    //         templateUrl: "/tpl/letter-pc/boxTree.tpl.html",
    //         controller: "SearchBoxTreeController",
    //         resolve: {
    //           boxes: function(PlBox){
    //             return PlBox.get({target: 'boxTree'}).$promise;
    //           }
    //         }
    //       },
    //       "ctrlView": {
    //         templateUrl: "/tpl/letter-pc/mailListCtrl.tpl.html",
    //         controller: "SearchMailListCtrlController"
    //       },
    //       "centerView": {
    //         templateUrl: "/tpl/letter-pc/mailList.tpl.html",
    //         controller: "SearchMailListByBoxController",
    //         resolve: {
    //           mails: function(DgtPstFileItm, SearchConditionModel){
    //             return DgtPstFileItm.get({boxId: 'allMail', pageNumber: '1', sortId: SearchConditionModel.sortId}).$promise;
    //           }
    //         }
    //       }
    //     }
    //   });
}]);

app.controller('AppCtrl', ['$scope', function($scope){

    this.cals = [
        { "year" : "2014", "month" : "12", "day" : "28", "weekday" : "日", "holiday" : "" },
        { "year" : "2014", "month" : "12", "day" : "29", "weekday" : "月", "holiday" : "" },
        { "year" : "2014", "month" : "12", "day" : "30", "weekday" : "火", "holiday" : "" },
        { "year" : "2014", "month" : "12", "day" : "31", "weekday" : "水", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "01", "weekday" : "木", "holiday" : "元日" },
        { "year" : "2015", "month" : "01", "day" : "02", "weekday" : "金", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "03", "weekday" : "土", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "04", "weekday" : "日", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "05", "weekday" : "月", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "06", "weekday" : "火", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "07", "weekday" : "水", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "08", "weekday" : "木", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "09", "weekday" : "金", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "10", "weekday" : "土", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "11", "weekday" : "日", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "12", "weekday" : "月", "holiday" : "成人の日" },
        { "year" : "2015", "month" : "01", "day" : "13", "weekday" : "火", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "14", "weekday" : "水", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "15", "weekday" : "木", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "16", "weekday" : "金", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "17", "weekday" : "土", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "18", "weekday" : "日", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "19", "weekday" : "月", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "20", "weekday" : "火", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "21", "weekday" : "水", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "22", "weekday" : "木", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "23", "weekday" : "金", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "24", "weekday" : "土", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "25", "weekday" : "日", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "26", "weekday" : "月", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "27", "weekday" : "火", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "28", "weekday" : "水", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "29", "weekday" : "木", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "30", "weekday" : "金", "holiday" : "" },
        { "year" : "2015", "month" : "01", "day" : "31", "weekday" : "土", "holiday" : "" }
    ];
 
}]);

