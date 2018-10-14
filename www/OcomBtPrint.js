var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'OcomBtPrint', 'coolMethod', [arg0]);
};

exports.bTPrintTest = function (arg0, success, error) {
    exec(success, error, 'OcomBtPrint', 'bTPrintTest', [arg0]);
};


exports.bTPrintTest = function (arg0, success, error) {
    exec(success, error, 'OcomBtPrint', 'isAvailable', [arg0]);
};