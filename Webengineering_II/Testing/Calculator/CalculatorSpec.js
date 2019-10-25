describe("Calculator", function() {
    var calculator;
    beforeEach(function() {
        calculator = new Calculator(3, 4);
    });
    it("sum7", function() {
        expect(calculator.sum()).toEqual(7); //toBe(7) would Compare with ===
    });
    it("diff-1", function() {
        expect(calculator.diff()).toEqual(-1);
    });
    it("sumNot0", function() {
        expect(calculator.sum()).not.toEqual(0);
    });
    it("diffNot0", function() {
        expect(calculator.diff()).not.toEqual(0);
    });
});