/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    count = 0;
    args.forEach(function () {count++});
    return count;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */