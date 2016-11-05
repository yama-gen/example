'use strict';

var app = angular.module('app', ['ngResource', 'ngMaterial']);

app.controller('AppCtrl', ['$scope', '$mdDialog', 'TaskResource', function($scope, $mdDialog, TaskResource) {
    $scope.tasks = TaskResource.query();

    $scope.showDialog = function(ev) {
        $mdDialog.show({
          controller: DialogCtrl,
          templateUrl: 'dialog.tpl',
          parent: angular.element(document.body),
          targetEvent: ev,
          clickOutsideToClose:true,
          fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
        })
        .then(function(answer) {
          $scope.status = 'You said the information was "' + answer + '".';
        }, function() {
          $scope.status = 'You cancelled the dialog.';
        });
      };


    $scope.register = function() {
        TaskResource.save($scope.task, function() {
            $scope.tasks = TaskResource.query();
            $scope.task = '';
        });
    };

    $scope.update = function() {
        TaskResource.update($scope.task, function() {
            $scope.tasks = TaskResource.query();
            $scope.task = '';
        });
    };

    $scope.showUpdateModal = function(task) {
        $scope.task = task;
        $location.hash('create-task');
    };
}]);

app.controller('DialogCtrl', ['$scope', '$mdDialog', function ($scope, $mdDialog) {
    $scope.hide = function() {
        $mdDialog.hide();
    };

    $scope.cancel = function() {
        $mdDialog.cancel();
    };

    $scope.answer = function(answer) {
        $mdDialog.hide(answer);
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