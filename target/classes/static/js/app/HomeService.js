 var serviceModule=  angular.module('DPSServices', [])
serviceModule.factory('HomeService', ["$http",function($http,$location) {
    var service = {};
    service.home = function() {
        var url = "home";
        return $http.get(url);
    }




      service.validate = function(value) {
        console.log("validate");
        var req = {
            method: 'POST',
            url: 'validate',
         params: { value: value }
        }
         return $http(req);
        }

    return service;
}]);