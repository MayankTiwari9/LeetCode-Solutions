/**
 * @param {string} blocks
 * @param {number} k
 * @return {number}
 */
var minimumRecolors = function(blocks, k) {
    let min = Infinity;
    let curr = 0;

    for (let i = 0; i < k; i++) {
        if (blocks[i] === 'W') {
            curr++;
        }
    }

    min = curr;

    for (let i = k; i < blocks.length; i++) {
        if (blocks[i - k] === 'W') {
            curr--;
        }
        if (blocks[i] === 'W') {
            curr++;
        }
        min = Math.min(min, curr);
    }
    return min;
};