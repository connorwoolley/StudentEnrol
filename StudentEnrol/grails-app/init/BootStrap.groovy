import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

	def course1=new Course(title:'Interactive Media with Animation',
	department:'Computing',
	description: 'filler text here',
	leader:'Joe Jojo',
	code:'IMA101',
	startDate:new Date('19/01/2015'),
	endDate:new Date('19/01/2020')).save()
    }
    def destroy = {
    }
}
