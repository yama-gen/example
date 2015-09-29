'use strict';

var app = angular.module('app', ['ngResource', 'ui.router']);

app.config(["$stateProvider", "$urlRouterProvider", "$httpProvider", 
        function ($stateProvider, $urlRouterProvider, $httpProvider) {

    // IEのAJAXリクエストキャッシュを無効化
    if (!$httpProvider.defaults.headers.get) {
        $httpProvider.defaults.headers.get = {};
    }
    $httpProvider.defaults.headers.common['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.common['Pragma'] = 'no-cache';
    $httpProvider.defaults.headers.common['Expires'] = 0;
  
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

app.controller('AppCtrl', ['$scope', function($scope) {

    $scope.events = [
        { name: '第5回GFAM杯', startDatetime: '2015/10/10(土) 08:00', endDatetime: '2015/10/10(土) 16:00', place: '取手国際ゴルフ倶楽部', cost: '20,000', capacity: '20', participant: '14'},
        { name: 'バーベキュー', startDatetime: '2015/10/24(土) 10:00', endDatetime: '2015/10/25(日) 10:00', place: '小田原', cost: '5,000', capacity: '15', participant: '9'}
    ];
}]);


app.service('EventResource', function($resource) {
  return $resource(
    '/api/event/:id',
    {id: '@id'},
    {
      'get': {method:'GET'},
      'query': {method:'GET', isArray:true},
      'save': {method:'POST'},
      'update': {method:'PUT'},
      'delete': {method:'DELETE'}
    }
  );
});

app.factory('EventModel', function() {
    return {
        name: '',
        startDateTime: '',
        endDatetime: '',
        place: '',
        cost: '',
        capacity: '',
        participant: ''
    };
});
