(function (angular) {
    angular.module("app", [])
        // Thanks to http://stackoverflow.com/a/24090733/999865
        .directive('elastic', [
            '$timeout',
            function ($timeout) {
                return {
                    restrict: 'A',
                    link: function ($scope, element) {
                        $scope.initialHeight = $scope.initialHeight || element[0].style.height;
                        var resize = function () {
                            element[0].style.height = $scope.initialHeight;
                            element[0].style.height = "" + element[0].scrollHeight + "px";
                        };
                        element.on("input change", resize);
                        $timeout(resize, 0);
                    }
                };
            }
        ])
        .directive('eval', function () {
            function evalCode(code) {
                try {
                    return JSON.stringify(eval(code));
                } catch (exception) {
                    return exception + "";
                }
            }

            return {
                link: function (scope, element, attributes) {
                    var control = false;
                    var textarea = element.find("textarea");
                    var codeArea = element.find("pre");

                    textarea.on("keypress", function (e) {
                        if (e.ctrlKey && e.key === "Enter") {
                            codeArea[0].innerHTML = evalCode(element.find("textarea")[0].value)
                        } else if (e.key === "Escape") {
                            element[0].blur()
                        }
                    });
                },
                template: function (element) {
                    var code = element.html();
                    return '<div class="eval-block">' +
                        '<textarea elastic class="twelve columns">' + code + '</textarea>' +
                        '<pre class="twelve columns"></pre>' +
                        '</div>'
                }
            };
        })
        .controller("MainController", function($scope) {
        });

})(window.angular);
