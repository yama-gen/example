'use strict';

var app = angular.module('app', ['ngResource', 'ngMaterial']);

app.config(['$httpProvider', function($httpProvider) {
    // IEのAJAXリクエストキャッシュを無効化
    if (!$httpProvider.defaults.headers.get) {
        $httpProvider.defaults.headers.get = {};
    }
    $httpProvider.defaults.headers.common['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.common['Pragma'] = 'no-cache';
    $httpProvider.defaults.headers.common['Expires'] = 0;
}]);

app.controller('AppCtrl', ['$scope', 'TaskResource', function($scope, TaskResource) {
    $scope.tasks = TaskResource.query();

    $scope.addTask = function() {
        var task = {};
        task.taskId = '';
        task.name = '';
        task.status = '新規';
        task.deadline = '';
        task.detail = '';
        task.editable = true;
        $scope.tasks.push(task);
    };

    $scope.register = function() {
        TaskResource.save($scope.task, function() {
            $scope.tasks = TaskResource.query();
        });
    };

    $scope.update = function() {
        TaskResource.update($scope.task, function() {
            $scope.tasks = TaskResource.query();
        });
    };

    $scope.delete = function() {
        TaskResource.delete($scope.task, function() {
            $scope.tasks = TaskResource.query();
        });
    };
}]);

app.factory('TaskResource', function($resource) {
  return $resource(
    '/task/',
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