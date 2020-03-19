class FibPython :
	def check(int i) 
		long[] nums = new long[i + 1]
		if i <= 0:
			return 0
		return fillArr(i, nums)

	def fillArr(int i, long nums[]) {
		if i <= 1 :
			nums[i] = 0
			return nums[i]
		elif i == 2 :
			nums[i] = 1
			return nums[i]
		else :
			nums[i] = fillArr(i - 1, nums) + fillArr(i - 2, nums)
		return nums[i - 1] + nums[i - 2]
		
	gogo araferi gamiketebia es ori kodi maq da meore testershi ra shevcvalotqo testeri rauyavi